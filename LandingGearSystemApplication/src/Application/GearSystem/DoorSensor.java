/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import Application.GearSystem.Sensor;
import Application.View.ViewController;
// Start of user code (user defined imports)
import javafx.application.Platform;

// End of user code

/**
 * Description of DoorSensor.
 * Check state of doors
 * @author lemee
 */
public class DoorSensor extends Sensor {
	
	@Override
	public void run(){
		while(true){
			try {
				if(door.isMoving()){
					Platform.runLater(new Runnable() {
					    public void run() {
					    	viewController.setDoorState(door.getId(), "moving");
					    }
					});
				}
				else if(door.isClosed()){
					Platform.runLater(new Runnable() {
					    public void run() {
					    	viewController.setDoorState(door.getId(), "closed");
					    }
					});
				}
				else if(door.isOpen()){
					Platform.runLater(new Runnable() {
					    public void run() {
					    	viewController.setDoorState(door.getId(), "opened");
					    }
					});
				}
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private Door door = null;
	
	/**
	 * The constructor.
	 */
	public DoorSensor(ViewController viewController, Door door) {
		
		super(viewController);
	
		this.door = door;
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
}
