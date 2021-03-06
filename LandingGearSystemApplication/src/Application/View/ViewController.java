package Application.View;

import Application.GearSystem.BoardComputer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * 
 * @author lemee
 *
 */
public class ViewController {
	
	public static final String RESSOURCES 		= "/Application/Images/";
	
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
	
	public static final int UP_STATE			= 0;
	public static final int DOWN_STATE			= 8;
	
	@FXML
    private Button up_button;
    
	@FXML
    private Button down_button;
	
	@FXML
	private ImageView gears_handler_state;
	
	@FXML
    private ImageView gear_usage_state;
	
	@FXML
    private ImageView gear_state_1;
	
	@FXML
    private ImageView gear_state_2;
	
	@FXML
    private ImageView gear_state_3;
	
	@FXML
    private ImageView door_state_1;
	
	@FXML
    private ImageView door_state_2;
	
	@FXML
    private ImageView door_state_3;
	
	private ImageView[] gear_state;
	private ImageView[] door_state;
	
	private BoardComputer boardComputer = null;
    
	/**
	 * Constructor
	 * @param boardComputer
	 */
	public ViewController(BoardComputer boardComputer){
		this.boardComputer = boardComputer;
	}
	
	@FXML
    private void initialize() {
		up_button.setOnAction(this::handleUpButtonAction);
		down_button.setOnAction(this::handleDownButtonAction);
		
		this.gear_state = new ImageView[]{this.gear_state_1,this.gear_state_2,this.gear_state_3};
		this.door_state = new ImageView[]{this.door_state_1,this.door_state_2,this.door_state_3};
    }
	
	@FXML
	private void handleUpButtonAction(ActionEvent event) {
		boardComputer.setRequestState(UP_STATE);
		setHandleState(true);
	}
	
	@FXML
	private void handleDownButtonAction(ActionEvent event) {
		boardComputer.setRequestState(DOWN_STATE);
		setHandleState(false);
	}

	/**
	 * Set state of the handle
	 * @param up : true if handle up, false if down
	 */
	public void setHandleState(boolean up){
		if(up){
			gears_handler_state.setRotate(180);
		}
		else{
			gears_handler_state.setRotate(0);
		}
	}
	
	/**
	 * Set the state of the light
	 * @param state :green, orange, red
	 */
	public void setFeuState(String state){
		switch(state){
		case "green":
			gear_usage_state.setImage(new Image(getClass()
					.getResourceAsStream(FEU_VERT)));
			break;
		case "orange":
			gear_usage_state.setImage(new Image(getClass()
					.getResourceAsStream(FEU_ORANGE)));
			break;
		default:
			gear_usage_state.setImage(new Image(getClass()
					.getResourceAsStream(FEU_ROUGE)));
		}
	}

	/**
	 * Set the state of the gear
	 * @param id : id of the gear
	 * @param state : extracted, moving, retracted
	 */
	public void setGearState(int id, String state){
		switch(state){
		case "extracted":
				this.gear_state[id].setImage(new Image(getClass()
						.getResourceAsStream(GEAR_EXTRACTED)));
			break;
		case "moving":
			this.gear_state[id].setImage(new Image(getClass()
					.getResourceAsStream(GEAR_MOVING)));
			break;
		case "retracted":
			this.gear_state[id].setImage(new Image(getClass()
					.getResourceAsStream(GEAR_RETRACTED)));
		break;
		}
	}
	
	/**
	 * Set the door state
	 * @param id : id of the door
	 * @param state : opened, moving, closed
	 */
	public void setDoorState(int id, String state){
		switch(state){
		case "opened":
				this.door_state[id].setImage(new Image(getClass()
						.getResourceAsStream(DOOR_OPENED)));
			break;
		case "moving":
			this.door_state[id].setImage(new Image(getClass()
					.getResourceAsStream(DOOR_MOVING)));
			break;
		case "closed":
			this.door_state[id].setImage(new Image(getClass()
					.getResourceAsStream(DOOR_CLOSED)));
		break;
		}
	}
}



