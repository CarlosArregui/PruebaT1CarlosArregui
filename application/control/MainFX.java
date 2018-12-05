package control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * 
 * @author carre
 *@version 1.0
 *@see start
 */
public class MainFX extends Application {

	  @Override
	    public void start(Stage primaryStage) throws IOException {
	          FXMLLoader loader =new FXMLLoader(getClass().getResource("../view/Profile.fxml"));
	            AnchorPane pane=loader.load();
	            Scene scene=new Scene(pane);
	        
				Font.loadFont(getClass().getResourceAsStream("../view/assets/PoiretOne-Regular.ttf"), 20);
				
	            //scene.getStylesheets().add("https://fonts.googleapis.com/css?family=PoiretOne-Regular");
	            primaryStage.setTitle("My Github Profile");
	            primaryStage.setScene(scene);
	            primaryStage.show();
	    }
	    
	    public static void main(String[] args) {
	        launch(args);
	    }
}