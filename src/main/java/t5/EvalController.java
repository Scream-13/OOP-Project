package t5;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.WeakHashMap;

import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class EvalController implements Initializable {
    public static WeeklyEvalInput Ti = new WeeklyEvalInput();
    @FXML
    private TableView<EvalDays> table;
    @FXML
    private TableColumn<EvalDays, String> sunday;
    @FXML
    private TableColumn<EvalDays, String> monday;
    @FXML
    private TableColumn<EvalDays, String> tuesday;
    @FXML
    private TableColumn<EvalDays, String> wednesday;
    @FXML
    private TableColumn<EvalDays, String> thursday;
    @FXML
    private TableColumn<EvalDays, String> friday;
    @FXML
    private TableColumn<EvalDays, String> saturday;

    public ObservableList<EvalDays> list = FXCollections.observableArrayList(
            new EvalDays(WeeklyEvalInput.varis.getMon1(), WeeklyEvalInput.varis.getTue1(), WeeklyEvalInput.varis.getWed1(), WeeklyEvalInput.varis.getThu1(), WeeklyEvalInput.varis.getFri1(), WeeklyEvalInput.varis.getSat1(), WeeklyEvalInput.varis.getSun1()),
            new EvalDays(WeeklyEvalInput.varis.getMon2(), WeeklyEvalInput.varis.getTue2(), WeeklyEvalInput.varis.getWed2(), WeeklyEvalInput.varis.getThu2(), WeeklyEvalInput.varis.getFri2(), WeeklyEvalInput.varis.getSat2(), WeeklyEvalInput.varis.getSun2()),
            new EvalDays(WeeklyEvalInput.varis.getMon3(), WeeklyEvalInput.varis.getTue3(), WeeklyEvalInput.varis.getWed3(), WeeklyEvalInput.varis.getThu3(), WeeklyEvalInput.varis.getFri3(), WeeklyEvalInput.varis.getSat3(), WeeklyEvalInput.varis.getSun3()),
//            new Days("11-12",TimeTableInput.vari.getMon4(),TimeTableInput.vari.getTue4(),TimeTableInput.vari.getWed4(),TimeTableInput.vari.getThu4(),TimeTableInput.vari.getFri4(),TimeTableInput.vari.getSat4()),
            new EvalDays(WeeklyEvalInput.varis.getMon4(), WeeklyEvalInput.varis.getTue4(), WeeklyEvalInput.varis.getWed4(), WeeklyEvalInput.varis.getThu4(), WeeklyEvalInput.varis.getFri4(), WeeklyEvalInput.varis.getSat4(), WeeklyEvalInput.varis.getSun4()),
            new EvalDays(WeeklyEvalInput.varis.getMon5(), WeeklyEvalInput.varis.getTue5(), WeeklyEvalInput.varis.getWed5(), WeeklyEvalInput.varis.getThu5(), WeeklyEvalInput.varis.getFri5(), WeeklyEvalInput.varis.getSat5(), WeeklyEvalInput.varis.getSun5()),
            new EvalDays(WeeklyEvalInput.varis.getMon6(), WeeklyEvalInput.varis.getTue6(), WeeklyEvalInput.varis.getWed6(), WeeklyEvalInput.varis.getThu6(), WeeklyEvalInput.varis.getFri6(), WeeklyEvalInput.varis.getSat6(), WeeklyEvalInput.varis.getSun6())

            );

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        monday.setCellValueFactory(new PropertyValueFactory<EvalDays, String>("monday"));
        tuesday.setCellValueFactory(new PropertyValueFactory<EvalDays, String>("tuesday"));
        wednesday.setCellValueFactory(new PropertyValueFactory<EvalDays, String>("wednesday"));
        thursday.setCellValueFactory(new PropertyValueFactory<EvalDays, String>("thursday"));
        friday.setCellValueFactory(new PropertyValueFactory<EvalDays, String>("friday"));
        saturday.setCellValueFactory(new PropertyValueFactory<EvalDays, String>("saturday"));
        sunday.setCellValueFactory(new PropertyValueFactory<EvalDays, String>("sunday"));
        table.setItems(list);

    }
}