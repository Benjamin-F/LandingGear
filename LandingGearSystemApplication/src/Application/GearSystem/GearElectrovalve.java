/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import java.util.ArrayList;

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
	public ArrayList<Gear> gears;

	public void setUp(){
		for(int i=0; i<gears.size(); i++){
			gears.get(i).setDown(false);
			gears.get(i).setUp(true);
			gears.get(i).setMoving(false);
		}
	}
	
	public void setMoving(){
		for(int i=0; i<gears.size(); i++){
			gears.get(i).setDown(false);
			gears.get(i).setUp(false);
			gears.get(i).setMoving(true);
		}
	}

	public void setDown(){
		for(int i=0; i<gears.size(); i++){
			gears.get(i).setDown(true);
			gears.get(i).setUp(false);
			gears.get(i).setMoving(false);
		}
	}
}
