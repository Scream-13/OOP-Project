package t5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class NotesController {
    @FXML private TextField title;
    @FXML private TextArea description;
    @FXML private Button cancelButton;
    @FXML private Button saveButton;
    @FXML private AnchorPane scenepane;
    private Parent root;
    private Scene scene;
    private Stage stage;
    Alert a = new Alert(AlertType.NONE);

    public void createNote(ActionEvent event) throws IOException{
    	if(title.getText().isBlank() || description.getText().isBlank()) {
    		a.setAlertType(AlertType.ERROR);
    		if(title.getText().isBlank() && !description.getText().isBlank())
    		a.setContentText("Complete the title");
    		else if(description.getText().isBlank() && !title.getText().isBlank())
    			a.setContentText("Complete the description");
    		else
    			a.setContentText("Complete the title and description");
    		
    		a.show();
    		
    	}
    	else {		
        Notes note = new Notes(title.getText(),description.getText());
        Notes.addNote(note);
        File file= new File("Notes.txt");
        FileWriter fw = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(note.getTitle());
        pw.println(note.getDescription());
        pw.close();
        NotesListController obj = new NotesListController();
        obj.addnote(title.getText(), description.getText());
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NotesList.fxml"));
   	    root = loader.load();
   	    Node node = (Node) event.getSource();
   	    stage= (Stage) node.getScene().getWindow();
   	    scene = new Scene(root);
   	    stage.setScene(scene);
   	    stage.show();
    	}
        
    }

    public void closeButtonAction(ActionEvent event) throws IOException{
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("NotesList.fxml"));
   	    root = loader.load();
   	    Node node = (Node) event.getSource();
   	    stage= (Stage) node.getScene().getWindow();
   	    scene = new Scene(root);
   	    stage.setScene(scene);
   	    stage.show();
    }
    
    public void clearButtonAction() {
    	title.setText(null);
    	description.setText(null);
    }
}