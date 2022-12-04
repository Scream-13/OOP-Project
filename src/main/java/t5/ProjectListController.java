package t5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class ProjectListController extends home implements Initializable {

	@FXML
	private TreeView treeview;
	@FXML
	private TextField title;
	@FXML
	private TextField Port_Number;
	private Parent root;
	private ArrayList<Server> serverlist = new ArrayList<>();
	int portnumber = 0;

	TreeItem<String> rootItem = new TreeItem<>("Projects");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		File file = new File("Projects.txt");
		if (file.exists()) {
			File myObj = new File("Projects.txt");
			Scanner myReader = null;
			try {
				myReader = new Scanner(myObj);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				TreeItem<String> Item = new TreeItem<>(data);
				rootItem.getChildren().add(Item);
			}
		}
		treeview.setRoot(rootItem);

	}

	public void newProject(ActionEvent event) throws IOException {
		File file = new File("Projects.txt");
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw);
		portnumber = Integer.parseInt(Port_Number.getText());
		int t=portnumber;
		int c=0;
		while(t>0){
			c++;
			t=t/10;
		}
		if(c==4 && portnumber>1023){

			TreeItem<String> Item = new TreeItem<>(title.getText() + " (port :" + Integer.toString(portnumber) + ")");
			rootItem.getChildren().add(Item);
		
		pw.println(title.getText() + " (port :" + Integer.toString(portnumber) + ")");
		pw.close();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Server server = new Server(portnumber, title.getText() + ".txt");
				serverlist.add(server);
			}

		}).start();
		title.clear();
	}
	else{
		Alert a= new Alert(AlertType.NONE);
		a.setAlertType(AlertType.ERROR);
        	a.setContentText("Enter a valid portnumber greater than 1023");
        	a.show();
	}
	}

	public void joinProject(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Client.fxml"));
		root = loader.load();
		Stage childstage = new Stage();
		Scene scene = new Scene(root);
		childstage.setScene(scene);
		childstage.show();
	}

}
