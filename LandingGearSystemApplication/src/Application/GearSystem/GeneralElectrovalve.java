/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import java.util.HashSet;

import Application.GearSystem.Electrovalve;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of GeneralElectrovalve.
 * 
 * @author lemee
 */
public class GeneralElectrovalve extends Electrovalve {
	/**
	 * Description of the property gearElectrovalves.
	 */
	public HashSet<GearElectrovalve> gearElectrovalves = new HashSet<GearElectrovalve>();

	/**
	 * Description of the property doorElectrovalves.
	 */
	public HashSet<DoorElectrovalve> doorElectrovalves = new HashSet<DoorElectrovalve>();

	// Start of user code (user defined attributes for GeneralElectrovalve)

	// End of user code

	/**
	 * The constructor.
	 */
	public GeneralElectrovalve() {
		// Start of user code constructor for GeneralElectrovalve)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for GeneralElectrovalve)

	// End of user code
	/**
	 * Returns gearElectrovalves.
	 * @return gearElectrovalves 
	 */
	public HashSet<GearElectrovalve> getGearElectrovalves() {
		return this.gearElectrovalves;
	}

	/**
	 * Returns doorElectrovalves.
	 * @return doorElectrovalves 
	 */
	public HashSet<DoorElectrovalve> getDoorElectrovalves() {
		return this.doorElectrovalves;
	}

}
