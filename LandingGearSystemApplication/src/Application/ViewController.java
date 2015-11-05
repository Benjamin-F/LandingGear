package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewController {
	
	public static final String RESSOURCES 		= "Images/";
	
	public static final String FEU_VERT 		= RESSOURCES + "feu_vert.jpg";
	public static final String FEU_ROUGE 		= RESSOURCES + "feu_rouge.jpg";
	public static final String FEU_ORANGE 		= RESSOURCES + "feu_orange.jpg";
	
	public static final String UP_DOWN_GEAR 	= RESSOURCES + "upDownGear.png";
	
	public static final String GEAR_EXTRACTED	= RESSOURCES + "gear2_extracted.jpg";
	public static final String GEAR_RETRACTED	= RESSOURCES + "gear2_retracted.jpg";
	public static final String GEAR_MOVING		= RESSOURCES + "gear2_moving.jpg";
	
	public static final String DOOR_CLOSED		= RESSOURCES + "door2_closed.jpg";
	public static final String DOOR_OPENED		= RESSOURCES + "door2_opened.jpg";
	public static final String DOOR_MOVING		= RESSOURCES + "door2_moving.jpg";
	
	@FXML
    private Button up_button;
    
	@FXML
    private Button down_button;
	
	@FXML
	private ImageView gears_handler_up_down;
	
	@FXML
    private ImageView gear_usage_state;
    
	public ViewController(){
		
	}
	
	@FXML
    private void initialize() {
		up_button.setOnAction(this::handleUpButtonAction);
		down_button.setOnAction(this::handleDownButtonAction);
    }
	
	@FXML
	private void handleUpButtonAction(ActionEvent event) {
		gears_handler_up_down.setRotate(180);
		
		gear_usage_state.setImage(new Image(getClass()
				.getResourceAsStream(FEU_ORANGE)));
	}
	
	@FXML
	private void handleDownButtonAction(ActionEvent event) {
		gears_handler_up_down.setRotate(0);
		gear_usage_state.setImage(new Image(getClass()
				.getResourceAsStream(FEU_VERT)));
	}
}
