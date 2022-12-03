package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

public class NotesListController implements Initializable{
	
	@FXML private TreeView treeview;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	TreeItem<String> rootItem = new TreeItem<>("Notes");
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		File myObj = new File("Notes.txt");
	    Scanner myReader = null;
		try {
			myReader = new Scanner(myObj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        
	        TreeItem<String> Item = new TreeItem<>(data);
	        TreeItem<String> SubItem = new TreeItem<>(myReader.nextLine());
	        Item.getChildren().add(SubItem);
	        rootItem.getChildren().add(Item);
	        
	      }
	    treeview.setRoot(rootItem);
		
	}
	
	public void newnote(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Notes.fxml"));
   	    root = loader.load();
   	    Node node = (Node) event.getSource();
   	    stage= (Stage) node.getScene().getWindow();
   	    scene = new Scene(root);
   	    stage.setScene(scene);
   	    stage.show();
	}
	
	public void addnote(String title,String desc) {
		TreeItem<String> Item = new TreeItem<>(title);
        TreeItem<String> SubItem = new TreeItem<>(desc);
        Item.getChildren().add(SubItem);
        rootItem.getChildren().add(Item);
	}
	
	public void home(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
   	    root = loader.load();
   	    Node node = (Node) event.getSource();
   	    stage= (Stage) node.getScene().getWindow();
   	    scene = new Scene(root);
   	    stage.setScene(scene);
   	    stage.show();
	}
	

}
