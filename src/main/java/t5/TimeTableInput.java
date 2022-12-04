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

public class TimeTableInput extends home implements Initializable{

    public static Variables vari;

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

    @FXML private TextField m1 = new TextField();
    @FXML private TextField m2 = new TextField();
    @FXML private TextField m3 = new TextField();
    @FXML private TextField m4 = new TextField();
    @FXML private TextField m5 = new TextField();
    @FXML private TextField m6 = new TextField();
    @FXML private TextField m7 = new TextField();
    @FXML private TextField m8 = new TextField();
    @FXML private TextField m9 = new TextField();
    @FXML private TextField m10 = new TextField();

    @FXML private TextField t1 = new TextField();
    @FXML private TextField t2 = new TextField();
    @FXML private TextField t3 = new TextField();
    @FXML private TextField t4 = new TextField();
    @FXML private TextField t5 = new TextField();
    @FXML private TextField t6 = new TextField();
    @FXML private TextField t7 = new TextField();
    @FXML private TextField t8 = new TextField();
    @FXML private TextField t9 = new TextField();
    @FXML private TextField t10 = new TextField();

    @FXML private TextField w1 = new TextField();
    @FXML private TextField w2 = new TextField();
    @FXML private TextField w3 = new TextField();
    @FXML private TextField w4 = new TextField();
    @FXML private TextField w5 = new TextField();
    @FXML private TextField w6 = new TextField();
    @FXML private TextField w7 = new TextField();
    @FXML private TextField w8 = new TextField();
    @FXML private TextField w9 = new TextField();
    @FXML private TextField w10 = new TextField();

    @FXML private TextField th1 = new TextField();
    @FXML private TextField th2 = new TextField();
    @FXML private TextField th3 = new TextField();
    @FXML private TextField th4 = new TextField();
    @FXML private TextField th5 = new TextField();
    @FXML private TextField th6 = new TextField();
    @FXML private TextField th7 = new TextField();
    @FXML private TextField th8 = new TextField();
    @FXML private TextField th9 = new TextField();
    @FXML private TextField th10 = new TextField();

    @FXML private TextField fr1 = new TextField();
    @FXML private TextField fr2 = new TextField();
    @FXML private TextField fr3 = new TextField();
    @FXML private TextField fr4 = new TextField();
    @FXML private TextField fr5 = new TextField();
    @FXML private TextField fr6 = new TextField();
    @FXML private TextField fr7 = new TextField();
    @FXML private TextField fr8 = new TextField();
    @FXML private TextField fr9 = new TextField();
    @FXML private TextField fr10 = new TextField();

    @FXML private TextField sat1 = new TextField();
    @FXML private TextField sat2 = new TextField();
    @FXML private TextField sat3 = new TextField();
    @FXML private TextField sat4 = new TextField();
    @FXML private TextField sat5 = new TextField();
    @FXML private TextField sat6 = new TextField();
    @FXML private TextField sat7 = new TextField();
    @FXML private TextField sat8 = new TextField();
    @FXML private TextField sat9 = new TextField();
    @FXML private TextField sat10 = new TextField();
    @FXML   Alert a = new Alert(Alert.AlertType.NONE);

    public void openTimeTableView(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TimeTable.fxml"));
        root = loader.load();
        Node node = (Node) event.getSource();
        stage= (Stage) node.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void processData(ActionEvent event) throws IOException
    {
        ArrayList<String> mon = new ArrayList<String>();
        mon.add(m1.getText());
        mon.add(m2.getText());
        mon.add(m3.getText());
        mon.add(m4.getText());
        mon.add(m5.getText());
        mon.add(m6.getText());
        mon.add(m7.getText());
        mon.add(m8.getText());
        mon.add(m9.getText());
        mon.add(m10.getText());
        mon.add(t1.getText());
        mon.add(t2.getText());
        mon.add(t3.getText());
        mon.add(t4.getText());
        mon.add(t5.getText());
        mon.add(t6.getText());
        mon.add(t7.getText());
        mon.add(t8.getText());
        mon.add(t9.getText());
        mon.add(t10.getText());
        mon.add(w1.getText());
        mon.add(w2.getText());
        mon.add(w3.getText());
        mon.add(w4.getText());
        mon.add(w5.getText());
        mon.add(w6.getText());
        mon.add(w7.getText());
        mon.add(w8.getText());
        mon.add(w9.getText());
        mon.add(w10.getText());
        mon.add(th1.getText());
        mon.add(th2.getText());
        mon.add(th3.getText());
        mon.add(th4.getText());
        mon.add(th5.getText());
        mon.add(th6.getText());
        mon.add(th7.getText());
        mon.add(th8.getText());
        mon.add(th9.getText());
        mon.add(th10.getText());
        mon.add(fr1.getText());
        mon.add(fr2.getText());
        mon.add(fr3.getText());
        mon.add(fr4.getText());
        mon.add(fr5.getText());
        mon.add(fr6.getText());
        mon.add(fr7.getText());
        mon.add(fr8.getText());
        mon.add(fr9.getText());
        mon.add(fr10.getText());
        mon.add(sat1.getText());
        mon.add(sat2.getText());
        mon.add(sat3.getText());
        mon.add(sat4.getText());
        mon.add(sat5.getText());
        mon.add(sat6.getText());
        mon.add(sat7.getText());
        mon.add(sat8.getText());
        mon.add(sat9.getText());
        mon.add(sat10.getText());
        vari = new Variables();
        vari.setMon1(mon.get(0));
        vari.setMon2(mon.get(1));
        vari.setMon3(mon.get(2));
        vari.setMon4(mon.get(3));
        vari.setMon5(mon.get(4));
        vari.setMon6(mon.get(5));
        vari.setMon7(mon.get(6));
        vari.setMon8(mon.get(7));
        vari.setMon9(mon.get(8));
        vari.setMon10(mon.get(9));
        vari.setTue1(mon.get(10));
        vari.setTue2(mon.get(11));
        vari.setTue3(mon.get(12));
        vari.setTue4(mon.get(13));
        vari.setTue5(mon.get(14));
        vari.setTue6(mon.get(15));
        vari.setTue7(mon.get(16));
        vari.setTue8(mon.get(17));
        vari.setTue9(mon.get(18));
        vari.setTue10(mon.get(19));
        vari.setWed1(mon.get(20));
        vari.setWed2(mon.get(21));
        vari.setWed3(mon.get(22));
        vari.setWed4(mon.get(23));
        vari.setWed5(mon.get(24));
        vari.setWed6(mon.get(25));
        vari.setWed7(mon.get(26));
        vari.setWed8(mon.get(27));
        vari.setWed9(mon.get(28));
        vari.setWed10(mon.get(29));
        vari.setThu1(mon.get(30));
        vari.setThu2(mon.get(31));
        vari.setThu3(mon.get(32));
        vari.setThu4(mon.get(33));
        vari.setThu5(mon.get(34));
        vari.setThu6(mon.get(35));
        vari.setThu7(mon.get(36));
        vari.setThu8(mon.get(37));
        vari.setThu9(mon.get(38));
        vari.setThu10(mon.get(39));
        vari.setFri1(mon.get(40));
        vari.setFri2(mon.get(41));
        vari.setFri3(mon.get(42));
        vari.setFri4(mon.get(43));
        vari.setFri5(mon.get(44));
        vari.setFri6(mon.get(45));
        vari.setFri7(mon.get(46));
        vari.setFri8(mon.get(47));
        vari.setFri9(mon.get(48));
        vari.setFri10(mon.get(49));
        vari.setSat1(mon.get(50));
        vari.setSat2(mon.get(51));
        vari.setSat3(mon.get(52));
        vari.setSat4(mon.get(53));
        vari.setSat5(mon.get(54));
        vari.setSat6(mon.get(55));
        vari.setSat7(mon.get(56));
        vari.setSat8(mon.get(57));
        vari.setSat9(mon.get(58));
        vari.setSat10(mon.get(59));

        File file= new File("schedule.txt");
        FileWriter fw = new FileWriter(file,false);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(m1.getText());
        pw.println(m2.getText());
        pw.println(m3.getText());
        pw.println(m4.getText());
        pw.println(m5.getText());
        pw.println(m6.getText());
        pw.println(m7.getText());
        pw.println(m8.getText());
        pw.println(m9.getText());
        pw.println(m10.getText());
        pw.println(t1.getText());
        pw.println(t2.getText());
        pw.println(t3.getText());
        pw.println(t4.getText());
        pw.println(t5.getText());
        pw.println(t6.getText());
        pw.println(t7.getText());
        pw.println(t8.getText());
        pw.println(t9.getText());
        pw.println(t10.getText());
        pw.println(w1.getText());
        pw.println(w2.getText());
        pw.println(w3.getText());
        pw.println(w4.getText());
        pw.println(w5.getText());
        pw.println(w6.getText());
        pw.println(w7.getText());
        pw.println(w8.getText());
        pw.println(w9.getText());
        pw.println(w10.getText());
        pw.println(th1.getText());
        pw.println(th2.getText());
        pw.println(th3.getText());
        pw.println(th4.getText());
        pw.println(th5.getText());
        pw.println(th6.getText());
        pw.println(th7.getText());
        pw.println(th8.getText());
        pw.println(th9.getText());
        pw.println(th10.getText());
        pw.println(fr1.getText());
        pw.println(fr2.getText());
        pw.println(fr3.getText());
        pw.println(fr4.getText());
        pw.println(fr5.getText());
        pw.println(fr6.getText());
        pw.println(fr7.getText());
        pw.println(fr8.getText());
        pw.println(fr9.getText());
        pw.println(fr10.getText());
        pw.println(sat1.getText());
        pw.println(sat2.getText());
        pw.println(sat3.getText());
        pw.println(sat4.getText());
        pw.println(sat5.getText());
        pw.println(sat6.getText());
        pw.println(sat7.getText());
        pw.println(sat8.getText());
        pw.println(sat9.getText());
        pw.println(sat10.getText());
        pw.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File myObj = new File("schedule.txt");
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
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            m7.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            m8.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            m9.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            m10.setText(data);
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
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            t7.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            t8.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            t9.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            t10.setText(data);
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
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            w7.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            w8.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            w9.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            w10.setText(data);
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
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            th6.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            th7.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            th8.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            th9.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            th10.setText(data);
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
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            fr7.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            fr8.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            fr9.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            fr10.setText(data);
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
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            sat7.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            sat8.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            sat9.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            sat10.setText(data);
        }
    }


}

