/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import java.util.HashSet;

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
	private DoorElectrovalve OpenDoorsElectrovalve = null;
	private DoorElectrovalve CloseDoorsElectrovalve = null;
	private GearElectrovalve OpenGearsElectrovalve = null;
	private GearElectrovalve ClodeGearsElectrovalve = null;

	/**
	 * The constructor.
	 */
	public GeneralElectrovalve() {
		super();
	}

	public DoorElectrovalve getOpenDoorsElectrovalve() {
		return OpenDoorsElectrovalve;
	}

	public void setOpenDoorsElectrovalve(DoorElectrovalve openDoorsElectrovalve) {
		OpenDoorsElectrovalve = openDoorsElectrovalve;
	}

	public DoorElectrovalve getCloseDoorsElectrovalve() {
		return CloseDoorsElectrovalve;
	}

	public void setCloseDoorsElectrovalve(DoorElectrovalve closeDoorsElectrovalve) {
		CloseDoorsElectrovalve = closeDoorsElectrovalve;
	}

	public GearElectrovalve getOpenGearsElectrovalve() {
		return OpenGearsElectrovalve;
	}

	public void setOpenGearsElectrovalve(GearElectrovalve openGearsElectrovalve) {
		OpenGearsElectrovalve = openGearsElectrovalve;
	}

	public GearElectrovalve getClodeGearsElectrovalve() {
		return ClodeGearsElectrovalve;
	}

	public void setClodeGearsElectrovalve(GearElectrovalve clodeGearsElectrovalve) {
		ClodeGearsElectrovalve = clodeGearsElectrovalve;
	}


}
