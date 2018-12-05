package control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

/**
 * 
 * @author Adrian garcia
 *
 */
public class MainFX extends Application {
private AnchorPane mypane;

@Override
public void start(Stage primaryStage) throws IOException {
	FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Profile.fxml"));

	mypane = (AnchorPane) loader.load();
	
	Font.loadFont(getClass().getResourceAsStream("assets/PoiretOne-Regular.ttf"), 20);

	primaryStage.setTitle("Prueba");
	primaryStage.setScene(new Scene(mypane));
	primaryStage.show();
}

public static void main(String[] args) {
	launch(args);
}

}
