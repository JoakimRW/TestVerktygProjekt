package viewVerktyg;

import java.util.ArrayList;

<<<<<<< HEAD
=======
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
>>>>>>> origin/master
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
<<<<<<< HEAD

=======
	private ArrayList<String> options= new ArrayList<>();
	private Form question = new Form();;
	
	public QuestionCreator(){
		startQuestionCreator();
	}
	
>>>>>>> origin/master
	public void startQuestionCreator(){
		title= new Button("Title");
		save= new Button("Save");
		txtQuestion= new TextField();
		addOption= new Button("+");
		questionList = new VBox();
		questionList.getChildren().addAll(title,save,txtQuestion,addOption);
		questionList.setPrefSize(400, 800);
<<<<<<< HEAD
	}

	public VBox getQuestionList(){
		return questionList;
	}
=======
		
		
		
		addOption.setOnAction(new EventHandler<ActionEvent>() {
>>>>>>> origin/master

	public void generateOptionField (){
		addOption.setOnAction(event -> {
			txtOption= new TextField();
			radCorr = new RadioButton();
			ansField.add(txtOption);
			ansCorr.add(radCorr);
			questionList.getChildren().addAll(txtOption,radCorr);				
		});
	}
	
	public VBox getQuestionList(){
		return questionList;
	}
	public Form getForm(){
		return question;
	}
	

	public void saveQuestion(){
		save.setOnAction(event -> {
			// TODO Auto-generated method stub

<<<<<<< HEAD
=======
			@Override
			public void handle(ActionEvent event) {
				getAnsField().forEach((item) -> options.add(item.getText()));
				question.setOptions(options);
				question.setQuery(txtQuestion.getText());
			
				getCorrAns().forEach( (rb) -> {
					if(rb.isSelected()){
						question.setCorrAns(getCorrAns().indexOf(rb));
					}
				});
				
				Platform.exit();
			}
>>>>>>> origin/master
		});
	}

	public ArrayList<TextField> getAnsField(){
		return ansField;
	}
	public ArrayList<RadioButton> getCorrAns(){
		return ansCorr;
	}

}
