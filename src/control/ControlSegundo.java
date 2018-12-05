package control;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlSegundo {
	@FXML
	private AnchorPane paneDrawer, opacityPane;

	@FXML
	private ImageView drawerImagen;
	
	@FXML
	private Button closeButton;

	public void initialize() {
		
		opacityPane.setVisible(false);
		drawerImagen.setOnMouseClicked(event -> {

			opacityPane.setVisible(true);

			FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(0.5), opacityPane);
			fadeTransition1.setFromValue(0);
			fadeTransition1.setToValue(0.6);
			fadeTransition1.play();

			TranslateTransition translateTransition1 = new TranslateTransition(Duration.seconds(0.5), paneDrawer);
			translateTransition1.setByX(+200);
			translateTransition1.play();
		});

		opacityPane.setOnMouseClicked(event -> {

			FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(0.5), opacityPane);
			fadeTransition1.setFromValue(0.6);
			fadeTransition1.setToValue(0);
			fadeTransition1.play();

			fadeTransition1.setOnFinished(event1 -> {
				opacityPane.setVisible(false);
			});
			TranslateTransition translateTransition1 = new TranslateTransition(Duration.seconds(0.5), paneDrawer);
			translateTransition1.setByX(-200);
			translateTransition1.play();
		});
	}
	
	@FXML 
	public void closeStage(ActionEvent event) { 
	    Stage stage = (Stage) closeButton.getScene().getWindow(); 
	    stage.close(); 
	}

}
