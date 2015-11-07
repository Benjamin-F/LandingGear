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
 * 
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

	// Start of user code (user defined methods for BoardComputer)

	// End of user code
	/**
	 * Returns gearUsageStates.
	 * @return gearUsageStates 
	 */
	public ViewController getViewController() {
		return this.viewController;
	}

	/**
	 * Getter and Setter
	 */
	public void setViewController(ViewController newViewController) {
		this.viewController = newViewController;
	}
	
	public DoorElectrovalve getOpenDoorsElectrovalve() {
		return openDoorsElectrovalve;
	}

	public void setOpenDoorsElectrovalve(DoorElectrovalve openDoorsElectrovalve) {
		this.openDoorsElectrovalve = openDoorsElectrovalve;
	}

	public DoorElectrovalve getCloseDoorsElectrovalve() {
		return closeDoorsElectrovalve;
	}

	public void setCloseDoorsElectrovalve(DoorElectrovalve closeDoorsElectrovalve) {
		this.closeDoorsElectrovalve = closeDoorsElectrovalve;
	}

	public GearElectrovalve getOpenGearsElectrovalve() {
		return openGearsElectrovalve;
	}

	public void setOpenGearsElectrovalve(GearElectrovalve openGearsElectrovalve) {
		this.openGearsElectrovalve = openGearsElectrovalve;
	}

	public GearElectrovalve getCloseGearsElectrovalve() {
		return closeGearsElectrovalve;
	}

	public void setCloseGearsElectrovalve(GearElectrovalve closeGearsElectrovalve) {
		this.closeGearsElectrovalve = closeGearsElectrovalve;
	}

	public GeneralElectrovalve getGeneralElectroval() {
		return generalElectroval;
	}

	public void setGeneralElectroval(GeneralElectrovalve generalElectroval) {
		this.generalElectroval = generalElectroval;
	}

	public int getRequestState() {
		return requestState;
	}

	public void setRequestState(int requestState) {
		this.requestState = requestState;
	}

	public int getCurrentState() {
		return currentState;
	}

	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}
}
