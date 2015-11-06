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
	
	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}
	
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
