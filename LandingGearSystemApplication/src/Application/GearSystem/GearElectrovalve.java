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
	
	private GeneralElectrovalve generalElectroval = null;

	public void setUp(){
		if(generalElectroval.isActive()){
			for(int i=0; i<gears.size(); i++){
				gears.get(i).setDown(false);
				gears.get(i).setUp(true);
				gears.get(i).setMoving(false);
			}
		}
	}
	
	public void setMoving(){
		if(generalElectroval.isActive()){
			for(int i=0; i<gears.size(); i++){
				gears.get(i).setDown(false);
				gears.get(i).setUp(false);
				gears.get(i).setMoving(true);
			}
		}
	}

	public void setDown(){
		if(generalElectroval.isActive()){
			for(int i=0; i<gears.size(); i++){
				gears.get(i).setDown(true);
				gears.get(i).setUp(false);
				gears.get(i).setMoving(false);
			}
		}
	}

	public GeneralElectrovalve getGeneralElectroval() {
		return generalElectroval;
	}

	public void setGeneralElectroval(GeneralElectrovalve generalElectroval) {
		this.generalElectroval = generalElectroval;
	}
}
