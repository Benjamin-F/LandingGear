/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import Application.GearSystem.Sensor;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of GearSensor.
 * 
 * @author lemee
 */
public class GearSensor extends Sensor {
	/**
	 * Description of the property gears.
	 */
	public Gear gears = null;

	// Start of user code (user defined attributes for GearSensor)

	// End of user code

	/**
	 * The constructor.
	 */
	public GearSensor() {
		// Start of user code constructor for GearSensor)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for GearSensor)

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

	public void set(Gear gear) {
		// TODO Auto-generated method stub
		
	}

}
