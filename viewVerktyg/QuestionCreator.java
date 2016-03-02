package viewVerktyg;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class QuestionCreator {
	Button title, save, addOption;
	TextField txtQuestion;
	
	public void generateOptionField (){
		addOption.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				TextField txtOption= new TextField();
				RadioButton radCorr = new RadioButton();
				
			}
		});
	}
	
}
