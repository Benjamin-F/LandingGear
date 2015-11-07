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
 * Move the doors
 * @author lemee
 */
public class DoorElectrovalve extends Electrovalve {
	/**
	 * Description of the property doors.
	 * Doors which can be set by the doorElectrovalve
	 */
	public ArrayList<Door> doors;
	
	private GeneralElectrovalve generalElectroval = null;

	/**
	 * Set doors to opened state
	 */
	public void setOpen(){
		if(generalElectroval.isActive()){
			for(int i=0; i<doors.size(); i++){
				doors.get(i).setOpen(true);
				doors.get(i).setMoving(false);
				doors.get(i).setClosed(false);
			}
		}
	}
	
	/**
	 * Set doors to moving state
	 */
	public void setMoving(){
		if(generalElectroval.isActive()){
			for(int i=0; i<doors.size(); i++){
				doors.get(i).setOpen(false);
				doors.get(i).setMoving(true);
				doors.get(i).setClosed(false);
			}
		}
	}
	
	/**
	 * Set doors to closed state
	 */
	public void setClosed(){
		if(generalElectroval.isActive()){
			for(int i=0; i<doors.size(); i++){
				doors.get(i).setOpen(false);
				doors.get(i).setMoving(false);
				doors.get(i).setClosed(true);
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
