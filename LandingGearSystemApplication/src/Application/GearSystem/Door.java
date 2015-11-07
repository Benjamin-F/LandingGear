/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;


// Start of user code (user defined imports)

// End of user code

/**
 * Description of Door.
 * 
 * @author lemee
 */
public class Door {
	
	private boolean open;
	private boolean moving;
	private boolean closed;
	
	private int id;
	
	/**
	 * The constructor.
	 */
	public Door(int id) {
		super();
		open = false;
		moving = false;
		closed = true;
		
		this.id = id;
	}

	/**
	 * Know if the door is opened
	 * @return
	 */
	public boolean isOpen() {
		return open;
	}

	/**
	 * Set open state
	 * @param open
	 */
	public void setOpen(boolean open) {
		this.open = open;
	}

	/**
	 * Set moving state
	 * @return moving
	 */
	public boolean isMoving() {
		return moving;
	}

	/**
	 * Know if the door is moving
	 * @param moving
	 */
	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	/**
	 * Know if the door is closed
	 * @return closed
	 */
	public boolean isClosed() {
		return closed;
	}

	/**
	 * Set closed state
	 * @param closed
	 */
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	
	/**
	 * Get id of the door
	 * @return id
	 */
	public int getId(){
		return id;
	}

}
