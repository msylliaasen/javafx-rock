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
    	
    	if (choicePlayer == 0) {
    		playerImage.setImage(new Image("rock.png"));
    	}
    	if (choicePlayer == 1) {
    		playerImage.setImage(new Image("paper.jpg"));
    	}
    	if (choicePlayer == 2) {
    		playerImage.setImage(new Image("scissors.jpeg"));
    	}
    	
    }

}

