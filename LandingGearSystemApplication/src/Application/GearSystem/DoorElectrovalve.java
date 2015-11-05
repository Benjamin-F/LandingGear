/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import Application.GearSystem.Electrovalve;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of DoorElectrovalve.
 * 
 * @author lemee
 */
public class DoorElectrovalve extends Electrovalve {
	/**
	 * Description of the property generalElectrovalves.
	 */
	public GeneralElectrovalve generalElectrovalves = null;

	/**
	 * Description of the property doors.
	 */
	public Door doors = null;

	// Start of user code (user defined attributes for DoorElectrovalve)

	// End of user code

	/**
	 * The constructor.
	 */
	public DoorElectrovalve() {
		// Start of user code constructor for DoorElectrovalve)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for DoorElectrovalve)

	// End of user code
	/**
	 * Returns generalElectrovalves.
	 * @return generalElectrovalves 
	 */
	public GeneralElectrovalve getGeneralElectrovalves() {
		return this.generalElectrovalves;
	}

	/**
	 * Sets a value to attribute generalElectrovalves. 
	 * @param newGeneralElectrovalves 
	 */
	public void setGeneralElectrovalves(GeneralElectrovalve newGeneralElectrovalves) {
		this.generalElectrovalves = newGeneralElectrovalves;
	}

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
