/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import java.util.ArrayList;

import Application.View.ViewController;
import javafx.application.Platform;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of BoardComputer.
 * Allow the system operation
 * @author lemee
 */
public class BoardComputer extends Thread{
	/**
	 * Description of the property viewController.
	 */
	public ViewController viewController = null;

	private DoorElectrovalve openDoorsElectrovalve = null;
	private DoorElectrovalve closeDoorsElectrovalve = null;
	private GearElectrovalve openGearsElectrovalve = null;
	private GearElectrovalve closeGearsElectrovalve = null;
	private GeneralElectrovalve generalElectroval = null;

	private ArrayList<Sensor> doorSensors = new ArrayList<Sensor>();
	private ArrayList<Sensor> gearSensors = new ArrayList<Sensor>();
	
	private ArrayList<Door> doors = new ArrayList<Door>();
	private ArrayList<Gear> gears = new ArrayList<Gear>();
	
	private int requestState;
	private int currentState;

	/**
	 * The constructor.
	 */
	public BoardComputer() {
		super();
	}
	
	@Override
	public void run(){
		while(true){
			try {
				Thread.sleep(1500);
				if(requestState != currentState){
					Platform.runLater(new Runnable() {
					    public void run() {
					    	viewController.setFeuState("orange");
					    }
					});
					generalElectroval.setActive(true);
					
					if(requestState < currentState){
						currentState-=1;
					}
					else
						currentState+=1;
					
					switch(currentState){
					case 0:
						closeDoorsElectrovalve.setClosed();
						break;
					case 1:
						openDoorsElectrovalve.setMoving();
						break;
					case 2:
						openDoorsElectrovalve.setOpen();
						break;
					case 3:
						openGearsElectrovalve.setUp();
						break;
					case 4:
						openGearsElectrovalve.setMoving();
						break;
					case 5:
						openGearsElectrovalve.setDown();
						break;
					case 6:
						openDoorsElectrovalve.setOpen();
						break;
					case 7:
						closeDoorsElectrovalve.setMoving();
						break;
					case 8:
						closeDoorsElectrovalve.setClosed();
						break;
					}
				}
				else{
					Platform.runLater(new Runnable() {
					    public void run() {
					    	viewController.setFeuState("green");
					    }
					});
					
					generalElectroval.setActive(false);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Initialization of the boardComputer
	 */
	public void init(){
		GearSensor tmpGearSensor = null;
		DoorSensor tmpDoorSensor = null;
		Door tmpDoor = null;
		Gear tmpGear = null;
		
		requestState = 0;
		currentState = 0;
		
		openDoorsElectrovalve = new DoorElectrovalve();
		closeDoorsElectrovalve = new DoorElectrovalve();
		openGearsElectrovalve = new GearElectrovalve();
		closeGearsElectrovalve = new GearElectrovalve();
		setGeneralElectroval(new GeneralElectrovalve());

		for(int i=0; i<3; i++){
			tmpDoor = new Door(i);
			tmpGear = new Gear(i);
			
			doors.add(tmpDoor);
			gears.add(tmpGear);
			
			tmpDoorSensor = new DoorSensor(viewController,tmpDoor);
			tmpGearSensor = new GearSensor(viewController,tmpGear);
			
			doorSensors.add(tmpDoorSensor);
			gearSensors.add(tmpGearSensor);
			
			tmpDoorSensor.start();
			tmpGearSensor.start();
		}
		
		openDoorsElectrovalve.doors = doors;
		closeDoorsElectrovalve.doors = doors;
		openGearsElectrovalve.gears = gears;
		closeGearsElectrovalve.gears = gears;
		
		openDoorsElectrovalve.setGeneralElectroval(generalElectroval);
		closeDoorsElectrovalve.setGeneralElectroval(generalElectroval);
		openGearsElectrovalve.setGeneralElectroval(generalElectroval);
		closeGearsElectrovalve.setGeneralElectroval(generalElectroval);
		
	}

	/**
	 * Returns gearUsageStates.
	 * @return gearUsageStates 
	 */
	public ViewController getViewController() {
		return this.viewController;
	}

	/**
	 * Set the viewController
	 * @param newViewController
	 */
	public void setViewController(ViewController newViewController) {
		this.viewController = newViewController;
	}
	
	/**
	 * Get the openDoorsElectrovalve
	 * @return openDoorsElectrovalve
	 */
	public DoorElectrovalve getOpenDoorsElectrovalve() {
		return openDoorsElectrovalve;
	}

	/**
	 * Set the openDoorsElectrovalve
	 * @param openDoorsElectrovalve
	 */
	public void setOpenDoorsElectrovalve(DoorElectrovalve openDoorsElectrovalve) {
		this.openDoorsElectrovalve = openDoorsElectrovalve;
	}

	/**
	 * Get the closeDoorsElectrovalve
	 * @return closeDoorsElectrovalve
	 */
	public DoorElectrovalve getCloseDoorsElectrovalve() {
		return closeDoorsElectrovalve;
	}

	/**
	 * Set the closeDoorsElectrovalve
	 * @param closeDoorsElectrovalve
	 */
	public void setCloseDoorsElectrovalve(DoorElectrovalve closeDoorsElectrovalve) {
		this.closeDoorsElectrovalve = closeDoorsElectrovalve;
	}

	/**
	 * Get the openGearsElectrovalve
	 * @return openGearsElectrovalve
	 */
	public GearElectrovalve getOpenGearsElectrovalve() {
		return openGearsElectrovalve;
	}

	/**
	 * Set the openGearsElectrovalve
	 * @param openGearsElectrovalve
	 */
	public void setOpenGearsElectrovalve(GearElectrovalve openGearsElectrovalve) {
		this.openGearsElectrovalve = openGearsElectrovalve;
	}

	/**
	 * Get the closeGearsElectrovalve
	 * @return closeGearsElectrovalve
	 */
	public GearElectrovalve getCloseGearsElectrovalve() {
		return closeGearsElectrovalve;
	}

	/**
	 * Get the closeGearsElectrovalve
	 * @param closeGearsElectrovalve
	 */
	public void setCloseGearsElectrovalve(GearElectrovalve closeGearsElectrovalve) {
		this.closeGearsElectrovalve = closeGearsElectrovalve;
	}

	/**
	 * Get the generalElectroval
	 * @return generalElectroval
	 */
	public GeneralElectrovalve getGeneralElectroval() {
		return generalElectroval;
	}

	/**
	 * Set the generalElectroval
	 * @param generalElectroval
	 */
	public void setGeneralElectroval(GeneralElectrovalve generalElectroval) {
		this.generalElectroval = generalElectroval;
	}

	/**
	 * Get the requestState
	 * @return requestState
	 */
	public int getRequestState() {
		return requestState;
	}

	/**
	 * Set the requestState
	 * @param requestState
	 */
	public void setRequestState(int requestState) {
		this.requestState = requestState;
	}

	/**
	 * Get the currentState
	 * @return currentState
	 */
	public int getCurrentState() {
		return currentState;
	}

	/**
	 * Set the currentState
	 * @param currentState
	 */
	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}
}
