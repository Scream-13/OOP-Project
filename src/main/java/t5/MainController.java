package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
     public void openNotes(ActionEvent event) throws IOException {
    	 
    	 FXMLLoader loader = new FXMLLoader(getClass().getResource("NotesList.fxml"));
    	 root = loader.load();
    	 Node node = (Node) event.getSource();
    	 stage= (Stage) node.getScene().getWindow();
    	 scene = new Scene(root);
    	 stage.setScene(scene);
    	 stage.show();
     }
     
     public void openProjects(ActionEvent event) throws IOException{
    	 
    	 FXMLLoader loader = new FXMLLoader(getClass().getResource("ProjectList.fxml"));
    	 root = loader.load();
    	 Node node = (Node) event.getSource();
    	 stage= (Stage) node.getScene().getWindow();
    	 scene = new Scene(root);
    	 stage.setScene(scene);
    	 stage.show();
    	 
     }
}
