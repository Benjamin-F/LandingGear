/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import java.util.ArrayList;

import Application.View.ViewController;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of BoardComputer.
 * 
 * @author lemee
 */
public class BoardComputer{
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
	
	private String request = null;
	private String currentRequest = null;
	
	private BoardComputerThread boardComputerThread = null;

	/**
	 * The constructor.
	 */
	public BoardComputer() {
		super();
	}
	
	public void init(){
		GearSensor tmpGearSensor = null;
		DoorSensor tmpDoorSensor = null;
		Door tmpDoor = null;
		Gear tmpGear = null;
		
		openDoorsElectrovalve = new DoorElectrovalve();
		closeDoorsElectrovalve = new DoorElectrovalve();
		openGearsElectrovalve = new GearElectrovalve();
		closeGearsElectrovalve = new GearElectrovalve();
		generalElectroval = new GeneralElectrovalve();

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
		
		generalElectroval.setCloseGearsElectrovalve(closeGearsElectrovalve);
		generalElectroval.setCloseDoorsElectrovalve(closeDoorsElectrovalve);
		generalElectroval.setOpenDoorsElectrovalve(openDoorsElectrovalve);
		generalElectroval.setOpenGearsElectrovalve(openGearsElectrovalve);
		
		openDoorsElectrovalve.setMoving();
		
		boardComputerThread = new BoardComputerThread();
		boardComputerThread.setBoardComputer(this);
		//boardComputerThread.start();
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

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getCurrentRequest() {
		return currentRequest;
	}

	public void setCurrentRequest(String currentRequest) {
		this.currentRequest = currentRequest;
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

	public BoardComputerThread getBoardComputerThread() {
		return boardComputerThread;
	}

	public void setBoardComputerThread(BoardComputerThread boardComputerThread) {
		this.boardComputerThread = boardComputerThread;
	}
}
