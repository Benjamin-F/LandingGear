/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

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
	public Door door;

	public void setOpen(){
		door.setOpen(true);
		door.setClosed(false);
		door.setMoving(false);
	}
	
	public void setMoving(){
		door.setOpen(false);
		door.setClosed(false);
		door.setMoving(true);
	}
	
	public void setClosed(){
		door.setOpen(false);
		door.setClosed(true);
		door.setMoving(false);
	}

}
