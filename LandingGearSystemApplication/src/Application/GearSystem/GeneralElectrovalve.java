/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import Application.GearSystem.Electrovalve;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of GeneralElectrovalve.
 * 
 * @author lemee
 */
public class GeneralElectrovalve extends Electrovalve {
	/**
	 * Description of the property gearElectrovalves.
	 */
	private boolean active;

	/**
	 * The constructor.
	 */
	public GeneralElectrovalve() {
		super();
		
		active = false;
	}

	/**
	 * Getter and Setter
	 */
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
