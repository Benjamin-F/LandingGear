/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Gear.
 * 
 * @author lemee
 */
public class Gear {
	
	private boolean up;
	private boolean moving;
	private boolean down;
	
	private int id;
	
	/**
	 * Know if the gear is up
	 * @return up
	 */
	public boolean isUp() {
		return up;
	}

	/**
	 * Set state up
	 * @param up
	 */
	public void setUp(boolean up) {
		this.up = up;
	}

	/**
	 * Know if the gear is moving
	 * @return moving
	 */
	public boolean isMoving() {
		return moving;
	}

	/**
	 * Set state moving
	 * @param moving
	 */
	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	/**
	 * Know if the gear is down
	 * @return down
	 */
	public boolean isDown() {
		return down;
	}

	/**
	 * Set state down
	 * @param down
	 */
	public void setDown(boolean down) {
		this.down = down;
	}
	
	/**
	 * Get id of the gear
	 * @return id
	 */
	public int getId(){
		return id;
	}

	
	/**
	 * The constructor.
	 */
	public Gear(int id) {
		super();
		up = true;
		moving = false;
		down = false;
		
		this.id = id;
	}
}
