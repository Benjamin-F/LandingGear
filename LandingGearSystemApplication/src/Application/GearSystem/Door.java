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
	
	/**
	 * The constructor.
	 */
	public Door() {
		// Start of user code constructor for Door)
		super();
		open = false;
		moving = false;
		closed = true;
		// End of user code
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}
}
