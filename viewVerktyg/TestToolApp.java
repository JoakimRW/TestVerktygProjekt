package viewVerktyg;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 
 * JAVAFX Application
 * 
 */

public class TestToolApp extends Application {
	//Instance variables
	private ClientView clientView;
	private String title = "Testverktyg";

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		clientView = new ClientView();
		primaryStage.setTitle(title);
		primaryStage.setScene(clientView.getTestView());
		primaryStage.show();

	}

}
