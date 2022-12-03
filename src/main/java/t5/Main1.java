package t5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main1 extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Cgpa-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            window = primaryStage;
            window.setScene(scene);
            window.setTitle("Cgpa Calculator");
            window.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
