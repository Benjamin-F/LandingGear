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
	/**
	 * Description of the property doors.
	 */
	public Door doors = null;

	// Start of user code (user defined attributes for DoorSensor)

	// End of user code

	/**
	 * The constructor.
	 */
	public DoorSensor() {
		// Start of user code constructor for DoorSensor)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for DoorSensor)

	// End of user code
	/**
	 * Returns doors.
	 * @return doors 
	 */
	public Door getDoors() {
		return this.doors;
	}

	/**
	 * Sets a value to attribute doors. 
	 * @param newDoors 
	 */
	public void setDoors(Door newDoors) {
		this.doors = newDoors;
	}

}
