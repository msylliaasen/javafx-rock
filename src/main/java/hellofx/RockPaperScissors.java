package hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.lang.Math;

public class RockPaperScissors {

    @FXML
    private AnchorPane backColor;

    @FXML
    private ImageView playerImage;

    @FXML
    private ImageView computerImage;

    @FXML
    private Button button;

    @FXML
    private Text win;

    @FXML
    void buttonPressed(ActionEvent event) {
    	int choicePlayer = (int) (Math.random() * 3);
    	int choicePC = (int) (Math.random() * 3);
 	
    	//set pictures based on random number
    	if (choicePlayer == 0) {
    		playerImage.setImage(new Image("hellofx/rock.png"));
    	}
    	if (choicePlayer == 1) {
    		playerImage.setImage(new Image("hellofx/paper.jpg"));
    	}
    	if (choicePlayer == 2) {
    		playerImage.setImage(new Image("hellofx/scissors.jpeg"));
    	}
    	if (choicePC == 0) {
    		computerImage.setImage(new Image("hellofx/rock.png"));
    	}
    	if (choicePC == 1) {
    		computerImage.setImage(new Image("hellofx/paper.jpg"));
    	}
    	if (choicePC == 2) {
    		computerImage.setImage(new Image("hellofx/scissors.jpeg"));
    	}
    	   	
    	//determine winner
    	if (choicePlayer == choicePC) {
    		win.setText("DRAW");
    	}
    	
    	//not a draw so chose
    	else {
        	//ROCK Relationships 0
        	if (choicePlayer == 0 && choicePC == 2) {
        		win.setText("WIN!!!");
        	}
        	
        	if (choicePlayer == 0 && choicePC == 1) {
        		win.setText("LOSE!!!");
        	}
        	
        	//PAPER Relationships 1
        	if (choicePlayer == 1 && choicePC == 0) {
        		win.setText("WIN!!!");
        	}
        	
        	if (choicePlayer == 1 && choicePC == 2) {
        		win.setText("LOSE!!!");
        	}
        	
        	//SCISSOR Relationships 2
        	if (choicePlayer == 2 && choicePC == 1) {
        		win.setText("WIN!!!");
        	}
        	
        	if (choicePlayer == 2 && choicePC == 0) {
        		win.setText("LOSE!!!");
        	}
    	}

    }

}

