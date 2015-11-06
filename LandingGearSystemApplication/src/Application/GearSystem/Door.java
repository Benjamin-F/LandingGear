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
	
	public int getId(){
		return id;
	}

}
