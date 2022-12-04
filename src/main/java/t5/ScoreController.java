package t5;

import t5.evaluative.Evaluative;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.*;

import static t5.CgpaController.s1;

public class ScoreController extends home implements Initializable {

   @FXML  TableView<Score> table;
    @FXML  TableColumn<Score, String> courseName;
    @FXML  TableColumn<Score, Float> q1Marks;
    @FXML  TableColumn<Score, Float> q2Marks;
    @FXML  TableColumn<Score, Float> ass1Marks;
    @FXML  TableColumn<Score, Float> midsemMarks;
    @FXML  TableColumn<Score, Float> compreMarks;


   public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
       ObservableList<Score> scores = FXCollections.observableArrayList();
        LinkedHashMap<Course, LinkedHashMap<Evaluative, Float>> lol= CgpaController.s1.getMarksObtained();
        for(Map.Entry<Course,LinkedHashMap<Evaluative,Float>> ml:lol.entrySet())
        {
            Course c = ml.getKey();
            LinkedHashMap<Evaluative, Float> lhm = ml.getValue();
            ArrayList<Float> al = new ArrayList<>(lhm.values());
            for(Float f: al) System.out.println(f);
            scores.add(new Score(c.getCourseName(), al.get(2), al.get(1), al.get(0), al.get(3), al.get(4)));
        }
       courseName.setCellValueFactory(new PropertyValueFactory<Score, String>("courseName"));
        q1Marks.setCellValueFactory(new PropertyValueFactory<Score, Float>("q1Marks"));
        q2Marks.setCellValueFactory(new PropertyValueFactory<Score, Float>("q2Marks"));
        ass1Marks.setCellValueFactory(new PropertyValueFactory<Score, Float>("ass1Marks"));
        midsemMarks.setCellValueFactory(new PropertyValueFactory<Score, Float>("midsemMarks"));
        compreMarks.setCellValueFactory(new PropertyValueFactory<Score, Float>("compreMarks"));
        table.setItems(scores);
        }
    }

