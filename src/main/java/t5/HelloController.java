package t5;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController extends home implements Initializable {

    public static TimeTableInput Ti = new TimeTableInput();
    @FXML private TableView<Days> table;
    @FXML private TableColumn<Days,String> timeSlot;
    @FXML private TableColumn<Days,String> monday;
    @FXML private TableColumn<Days,String> tuesday;
    @FXML private TableColumn<Days,String> wednesday;
    @FXML private TableColumn<Days,String> thursday;
    @FXML private TableColumn<Days,String> friday;
    @FXML private TableColumn<Days,String> saturday;

    public ObservableList<Days> list = FXCollections.observableArrayList(
            new Days("8-9",TimeTableInput.vari.getMon1(),TimeTableInput.vari.getTue1(),TimeTableInput.vari.getWed1(),TimeTableInput.vari.getThu1(),TimeTableInput.vari.getFri1(),TimeTableInput.vari.getSat1()),
            new Days("9-10",TimeTableInput.vari.getMon2(),TimeTableInput.vari.getTue2(),TimeTableInput.vari.getWed2(),TimeTableInput.vari.getThu2(),TimeTableInput.vari.getFri2(),TimeTableInput.vari.getSat2()),
            new Days("10-11",TimeTableInput.vari.getMon3(),TimeTableInput.vari.getTue3(),TimeTableInput.vari.getWed3(),TimeTableInput.vari.getThu3(),TimeTableInput.vari.getFri3(),TimeTableInput.vari.getSat3()),
            new Days("11-12",TimeTableInput.vari.getMon4(),TimeTableInput.vari.getTue4(),TimeTableInput.vari.getWed4(),TimeTableInput.vari.getThu4(),TimeTableInput.vari.getFri4(),TimeTableInput.vari.getSat4()),
            new Days("12-1",TimeTableInput.vari.getMon5(),TimeTableInput.vari.getTue5(),TimeTableInput.vari.getWed5(),TimeTableInput.vari.getThu5(),TimeTableInput.vari.getFri5(),TimeTableInput.vari.getSat5()),
            new Days("1-2",TimeTableInput.vari.getMon6(),TimeTableInput.vari.getTue6(),TimeTableInput.vari.getWed6(),TimeTableInput.vari.getThu6(),TimeTableInput.vari.getFri6(),TimeTableInput.vari.getSat6()),
            new Days("2-3",TimeTableInput.vari.getMon7(),TimeTableInput.vari.getTue7(),TimeTableInput.vari.getWed7(),TimeTableInput.vari.getThu7(),TimeTableInput.vari.getFri7(),TimeTableInput.vari.getSat7()),
            new Days("3-4",TimeTableInput.vari.getMon8(),TimeTableInput.vari.getTue8(),TimeTableInput.vari.getWed8(),TimeTableInput.vari.getThu8(),TimeTableInput.vari.getFri8(),TimeTableInput.vari.getSat8()),
            new Days("4-5",TimeTableInput.vari.getMon9(),TimeTableInput.vari.getTue9(),TimeTableInput.vari.getWed9(),TimeTableInput.vari.getThu9(),TimeTableInput.vari.getFri9(),TimeTableInput.vari.getSat9()),
            new Days("5-6",TimeTableInput.vari.getMon10(),TimeTableInput.vari.getTue10(),TimeTableInput.vari.getWed10(),TimeTableInput.vari.getThu10(),TimeTableInput.vari.getFri10(),TimeTableInput.vari.getSat10())

    );
    @Override
    public void initialize(URL location, ResourceBundle resources){
        timeSlot.setCellValueFactory(new PropertyValueFactory<Days,String>("timeSlot"));
        monday.setCellValueFactory(new PropertyValueFactory<Days,String>("monday"));
        tuesday.setCellValueFactory(new PropertyValueFactory<Days,String>("tuesday"));
        wednesday.setCellValueFactory(new PropertyValueFactory<Days,String>("wednesday"));
        thursday.setCellValueFactory(new PropertyValueFactory<Days,String>("thursday"));
        friday.setCellValueFactory(new PropertyValueFactory<Days,String>("friday"));
        saturday.setCellValueFactory(new PropertyValueFactory<Days,String>("saturday"));
        table.setItems(list);

    }
//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
}