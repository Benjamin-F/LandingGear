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
 * Move the gears
 * @author lemee
 */
public class GearElectrovalve extends Electrovalve {
	/**
	 * Description of the property gears.
	 * Gears which can be set by the gearElectrovalve
	 */
	public ArrayList<Gear> gears;
	
	private GeneralElectrovalve generalElectroval = null;

	/**
	 * Set gears to up state
	 */
	public void setUp(){
		if(generalElectroval.isActive()){
			for(int i=0; i<gears.size(); i++){
				gears.get(i).setDown(false);
				gears.get(i).setUp(true);
				gears.get(i).setMoving(false);
			}
		}
	}
	
	/**
	 * Set gears to moving state
	 */
	public void setMoving(){
		if(generalElectroval.isActive()){
			for(int i=0; i<gears.size(); i++){
				gears.get(i).setDown(false);
				gears.get(i).setUp(false);
				gears.get(i).setMoving(true);
			}
		}
	}

	/**
	 * Set gears to down state
	 */
	public void setDown(){
		if(generalElectroval.isActive()){
			for(int i=0; i<gears.size(); i++){
				gears.get(i).setDown(true);
				gears.get(i).setUp(false);
				gears.get(i).setMoving(false);
			}
		}
	}

	/**
	 * Get the generalElectroval
	 * @return generalElectroval
	 */
	public GeneralElectrovalve getGeneralElectroval() {
		return generalElectroval;
	}

	/**
	 * Set the generalElectroval
	 * @param generalElectroval
	 */
	public void setGeneralElectroval(GeneralElectrovalve generalElectroval) {
		this.generalElectroval = generalElectroval;
	}
}
