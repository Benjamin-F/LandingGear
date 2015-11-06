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
 * Description of GearSensor.
 * 
 * @author lemee
 */
public class GearSensor extends Sensor {
	
	@Override
	public void run(){
		while(true){
			try {
				if(gear.isMoving()){
					Platform.runLater(new Runnable() {
					    public void run() {
					    	viewController.setGearState(gear.getId(), "moving");
					    }
					});
				}
				else if(gear.isDown()){
					Platform.runLater(new Runnable() {
					    public void run() {
					    	viewController.setGearState(gear.getId(), "extracted");
					    }
					});
				}
				else if(gear.isUp()){
					Platform.runLater(new Runnable() {
					    public void run() {
					    	viewController.setGearState(gear.getId(), "retracted");
					    }
					});
				}
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	//Gear
	private Gear gear = null;

	/**
	 * The constructor.
	 */
	public GearSensor(ViewController viewController, Gear gear) {
		super(viewController);
		
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

}
