/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import java.util.HashSet;

import Application.ViewController;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of BoardComputer.
 * 
 * @author lemee
 */
public class BoardComputer {
	/**
	 * Description of the property viewController.
	 */
	public ViewController viewController = null;


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
	public ViewController getViewController() {
		return this.viewController;
	}

	/**
	 * Sets a value to attribute gearUsageStates. 
	 * @param newGearUsageStates 
	 */
	public void setViewController(ViewController newViewController) {
		this.viewController = newViewController;
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

	public void set(Object object) {
		// TODO Auto-generated method stub
		
	}

}
