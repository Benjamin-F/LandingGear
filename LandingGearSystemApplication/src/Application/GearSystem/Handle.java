/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Handle.
 * 
 * @author lemee
 */
public class Handle {
	/**
	 * Description of the property boardComputers.
	 */
	public BoardComputer boardComputers = null;

	// Start of user code (user defined attributes for Handle)

	// End of user code

	/**
	 * The constructor.
	 */
	public Handle() {
		// Start of user code constructor for Handle)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Handle)

	// End of user code
	/**
	 * Returns boardComputers.
	 * @return boardComputers 
	 */
	public BoardComputer getBoardComputers() {
		return this.boardComputers;
	}

	/**
	 * Sets a value to attribute boardComputers. 
	 * @param newBoardComputers 
	 */
	public void setBoardComputers(BoardComputer newBoardComputers) {
		if (this.boardComputers != null) {
			this.boardComputers.set(null);
		}
		this.boardComputers.set(this);
	}

}
