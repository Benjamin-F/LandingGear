/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import Application.ViewController;
import Application.GearSystem.Sensor;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of GearSensor.
 * 
 * @author lemee
 */
public class GearSensor extends Sensor {
	
	public void run(){
		while(true){
			try {
				viewController.setFeuState("orange");
				Thread.sleep(1000);
				viewController.setFeuState("red");
				Thread.sleep(1000);
				viewController.setFeuState("green");
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	//Gear
	private Gear gear = null;
	
	//Boolean
	private boolean isGearUp;
	private boolean isGearMoving;
	private boolean isGearDown;


	/**
	 * The constructor.
	 */
	public GearSensor(ViewController viewController, Gear gear) {
		super(viewController);
		isGearUp = true;
		isGearMoving = false;		
		isGearDown = false;
		
		this.gear = gear;
	}

	/**
	 * Returns gears.
	 * @return gears 
	 */
	public Gear getGear() {
		return this.gear;
	}

	/**
	 * Sets a value to attribute gears. 
	 * @param newGears 
	 */
	public void setGear(Gear newGears) {
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
