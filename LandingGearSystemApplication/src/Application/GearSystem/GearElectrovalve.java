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
	public Gear gear;

	public void setUp(){
		gear.setUp(true);
		gear.setDown(false);
		gear.setMoving(false);
	}
	
	public void setMoving(){
		gear.setUp(false);
		gear.setDown(true);
		gear.setMoving(false);
	}
	
	public void setDown(){
		gear.setUp(false);
		gear.setDown(true);
		gear.setMoving(false);
	}
}
