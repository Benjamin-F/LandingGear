/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of GearUsageState.
 * 
 * @author lemee
 */
public class GearUsageState {
	/**
	 * Description of the property boardComputers.
	 */
	public BoardComputer boardComputers = null;

	// Start of user code (user defined attributes for GearUsageState)

	// End of user code

	/**
	 * The constructor.
	 */
	public GearUsageState() {
		// Start of user code constructor for GearUsageState)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for GearUsageState)

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
