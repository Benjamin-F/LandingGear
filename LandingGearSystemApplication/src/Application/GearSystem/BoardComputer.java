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


	/**
	 * Description of the property electrovalves.
	 */
	public HashSet<Electrovalve> electrovalves = new HashSet<Electrovalve>();

	
	public ArrayList<Sensor> doorSensors = new ArrayList<Sensor>();
	public ArrayList<Sensor> gearSensors = new ArrayList<Sensor>();
	
	public ArrayList<Door> doors = new ArrayList<Door>();
	public ArrayList<Gear> gears = new ArrayList<Gear>();

	/**
	 * The constructor.
	 */
	public BoardComputer() {
		super();
		
		GearSensor tmpGearSensor = null;
		DoorSensor tmpDoorSensor = null;
		Door tmpDoor = null;
		Gear tmpGear = null;

		for(int i=0; i<3; i++){
			tmpDoor = new Door();
			tmpGear = new Gear();
			
			doors.add(tmpDoor);
			gears.add(tmpGear);
			
			tmpDoorSensor = new DoorSensor();
			tmpDoorSensor.setDoor(tmpDoor);
			
			tmpGearSensor = new GearSensor();
			tmpGearSensor.setGear(tmpGear);
			
			doorSensors.add(tmpDoorSensor);
			gearSensors.add(tmpGearSensor);
			
			tmpDoorSensor.start();
			tmpGearSensor.start();
		}
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

	/**
	 * Returns electrovalves.
	 * @return electrovalves 
	 */
	public HashSet<Electrovalve> getElectrovalves() {
		return this.electrovalves;
	}

	public void set(Object object) {
		// TODO Auto-generated method stub
		
	}
	
	public void pushDown(){
		
	}

}
