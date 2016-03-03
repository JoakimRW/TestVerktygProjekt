package viewVerktyg;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class QuestionCreator {
	private Button title, save, addOption;
	private TextField txtQuestion,txtOption;
	private RadioButton radCorr;
	private ArrayList<TextField> ansField;
	private ArrayList<RadioButton> ansCorr;
	private VBox questionList; 
	
	public VBox startQuestionCreator(){
		title= new Button();
		save= new Button();
		txtQuestion= new TextField();
		addOption= new Button();
		questionList = new VBox();
		questionList.getChildren().addAll(title,save,txtQuestion,addOption);
		questionList.setPrefSize(400, 800);
		return questionList;
	}
	
	public VBox getQuestionList(){
		return questionList;
	}
	
	public void generateOptionField (){
		addOption.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				txtOption= new TextField();
				radCorr = new RadioButton();
				ansField.add(txtOption);
				ansCorr.add(radCorr);
				questionList.getChildren().addAll(txtOption,radCorr);				
			}
		});
	}
	public void saveQuestion(){
		save.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
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
