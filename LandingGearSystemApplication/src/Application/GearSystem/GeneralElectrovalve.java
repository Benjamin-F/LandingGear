/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import Application.GearSystem.Electrovalve;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of GeneralElectrovalve.
 * Move doors or gears
 * @author lemee
 */
public class GeneralElectrovalve extends Electrovalve {
	/**
	 * Description of the property gearElectrovalves.
	 * True if the general electrovalve is stimulated
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
	 * Get active
	 * @return active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * Set active
	 * @param active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
