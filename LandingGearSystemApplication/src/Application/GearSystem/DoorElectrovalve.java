/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import java.util.ArrayList;

import Application.GearSystem.Electrovalve;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of DoorElectrovalve.
 * 
 * @author lemee
 */
public class DoorElectrovalve extends Electrovalve {
	/**
	 * Description of the property doors.
	 */
	public ArrayList<Door> doors;
	
	private GeneralElectrovalve generalElectroval = null;

	public void setOpen(){
		if(generalElectroval.isActive()){
			for(int i=0; i<doors.size(); i++){
				doors.get(i).setOpen(true);
				doors.get(i).setMoving(false);
				doors.get(i).setClosed(false);
			}
		}
	}
	
	public void setMoving(){
		if(generalElectroval.isActive()){
			for(int i=0; i<doors.size(); i++){
				doors.get(i).setOpen(false);
				doors.get(i).setMoving(true);
				doors.get(i).setClosed(false);
			}
		}
	}
	
	public void setClosed(){
		if(generalElectroval.isActive()){
			for(int i=0; i<doors.size(); i++){
				doors.get(i).setOpen(false);
				doors.get(i).setMoving(false);
				doors.get(i).setClosed(true);
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
