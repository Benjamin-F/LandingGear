/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import java.util.ArrayList;
import java.util.HashSet;

import Application.ViewController;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of BoardComputer.
 * 
 * @author lemee
 */
public class BoardComputer {
	/**
	 * Description of the property viewController.
	 */
	public ViewController viewController = null;

	private DoorElectrovalve OpenDoorsElectrovalve = null;
	private DoorElectrovalve CloseDoorsElectrovalve = null;
	private GearElectrovalve OpenGearsElectrovalve = null;
	private GearElectrovalve ClodeGearsElectrovalve = null;

	private ArrayList<Sensor> doorSensors = new ArrayList<Sensor>();
	private ArrayList<Sensor> gearSensors = new ArrayList<Sensor>();
	
	private ArrayList<Door> doors = new ArrayList<Door>();
	private ArrayList<Gear> gears = new ArrayList<Gear>();
	

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
		
		OpenDoorsElectrovalve = new DoorElectrovalve();
		CloseDoorsElectrovalve = new DoorElectrovalve();
		OpenGearsElectrovalve = new GearElectrovalve();
		ClodeGearsElectrovalve = new GearElectrovalve();

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
		
		OpenDoorsElectrovalve.doors = doors;
		CloseDoorsElectrovalve.doors = doors;
		OpenGearsElectrovalve.gears = gears;
		ClodeGearsElectrovalve.gears = gears;
		
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
	 * Sets a value to attribute gearUsageStates. 
	 * @param newGearUsageStates 
	 */
	public void setViewController(ViewController newViewController) {
		this.viewController = newViewController;
	}
}
