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
	private DoorElectrovalve openDoorsElectrovalve = null;
	private DoorElectrovalve closeDoorsElectrovalve = null;
	private GearElectrovalve openGearsElectrovalve = null;
	private GearElectrovalve clodeGearsElectrovalve = null;

	/**
	 * The constructor.
	 */
	public GeneralElectrovalve() {
		super();
	}

	/**
	 * Getter and Setter
	 */
	public DoorElectrovalve getOpenDoorsElectrovalve() {
		return openDoorsElectrovalve;
	}

	public void setOpenDoorsElectrovalve(DoorElectrovalve openDoorsElectrovalve) {
		this.openDoorsElectrovalve = openDoorsElectrovalve;
	}

	public DoorElectrovalve getCloseDoorsElectrovalve() {
		return closeDoorsElectrovalve;
	}

	public void setCloseDoorsElectrovalve(DoorElectrovalve closeDoorsElectrovalve) {
		this.closeDoorsElectrovalve = closeDoorsElectrovalve;
	}

	public GearElectrovalve getOpenGearsElectrovalve() {
		return openGearsElectrovalve;
	}

	public void setOpenGearsElectrovalve(GearElectrovalve openGearsElectrovalve) {
		this.openGearsElectrovalve = openGearsElectrovalve;
	}

	public GearElectrovalve getClodeGearsElectrovalve() {
		return clodeGearsElectrovalve;
	}

	public void setClodeGearsElectrovalve(GearElectrovalve clodeGearsElectrovalve) {
		this.clodeGearsElectrovalve = clodeGearsElectrovalve;
	}
}
