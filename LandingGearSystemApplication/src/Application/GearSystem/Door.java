/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Door.
 * 
 * @author lemee
 */
public class Door {
	/**
	 * Description of the property doorSensors.
	 */
	public HashSet<DoorSensor> doorSensors = new HashSet<DoorSensor>();

	/**
	 * Description of the property doorElectrovalves.
	 */
	public HashSet<DoorElectrovalve> doorElectrovalves = new HashSet<DoorElectrovalve>();

	// Start of user code (user defined attributes for Door)

	// End of user code

	/**
	 * The constructor.
	 */
	public Door() {
		// Start of user code constructor for Door)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Door)

	// End of user code
	/**
	 * Returns doorSensors.
	 * @return doorSensors 
	 */
	public HashSet<DoorSensor> getDoorSensors() {
		return this.doorSensors;
	}

	/**
	 * Returns doorElectrovalves.
	 * @return doorElectrovalves 
	 */
	public HashSet<DoorElectrovalve> getDoorElectrovalves() {
		return this.doorElectrovalves;
	}

}
