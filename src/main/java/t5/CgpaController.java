package t5;

import t5.evaluative.Assignment;
import t5.evaluative.Evaluative;
import t5.evaluative.Test;
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CgpaController extends home implements Initializable, Processor {
    public static Student s1 = new Student();

    private static final DecimalFormat decfor = new DecimalFormat("0.000");
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML   Alert a = new Alert(Alert.AlertType.NONE);
    @FXML   private Button scoreView  = new Button();
    @FXML   private Button calcButton  = new Button();
    @FXML   private Label nameLabel1 = new Label();
    @FXML   private Label nameLabel2 = new Label();
    @FXML   private Label nameLabel3 = new Label();
    @FXML   private Label nameLabel4 = new Label();
    @FXML   private Label nameLabel5 = new Label();
    @FXML   private TextField c1 = new TextField();
    @FXML   private TextField c2 = new TextField();
    @FXML   private TextField c3 = new TextField();
    @FXML   private TextField c4 = new TextField();
    @FXML   private TextField cr1 = new TextField();
    @FXML   private TextField cr2 = new TextField();
    @FXML   private TextField cr3 = new TextField();
    @FXML   private TextField cr4 = new TextField();
    @FXML   private TextField max1 = new TextField();
    @FXML   private TextField max2 = new TextField();
    @FXML   private TextField max3 = new TextField();
    @FXML   private TextField max4 = new TextField();
    @FXML   private TextField min1 = new TextField();
    @FXML   private TextField min2 = new TextField();
    @FXML   private TextField min3 = new TextField();
    @FXML   private TextField min4 = new TextField();
    @FXML   private TextField med1 = new TextField();
    @FXML   private TextField med2 = new TextField();
    @FXML   private TextField med3 = new TextField();
    @FXML   private TextField med4 = new TextField();
    @FXML   private TextField q11 = new TextField();
    @FXML   private TextField q12 = new TextField();
    @FXML   private TextField q13 = new TextField();
    @FXML   private TextField q14 = new TextField();
    @FXML   private TextField q21 = new TextField();
    @FXML   private TextField q22 = new TextField();
    @FXML   private TextField q23 = new TextField();
    @FXML   private TextField q24 = new TextField();
    @FXML   private TextField ass1 = new TextField();
    @FXML   private TextField ass2 = new TextField();
    @FXML   private TextField ass3 = new TextField();
    @FXML   private TextField ass4 = new TextField();
    @FXML   private TextField mids1 = new TextField();
    @FXML   private TextField mids2 = new TextField();
    @FXML   private TextField mids3 = new TextField();
    @FXML   private TextField mids4 = new TextField();
    @FXML   private TextField comp1 = new TextField();
    @FXML   private TextField comp2 = new TextField();
    @FXML   private TextField comp3 = new TextField();
    @FXML   private TextField comp4 = new TextField();
    @FXML   private TextField curCg = new TextField();
    @FXML   private TextField credDone = new TextField();
    public void openScoreView(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Score-view.fxml"));
        root = loader.load();
        Node node = (Node) event.getSource();
        stage= (Stage) node.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void processData(ActionEvent event) throws IOException {
        String coursename1 = c1.getText();
        String coursename2 = c2.getText();
        String coursename3 = c3.getText();
        String coursename4 = c4.getText();
        int credits1 = 3;
        int credits2 = 3;
        int credits3 = 3;
        int credits4 = 3;
        float maximum1 = 1;
        float maximum2 = 1;
        float maximum3 = 1;
        float maximum4 = 1;
        float minimum1 = 1;
        float minimum2 = 1;
        float minimum3 = 1;
        float minimum4 = 1;
        float median1 =1;
        float median2 =1;
        float median3 =1;
        float median4 =1;
        float quiz11 = 1;
        float quiz12 = 1;
        float quiz13 = 1;
        float quiz14 = 1;
        float quiz21 = 1;
        float quiz22 = 1;
        float quiz23 = 1;
        float quiz24 = 1;
        float assignment1 = 1;
        float assignment2 = 1;
        float assignment3 = 1;
        float assignment4 = 1;
        float midsem1 = 1;
        float midsem2 = 1;
        float midsem3 = 1;
        float midsem4 = 1;
        float compre1 = 1;
        float compre2 = 1;
        float compre3 = 1;
        float compre4 = 1;
        int creditsDone = 1;
        float cgpaEntered = 8;

        try{
            credits1 = Integer.parseInt(cr1.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.show();
        }
        try{
            credits2 = Integer.parseInt(cr2.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
            credits3 = Integer.parseInt(cr3.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
            credits4 = Integer.parseInt(cr4.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
            maximum1 = Float.parseFloat(max1.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
            maximum2 = Float.parseFloat(max2.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
            maximum3 = Float.parseFloat(max3.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
            maximum4 = Float.parseFloat(max4.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
             minimum1 = Float.parseFloat(min1.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             minimum2 = Float.parseFloat(min2.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             minimum3 = Float.parseFloat(min3.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             minimum4 = Float.parseFloat(min4.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
             median1 = Float.parseFloat(med1.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             median2 = Float.parseFloat(med2.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             median3 = Float.parseFloat(med3.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             median4 = Float.parseFloat(med4.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
             quiz11 = Float.parseFloat(q11.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             quiz12 = Float.parseFloat(q12.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             quiz13 = Float.parseFloat(q13.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             quiz14 = Float.parseFloat(q14.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
             quiz21 = Float.parseFloat(q21.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             quiz22 = Float.parseFloat(q22.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             quiz23 = Float.parseFloat(q23.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             quiz24 = Float.parseFloat(q24.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
             assignment1 = Float.parseFloat(ass1.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             assignment2 = Float.parseFloat(ass2.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             assignment3 = Float.parseFloat(ass3.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             assignment4 = Float.parseFloat(ass4.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
             midsem1 = Float.parseFloat(mids1.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             midsem2 = Float.parseFloat(mids2.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             midsem3 = Float.parseFloat(mids3.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             midsem4 = Float.parseFloat(mids4.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
             compre1 = Float.parseFloat(comp1.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             compre2 = Float.parseFloat(comp2.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }        try{
             compre3 = Float.parseFloat(comp3.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
             compre4 = Float.parseFloat(comp4.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
             cgpaEntered = Float.parseFloat(curCg.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        try{
             creditsDone = Integer.parseInt(credDone.getText());
        } catch (NumberFormatException e){
            a.setContentText("Wrong input format");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }
        String ass1Name = "assignment1";
        double ass1Weightage = 0.1;
        Assignment assi1 = new Assignment(ass1Name, ass1Weightage);
        String quiz11Name = "quiz1";
        double quiz11Weightage = 0.1;
        Test quiz1_1 = new Test(quiz11Name, quiz11Weightage);
        String quiz12Name = "quiz2";
        double quiz12Weightage = 0.1;
        Test quiz1_2 = new Test(quiz12Name, quiz12Weightage);
        String midsem1Name = "midsem";
        double midsem1Weightage = 0.3;
        Test midsem_1 = new Test(midsem1Name, midsem1Weightage);
        String compre1Name = "compre";
        double compre1Weightage = 0.4;
        Test compre_1 = new Test(compre1Name, compre1Weightage);
        ArrayList<Evaluative> tests1 = new ArrayList<>();
        tests1.add(assi1);
        tests1.add(quiz1_1);
        tests1.add(quiz1_2);
        tests1.add(midsem_1);
        tests1.add(compre_1);
        LinkedHashMap<Evaluative, Float> lhm1 = new LinkedHashMap<>();
        lhm1.put(assi1, assignment1);
        lhm1.put(quiz1_1, quiz11);
        lhm1.put(quiz1_2, quiz21);
        lhm1.put(midsem_1, midsem1);
        lhm1.put(compre_1, compre1);
        LinkedHashMap<Course, LinkedHashMap<Evaluative, Float>> marksObtained = new LinkedHashMap<>();
        marksObtained.put(new Course(coursename1, tests1, credits1, maximum1, minimum1, median1), lhm1);

        String ass2Name = "assignment1";
        double ass2Weightage = 0.1;
        Assignment assi2 = new Assignment(ass2Name, ass2Weightage);
        String quiz21Name = "quiz1";
        double quiz21Weightage = 0.1;
        Test quiz2_1 = new Test(quiz21Name, quiz21Weightage);
        String quiz22Name = "quiz2";
        double quiz22Weightage = 0.1;
        Test quiz2_2 = new Test(quiz22Name, quiz22Weightage);
        String midsem2Name = "midsem";
        double midsem2Weightage = 0.3;
        Test midsem_2 = new Test(midsem2Name, midsem2Weightage);
        String compre2Name = "compre";
        double compre2Weightage = 0.4;
        Test compre_2 = new Test(compre2Name, compre2Weightage);
        ArrayList<Evaluative> tests2 = new ArrayList<>();
        tests2.add(assi2);
        tests2.add(quiz2_1);
        tests2.add(quiz2_2);
        tests2.add(midsem_2);
        tests2.add(compre_2);
        LinkedHashMap<Evaluative, Float> lhm2 = new LinkedHashMap<>();
        lhm2.put(assi2, assignment2);
        lhm2.put(quiz2_1, quiz12);
        lhm2.put(quiz2_2, quiz22);
        lhm2.put(midsem_2, midsem2);
        lhm2.put(compre_2, compre2);
        marksObtained.put(new Course(coursename2, tests2, credits2, maximum2, minimum2, median2), lhm2);

        String ass3Name = "assignment1";
        double ass3Weightage = 0.1;
        Assignment assi3 = new Assignment(ass3Name, ass3Weightage);
        String quiz31Name = "quiz1";
        double quiz31Weightage = 0.1;
        Test quiz3_1 = new Test(quiz31Name, quiz31Weightage);
        String quiz32Name = "quiz2";
        double quiz32Weightage = 0.1;
        Test quiz3_2 = new Test(quiz32Name, quiz32Weightage);
        String midsem3Name = "midsem";
        double midsem3Weightage = 0.3;
        Test midsem_3 = new Test(midsem3Name, midsem3Weightage);
        String compre3Name = "compre";
        double compre3Weightage = 0.4;
        Test compre_3 = new Test(compre3Name, compre3Weightage);
        ArrayList<Evaluative> tests3 = new ArrayList<>();
        tests3.add(assi3);
        tests3.add(quiz3_1);
        tests3.add(quiz3_2);
        tests3.add(midsem_3);
        tests3.add(compre_3);
        LinkedHashMap<Evaluative, Float> lhm3 = new LinkedHashMap<>();
        lhm3.put(assi3, assignment3);
        lhm3.put(quiz3_1, quiz13);
        lhm3.put(quiz3_2, quiz23);
        lhm3.put(midsem_3, midsem3);
        lhm3.put(compre_3, compre3);
        marksObtained.put(new Course(coursename3, tests3, credits3, maximum3, minimum3, median3), lhm3);

        String ass4Name = "assignment1";
        double ass4Weightage = 0.1;
        Assignment assi4 = new Assignment(ass4Name, ass4Weightage);
        String quiz41Name = "quiz1";
        double quiz41Weightage = 0.1;
        Test quiz4_1 = new Test(quiz41Name, quiz41Weightage);
        String quiz42Name = "quiz2";
        double quiz42Weightage = 0.1;
        Test quiz4_2 = new Test(quiz42Name, quiz42Weightage);
        String midsem4Name = "midsem";
        double midsem4Weightage = 0.3;
        Test midsem_4 = new Test(midsem4Name, midsem4Weightage);
        String compre4Name = "compre";
        double compre4Weightage = 0.4;
        Test compre_4 = new Test(compre4Name, compre4Weightage);
        ArrayList<Evaluative> tests4 = new ArrayList<>();
        tests4.add(assi4);
        tests4.add(quiz4_1);
        tests4.add(quiz4_2);
        tests4.add(midsem_4);
        tests4.add(compre_4);
        LinkedHashMap<Evaluative, Float> lhm4 = new LinkedHashMap<>();
        lhm4.put(assi4, assignment4);
        lhm4.put(quiz4_1, quiz14);
        lhm4.put(quiz4_2, quiz24);
        lhm4.put(midsem_4, midsem4);
        lhm4.put(compre_4, compre4);
        marksObtained.put(new Course(coursename4, tests4, credits4, maximum4, minimum4, median4), lhm4);

        s1 = new Student(cgpaEntered , marksObtained, creditsDone);
        s1.setCoursesEnrolled(new ArrayList<Course>(marksObtained.keySet()));
        int creditsThisSem = credits1+credits2+credits3+credits4;
        s1.setCreditsThisSem(creditsThisSem);
        s1.calcExpSgpa();
        s1.calcExpCgpa();
        nameLabel4.setText("Exp-Sgpa : " + String.valueOf(decfor.format(s1.getExpectedSgpa())));
        nameLabel5.setText("Exp-Cgpa : " + String.valueOf(decfor.format(s1.getExpectedCgpa())));

        File file= new File("Scores.txt");
        FileWriter fw = new FileWriter(file,false);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(c1.getText());
        pw.println(c2.getText());
        pw.println(c3.getText());
        pw.println(c4.getText());
        pw.println(q11.getText());
        pw.println(q12.getText());
        pw.println(q13.getText());
        pw.println(q14.getText());
        pw.println(q21.getText());
        pw.println(q22.getText());
        pw.println(q23.getText());
        pw.println(q24.getText());
        pw.println(ass1.getText());
        pw.println(ass2.getText());
        pw.println(ass3.getText());
        pw.println(ass4.getText());
        pw.println(mids1.getText());
        pw.println(mids2.getText());
        pw.println(mids3.getText());
        pw.println(mids4.getText());
        pw.println(comp1.getText());
        pw.println(comp2.getText());
        pw.println(comp3.getText());
        pw.println(comp4.getText());
        pw.close();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File myObj = new File("Scores.txt");
        Scanner myReader = null;
        if(myObj.exists()){
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    

        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            c1.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            c2.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            c3.setText(data);
        }
        if(myReader.hasNextLine()){
            String data = myReader.nextLine();
            c4.setText(data);
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            q11.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            q12.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            q13.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            q14.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            q21.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            q22.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            q23.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            q24.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            ass1.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            ass2.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            ass3.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            ass4.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            mids1.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            mids2.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            mids3.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            mids4.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            comp1.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            comp2.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            comp3.setText(String.valueOf(data));
        }
        if(myReader.hasNextLine()){
            Float data = Float.parseFloat(myReader.nextLine());
            comp4.setText(String.valueOf(data));
        }
    }
    }
}
