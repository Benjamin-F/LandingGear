/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import Application.GearSystem.Sensor;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of DoorSensor.
 * 
 * @author lemee
 */
public class DoorSensor extends Sensor {
	
	public void run(){
		//Test en continu
	}
	
	//Door
	private Door door = null;
	
	//Booleans
	private boolean isDoorOpen;
	private boolean isDoorMoving;
	private boolean isDoorClosed;
	

	/**
	 * The constructor.
	 */
	public DoorSensor() {
		
		super();
		isDoorOpen = false;
		isDoorMoving = false;
		isDoorClosed = true;
	
		door = new Door();
	}

	
	/**
	 * Returns doors.
	 * @return doors 
	 */
	public Door getDoor() {
		return this.door;
	}

	/**
	 * Sets a value to attribute doors. 
	 * @param newDoors 
	 */
	public void setDoor(Door newDoors) {
		this.door = newDoors;
	}
	
	//Getters and Setters
	public boolean isDoorOpen() {
		return isDoorOpen;
	}

	public void setDoorOpen(boolean isDoorOpen) {
		this.isDoorOpen = isDoorOpen;
	}

	public boolean isDoorMoving() {
		return isDoorMoving;
	}

	public void setDoorMoving(boolean isDoorMoving) {
		this.isDoorMoving = isDoorMoving;
	}

	public boolean isDoorClosed() {
		return isDoorClosed;
	}

	public void setDoorClosed(boolean isDoorClosed) {
		this.isDoorClosed = isDoorClosed;
	}

}
