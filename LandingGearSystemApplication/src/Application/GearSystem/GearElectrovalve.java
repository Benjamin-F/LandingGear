/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import Application.GearSystem.Electrovalve;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of GearElectrovalve.
 * 
 * @author lemee
 */
public class GearElectrovalve extends Electrovalve {
	/**
	 * Description of the property gears.
	 */
	public Gear gears = null;

	/**
	 * Description of the property generalElectrovalves.
	 */
	public GeneralElectrovalve generalElectrovalves = null;

	// Start of user code (user defined attributes for GearElectrovalve)

	// End of user code

	/**
	 * The constructor.
	 */
	public GearElectrovalve() {
		// Start of user code constructor for GearElectrovalve)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for GearElectrovalve)

	// End of user code
	/**
	 * Returns gears.
	 * @return gears 
	 */
	public Gear getGears() {
		return this.gears;
	}

	/**
	 * Sets a value to attribute gears. 
	 * @param newGears 
	 */
	public void setGears(Gear newGears) {
		if (this.gears != null) {
			this.gears.set(null);
		}
		this.gears.set(this);
	}

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

}
