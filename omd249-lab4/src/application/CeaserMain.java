/*
 * THERESA CRAWFORD
 * OMD249
 * 
 * This class contains task 1: a class extends Application, which creates an FXML file with Scene builder
 */

package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class CeaserMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Ceaser.fxml"));
			Scene scene = new Scene(root,616,399);
			scene.getStylesheets().add(getClass().getResource("CeaserStyle.css").toExternalForm());
			primaryStage.setTitle("Ceaser Cipher Encoder");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
