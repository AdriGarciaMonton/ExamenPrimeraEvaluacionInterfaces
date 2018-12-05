package control;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlFX {
	@FXML
	ImageView imagenPerfil;
	
	@FXML
	AnchorPane opacityPane, anchorPaneArriba;
	@FXML
	Button btnGetMe;

	public void initialize() {
		
		
		Tooltip tp = new Tooltip("Do you know me?");
		tp.getStyleClass().add("ttip");
		btnGetMe.setTooltip(tp);
		
		imagenFade();
	}

	private void imagenFade() {
		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(5), imagenPerfil);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
	}
	


	@FXML
	public void sendStaged() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/GetMe.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
			Stage ventana = new Stage();
			ventana.setTitle("Estas dentro");
			Scene scene = new Scene(ventanaDos);
			ventana.setScene(scene);
			ventana.show();

		} catch (Exception e) {
			// tratar la excepción
		}
	}
}
