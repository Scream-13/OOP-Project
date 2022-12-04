package t5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//import org.controlsfx.control.action.Action;

import java.io.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import java.util.Scanner;

public class WeeklyEvalInput implements Initializable {

    public static EvalVariables varis;


    @FXML private Button tableView = new Button();
    @FXML private Button update = new Button();

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private Label monday=new Label();
    @FXML private Label tuesday=new Label();
    @FXML private Label wednesday=new Label();
    @FXML private Label thursday=new Label();
    @FXML private Label friday=new Label();
    @FXML private Label saturday=new Label();
    @FXML private Label sunday=new Label();
    @FXML private Label e1=new Label();
    @FXML private Label e2=new Label();
    @FXML private Label s1=new Label();
    @FXML private Label s2=new Label();
    @FXML private Label d1=new Label();
    @FXML private Label d2=new Label();
    @FXML private Label wt1=new Label();
    @FXML private Label wt2=new Label();

    @FXML private TextField m1 = new TextField();
    @FXML private TextField m2 = new TextField();
    @FXML private TextField m3 = new TextField();
    @FXML private TextField m4 = new TextField();
    @FXML private TextField m5 = new TextField();
    @FXML private TextField m6 = new TextField();

    @FXML private TextField t1 = new TextField();
    @FXML private TextField t2 = new TextField();
    @FXML private TextField t3 = new TextField();
    @FXML private TextField t4 = new TextField();
    @FXML private TextField t5 = new TextField();
    @FXML private TextField t6 = new TextField();

    @FXML private TextField w1 = new TextField();
    @FXML private TextField w2 = new TextField();
    @FXML private TextField w3 = new TextField();
    @FXML private TextField w4 = new TextField();
    @FXML private TextField w5 = new TextField();
    @FXML private TextField w6 = new TextField();

    @FXML private TextField th1 = new TextField();
    @FXML private TextField th2 = new TextField();
    @FXML private TextField th3 = new TextField();
    @FXML private TextField th4 = new TextField();
    @FXML private TextField th5 = new TextField();
    @FXML private TextField th6 = new TextField();

    @FXML private TextField fr1 = new TextField();
    @FXML private TextField fr2 = new TextField();
    @FXML private TextField fr3 = new TextField();
    @FXML private TextField fr4 = new TextField();
    @FXML private TextField fr5 = new TextField();
    @FXML private TextField fr6 = new TextField();

    @FXML private TextField sat1 = new TextField();
    @FXML private TextField sat2 = new TextField();
    @FXML private TextField sat3 = new TextField();
    @FXML private TextField sat4 = new TextField();
    @FXML private TextField sat5 = new TextField();
    @FXML private TextField sat6 = new TextField();

    @FXML private TextField sun1 = new TextField();
    @FXML private TextField sun2 = new TextField();
    @FXML private TextField sun3 = new TextField();
    @FXML private TextField sun4 = new TextField();
    @FXML private TextField sun5 = new TextField();
    @FXML private TextField sun6 = new TextField();


    public void openEvalTableView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("WeeklyEvalTable.fxml"));
        root = loader.load();
        Node node = (Node) event.getSource();
        stage = (Stage) node.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

        public void processData (ActionEvent event) throws IOException
        {
            ArrayList<String> mon = new ArrayList<String>();
            mon.add(m1.getText());
            mon.add(m2.getText());
            mon.add(m3.getText());
            mon.add(m4.getText());
            mon.add(m5.getText());
            mon.add(m6.getText());
            mon.add(t1.getText());
            mon.add(t2.getText());
            mon.add(t3.getText());
            mon.add(t4.getText());
            mon.add(t5.getText());
            mon.add(t6.getText());
            mon.add(w1.getText());
            mon.add(w2.getText());
            mon.add(w3.getText());
            mon.add(w4.getText());
            mon.add(w5.getText());
            mon.add(w6.getText());
            mon.add(th1.getText());
            mon.add(th2.getText());
            mon.add(th3.getText());
            mon.add(th4.getText());
            mon.add(th5.getText());
            mon.add(th6.getText());
            mon.add(fr1.getText());
            mon.add(fr2.getText());
            mon.add(fr3.getText());
            mon.add(fr4.getText());
            mon.add(fr5.getText());
            mon.add(fr6.getText());
            mon.add(sat1.getText());
            mon.add(sat2.getText());
            mon.add(sat3.getText());
            mon.add(sat4.getText());
            mon.add(sat5.getText());
            mon.add(sat6.getText());
            mon.add(sun1.getText());
            mon.add(sun2.getText());
            mon.add(sun3.getText());
            mon.add(sun4.getText());
            mon.add(sun5.getText());
            mon.add(sun6.getText());
            varis = new EvalVariables();
            varis.setMon1(mon.get(0));
            varis.setMon2(mon.get(1));
            varis.setMon3(mon.get(2));
            varis.setMon4(mon.get(3));
            varis.setMon5(mon.get(4));
            varis.setMon6(mon.get(5));

            varis.setTue1(mon.get(6));
            varis.setTue2(mon.get(7));
            varis.setTue3(mon.get(8));
            varis.setTue4(mon.get(9));
            varis.setTue5(mon.get(10));
            varis.setTue6(mon.get(11));

            varis.setWed1(mon.get(12));
            varis.setWed2(mon.get(13));
            varis.setWed3(mon.get(14));
            varis.setWed4(mon.get(15));
            varis.setWed5(mon.get(16));
            varis.setWed6(mon.get(17));

            varis.setThu1(mon.get(18));
            varis.setThu2(mon.get(19));
            varis.setThu3(mon.get(20));
            varis.setThu4(mon.get(21));
            varis.setThu5(mon.get(22));
            varis.setThu6(mon.get(23));

            varis.setFri1(mon.get(24));
            varis.setFri2(mon.get(25));
            varis.setFri3(mon.get(26));
            varis.setFri4(mon.get(27));
            varis.setFri5(mon.get(28));
            varis.setFri6(mon.get(29));

            varis.setSat1(mon.get(30));
            varis.setSat2(mon.get(31));
            varis.setSat3(mon.get(32));
            varis.setSat4(mon.get(33));
            varis.setSat5(mon.get(34));
            varis.setSat6(mon.get(35));

            varis.setSun1(mon.get(36));
            varis.setSun2(mon.get(37));
            varis.setSun3(mon.get(38));
            varis.setSun4(mon.get(39));
            varis.setSun5(mon.get(40));
            varis.setSun6(mon.get(41));

            File file= new File("evals.txt");
            FileWriter fw = new FileWriter(file,false);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(m1.getText());
            pw.println(m2.getText());
            pw.println(m3.getText());
            pw.println(m4.getText());
            pw.println(m5.getText());
            pw.println(m6.getText());
            pw.println(t1.getText());
            pw.println(t2.getText());
            pw.println(t3.getText());
            pw.println(t4.getText());
            pw.println(t5.getText());
            pw.println(t6.getText());
            pw.println(w1.getText());
            pw.println(w2.getText());
            pw.println(w3.getText());
            pw.println(w4.getText());
            pw.println(w5.getText());
            pw.println(w6.getText());
            pw.println(th1.getText());
            pw.println(th2.getText());
            pw.println(th3.getText());
            pw.println(th4.getText());
            pw.println(th5.getText());
            pw.println(th6.getText());
            pw.println(fr1.getText());
            pw.println(fr2.getText());
            pw.println(fr3.getText());
            pw.println(fr4.getText());
            pw.println(fr5.getText());
            pw.println(fr6.getText());
            pw.println(sat1.getText());
            pw.println(sat2.getText());
            pw.println(sat3.getText());
            pw.println(sat4.getText());
            pw.println(sat5.getText());
            pw.println(sat6.getText());
            pw.println(sun1.getText());
            pw.println(sun2.getText());
            pw.println(sun3.getText());
            pw.println(sun4.getText());
            pw.println(sun5.getText());
            pw.println(sun6.getText());
            pw.close();
        }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File myObj = new File("evals.txt");
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            m1.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            m2.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            m3.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            m4.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            m5.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            m6.setText(data);
        }


        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            t1.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            t2.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            t3.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            t4.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            t5.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            t6.setText(data);
        }


        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            w1.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            w2.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            w3.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            w4.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            w5.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            w6.setText(data);
        }



        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            th1.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            th2.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            th3.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            th4.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            th5.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            th6.setText(data);
        }



        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            fr1.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            fr2.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            fr3.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            fr4.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            fr5.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            fr6.setText(data);
        }



        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            sat1.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            sat2.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            sat3.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            sat4.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            sat5.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            sat6.setText(data);
        }



        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            sun1.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            sun2.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            sun3.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            sun4.setText(data);
        }
        if (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            sun5.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            sun6.setText(data);
        }
    }





}
