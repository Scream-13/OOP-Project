package t5;

import java.io.IOException;
import java.time.LocalDate;
import java.util.SortedMap;
import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PrimaryController extends home {

    final static SortedMap<LocalDate, Integer> PList = new TreeMap<LocalDate, Integer>();

    @FXML
    DatePicker pickDate;

    @FXML
    Label isLogged;

    @FXML
    TextField pHrs;

    @FXML
    private void addToPList(ActionEvent e) {
        int i = Integer.parseInt(pHrs.getText());
        PList.put(pickDate.getValue(), i);
        isLogged.setText("Logged Successfully");
    }

    @FXML
    private void switchToGraph(ActionEvent e) throws IOException {

        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Day");
        yAxis.setLabel("Productive hours");
        final LineChart<String, Number> lineChart = new LineChart<String, Number>(xAxis, yAxis);

        lineChart.setTitle("Productivity Graph");
        isLogged.setText("");

        XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
        series.setName("Productivity Through The Year");

        for (LocalDate k : PList.keySet())
            series.getData().add(new XYChart.Data<String, Number>(k.toString(), PList.get(k)));
        Scene scene = new Scene(lineChart, 800, 600);
        lineChart.getData().add(series);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
