package viewVerktyg;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class QuestionCreator {
	private Button title, save, addOption;
	private TextField txtQuestion,txtOption;
	private RadioButton radCorr;
	private ArrayList<TextField> ansField;
	private ArrayList<RadioButton> ansCorr;
	public void startQuestionCreator(){
		title= new Button();
		save= new Button();
		txtQuestion= new TextField();
		
	}
	
	public void generateOptionField (){
		addOption.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				txtOption= new TextField();
				radCorr = new RadioButton();
				ansField= new ArrayList<>();
				ansCorr= new ArrayList<>();
				ansField.add(txtOption);
				ansCorr.add(radCorr);
				
			}
		});
	}
	public ArrayList<TextField> getAnsField(){
		return ansField;
	}
	public ArrayList<RadioButton> getCorrAns(){
		return ansCorr;
	}
	
}
