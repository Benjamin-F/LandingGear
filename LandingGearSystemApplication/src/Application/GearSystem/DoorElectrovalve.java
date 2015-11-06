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

	public void setOpen(){
		for(int i=0; i<doors.size(); i++){
			doors.get(i).setOpen(true);
			doors.get(i).setMoving(false);
			doors.get(i).setClosed(false);
		}
	}
	
	public void setMoving(){
		for(int i=0; i<doors.size(); i++){
			doors.get(i).setOpen(false);
			doors.get(i).setMoving(true);
			doors.get(i).setClosed(false);
		}
	}
	
	public void setClosed(){
		for(int i=0; i<doors.size(); i++){
			doors.get(i).setOpen(false);
			doors.get(i).setMoving(false);
			doors.get(i).setClosed(true);
		}
	}

}
