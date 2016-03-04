package viewVerktyg;

	import javafx.application.Application;
	import javafx.application.Platform;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.AnchorPane;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;
	import javafx.stage.Stage;

	public class InlogGui {
		
		String name1 = "";
		String pass1 = "";
		
		
		public InlogGui() {
			
			
			
			BorderPane layout = new BorderPane();

			AnchorPane center = new AnchorPane();
			
			VBox vbox = new VBox(30);
			
			Label name = new Label("Name");
			center.setTopAnchor(name, 30.0);
			center.setLeftAnchor(name, 30.0);
			
			
			TextField text = new TextField();
			center.setTopAnchor(text, 65.0);
			center.setLeftAnchor(text, 10.0);
			
			Label pass = new Label("Password");
			center.setTopAnchor(pass, 40.0);
			center.setLeftAnchor(pass, 40.0);
			
			TextField text1 = new TextField();
			center.setTopAnchor(text1, 20.0);
			center.setLeftAnchor(text1, 10.0);
			
			Button btn = new Button();
			center.setTopAnchor(btn, 350.0);
			center.setLeftAnchor(btn, 350.0);
			btn.setText("OK");

		
			vbox.getChildren().addAll(name,pass);
			center.getChildren().addAll(btn, vbox, text, text1);
				
			 Stage stage1 = new Stage();
			stage1.setScene(new Scene(center, 400, 400));
	         stage1.setTitle("Log in");
			stage1.show();
			btn.setOnAction(event -> {
		           name1=text.getText();
		           pass1=text1.getText();
		           stage1.close();
		           
		           
		        });
		}

		public static void main(String[] args) {
			Application.launch(args);
		}

		public String getName (){
		
			return name1;	
		}
		
		public String getPass (){
			
			return pass1;
		}
	}