/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of BoardComputer.
 * 
 * @author lemee
 */
public class BoardComputer {
	/**
	 * Description of the property gearUsageStates.
	 */
	public GearUsageState gearUsageStates = null;

	/**
	 * Description of the property handles.
	 */
	public Handle handles = null;

	/**
	 * Description of the property electrovalves.
	 */
	public HashSet<Electrovalve> electrovalves = new HashSet<Electrovalve>();

	/**
	 * Description of the property sensors.
	 */
	public HashSet<Sensor> sensors = new HashSet<Sensor>();

	// Start of user code (user defined attributes for BoardComputer)

	// End of user code

	/**
	 * The constructor.
	 */
	public BoardComputer() {
		// Start of user code constructor for BoardComputer)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for BoardComputer)

	// End of user code
	/**
	 * Returns gearUsageStates.
	 * @return gearUsageStates 
	 */
	public GearUsageState getGearUsageStates() {
		return this.gearUsageStates;
	}

	/**
	 * Sets a value to attribute gearUsageStates. 
	 * @param newGearUsageStates 
	 */
	public void setGearUsageStates(GearUsageState newGearUsageStates) {
		if (this.gearUsageStates != null) {
			this.gearUsageStates.set(null);
		}
		this.gearUsageStates.set(this);
	}

	/**
	 * Returns handles.
	 * @return handles 
	 */
	public Handle getHandles() {
		return this.handles;
	}

	/**
	 * Sets a value to attribute handles. 
	 * @param newHandles 
	 */
	public void setHandles(Handle newHandles) {
		if (this.handles != null) {
			this.handles.set(null);
		}
		this.handles.set(this);
	}

	/**
	 * Returns electrovalves.
	 * @return electrovalves 
	 */
	public HashSet<Electrovalve> getElectrovalves() {
		return this.electrovalves;
	}

	/**
	 * Returns sensors.
	 * @return sensors 
	 */
	public HashSet<Sensor> getSensors() {
		return this.sensors;
	}

}
