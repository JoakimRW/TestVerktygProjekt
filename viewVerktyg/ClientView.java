package viewVerktyg;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * @author Liz Dahlstrom
 *
 */

public class ClientView {
	// Instance variables
	private Scene testView; // Scene showing test
	private Scene selectionView; // Scene showing selection of tests
	private BorderPane layout;
	private AnchorPane bottomBtnPane;
	private AnchorPane topPane;
	private VBox centerLayout;
	private HBox hBox;
			
	private Button btnNext = new Button("Nästa");
	private Button btnPrev = new Button("Tillbaka");
	private Button btnSend = new Button("Lämna in");

	private Label lblTitle;
	private Label lblDescript;


	// Constructor
	public ClientView(){
		initComponents();

	}

	// Methods
	private void initComponents(){
		
		lblTitle = new Label("Starta test");
		lblTitle.setFont(Font.font(32));
		lblDescript = new Label("Starta testet genom att trycka på Nästa..");
		lblDescript.setFont(Font.font(16));

		bottomBtnPane = new AnchorPane(btnPrev,btnNext);
		bottomBtnPane.setLeftAnchor(btnPrev, 0.0);
		bottomBtnPane.setRightAnchor(btnNext, 0.0);
		bottomBtnPane.setMaxHeight(100);
		btnPrev.setPrefSize(100, 50);
		btnNext.setPrefSize(100, 50);
				
		layout = new BorderPane();
		centerLayout  = new VBox();
		topPane = new AnchorPane(btnSend);
		topPane.setRightAnchor(btnSend, 0.0);
		centerLayout.setPadding(new Insets(30));
		centerLayout.getChildren().addAll(lblTitle, lblDescript);
		
		layout.setTop(topPane);
		layout.setCenter(centerLayout);
		layout.setBottom(bottomBtnPane);

		testView = new Scene(layout, 500,600);		
	}


	// Getters and setters
	public Scene getTestView(){
		return testView;
	}

	public Scene getSelectionView(){
		return selectionView;
	}

	public Button getBtnNext(){
		return btnNext;
	}

	public Button getBtnPrev(){
		return btnPrev;
	}

	public Button getBtnSend(){
		return btnSend;
	}

	public void setLblTitle(Label lblTitle) {
		this.lblTitle = lblTitle;
	}

	public void setLblDescript(Label lblDescript) {
		this.lblDescript = lblDescript;
	}

}