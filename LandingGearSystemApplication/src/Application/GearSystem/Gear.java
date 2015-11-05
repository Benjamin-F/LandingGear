/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Gear.
 * 
 * @author lemee
 */
public class Gear {
	/**
	 * Description of the property gearSensors.
	 */
	public GearSensor gearSensors = null;

	/**
	 * Description of the property gearElectrovalves.
	 */
	public GearElectrovalve gearElectrovalves = null;

	// Start of user code (user defined attributes for Gear)

	// End of user code

	/**
	 * The constructor.
	 */
	public Gear() {
		// Start of user code constructor for Gear)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Gear)

	// End of user code
	/**
	 * Returns gearSensors.
	 * @return gearSensors 
	 */
	public GearSensor getGearSensors() {
		return this.gearSensors;
	}

	/**
	 * Sets a value to attribute gearSensors. 
	 * @param newGearSensors 
	 */
	public void setGearSensors(GearSensor newGearSensors) {
		if (this.gearSensors != null) {
			this.gearSensors.set(null);
		}
		this.gearSensors.set(this);
	}

	/**
	 * Returns gearElectrovalves.
	 * @return gearElectrovalves 
	 */
	public GearElectrovalve getGearElectrovalves() {
		return this.gearElectrovalves;
	}

	/**
	 * Sets a value to attribute gearElectrovalves. 
	 * @param newGearElectrovalves 
	 */
	public void setGearElectrovalves(GearElectrovalve newGearElectrovalves) {
		if (this.gearElectrovalves != null) {
			this.gearElectrovalves.set(null);
		}
		this.gearElectrovalves.set(this);
	}

}
