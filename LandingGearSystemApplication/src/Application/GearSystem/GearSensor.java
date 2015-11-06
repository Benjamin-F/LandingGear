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
	
	//Gear
	private Gear gear = null;
	
	//Boolean
	private boolean isGearUp;
	private boolean isGearMoving;
	private boolean isGearDown;


	/**
	 * The constructor.
	 */
	public GearSensor() {

		super();
		isGearUp = true;
		isGearMoving = false;		
		isGearDown = false;
		
		gear = new Gear();
	}

	/**
	 * Returns gears.
	 * @return gears 
	 */
	public Gear getGears() {
		return this.gear;
	}

	/**
	 * Sets a value to attribute gears. 
	 * @param newGears 
	 */
	public void setGears(Gear newGears) {
		this.gear = newGears;
	}
	
	//Getters and Setters
	public boolean isGearUp() {
		return isGearUp;
	}

	public void setGearUp(boolean isGearUp) {
		this.isGearUp = isGearUp;
	}

	public boolean isGearMoving() {
		return isGearMoving;
	}

	public void setGearMoving(boolean isGearMoving) {
		this.isGearMoving = isGearMoving;
	}

	public boolean isGearDown() {
		return isGearDown;
	}

	public void setGearDown(boolean isGearDown) {
		this.isGearDown = isGearDown;
	}

}
