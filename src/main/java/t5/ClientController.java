package t5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class ClientController extends Thread {

    @FXML
    private Button button_send;
    @FXML
    private TextField msgField;
    @FXML
    private TextField username;
    @FXML
    private TextArea msgRoom;
    @FXML
    private TextField port_number;
    @FXML
	static
    VBox vbox_messages = new VBox(20);
    @FXML
    private ScrollPane sp_main;
    
    BufferedReader reader;
    PrintWriter writer;
    Socket socket;
    
    private Parent root;
    private Scene scene;
    private Stage stage;

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//    	Scanner sc= new Scanner(System.in);
//    	System.out.println("Enter the username");
//    	username=sc.nextLine();
//        try{
//            client = new Client(new Socket("localhost", 1234),username);
//            System.out.println("Connected to Server");
//        }catch(IOException e){
//            e.printStackTrace();
//            System.out.println("Error creating Client ... ");
//        }
//
////        vbox_messages.heightProperty().addListener(new ChangeListener<Number>() {
////            @Override
////            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
////                sp_main.setVvalue((Double) newValue);
////            }
////        });
//
//        client.listenForMessage(vbox_messages);
//
//        button_send.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                String messageToSend = tf_message.getText();
//                if (!messageToSend.isEmpty()) {
//                    HBox hBox = new HBox();
//                    hBox.setAlignment(Pos.CENTER_RIGHT);
//
//                    hBox.setPadding(new Insets(5, 5, 5, 10));
//                    Text text = new Text(messageToSend);
//                    TextFlow textFlow = new TextFlow(text);
//                    textFlow.setStyle(
//                            "-fx-color: rgb(239, 242, 255);" +
//                                    "-fx-background-color: rgb(15, 125, 242);" +
//                                    "-fx-background-radius: 20px;");
//
//                    textFlow.setPadding(new Insets(5, 10, 5, 10));
//                    text.setFill(Color.color(0.934, 0.925, 0.996));
//
//                    hBox.getChildren().add(textFlow);
//                    vbox_messages.getChildren().add(hBox);
//
//                    client.sendMessage(messageToSend);
//                    tf_message.clear();
//                }
//            }
//        });
//    }
    
    public void connectSocket() {
        try {
            socket = new Socket("localhost", Integer.parseInt(port_number.getText()));
            System.out.println("Socket is connected with server!");
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println(username.getText().toUpperCase()+" joined the project"+"\n");
            this.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ProjectListController obj = new ProjectListController();
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                String msg = reader.readLine();
                String[] tokens = msg.split(" ");
                String cmd = tokens[0];
                System.out.println(cmd);
                String fullmsg = new String();
                for(int i = 1; i < tokens.length; i++) {
                    fullmsg=fullmsg+" "+tokens[i];
                }
                System.out.println(fullmsg); 
                msgRoom.appendText(cmd + "\n");
                msgRoom.appendText(fullmsg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void send() {
        String msg = msgField.getText();
        writer.println(username.getText() + ": " + msg);
        this.msgRoom.appendText(msg+"\n");
        msgField.setText("");
    }
    
    public void leave(ActionEvent event) throws IOException{
    	reader.close();
        writer.close();
        socket.close();
   	    Node node = (Node) event.getSource();
   	    stage= (Stage) node.getScene().getWindow();
   	    stage.close();
    }
    
    public void joinserver() {
    	connectSocket();
    }

}