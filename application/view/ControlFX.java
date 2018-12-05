package view;

import java.io.IOException;

import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import control.MainFX;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * 
 * @author carre
 * @version 1.0
 * @see sendStage
 * @see closeStage
 *
 */
public class ControlFX {
	@FXML
	ImageView imageView;
	@FXML
	JFXButton boton;
	
	private Stage sendStage;

	@FXML
	public void initialize() {
		// TODO Auto-generated method stub
		FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(3), imageView);
		fadeTransition1.setFromValue(0);
		fadeTransition1.setToValue(1);
		fadeTransition1.play();
		
	}

	@FXML
	public void sendStage() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../view/GetMe.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			sendStage = new Stage();
			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.initStyle(StageStyle.UNDECORATED);
			sendStage.setScene(scene);
			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	public void closeStage(ActionEvent event) { 
	    Stage stage = (Stage) boton.getScene().getWindow(); 
	    stage.close(); 
	} 

}