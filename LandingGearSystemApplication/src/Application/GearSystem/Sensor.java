/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import Application.View.ViewController;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Sensor.
 * 
 * @author lemee
 */
public abstract class Sensor extends Thread{
	
	/**
	 * Description of the property boardComputers.
	 */
	public BoardComputer boardComputers = null;

	protected ViewController viewController = null;

	/**
	 * The constructor.
	 */
	public Sensor(ViewController viewController) {
		super();
		
		this.viewController = viewController;
	}

	// Start of user code (user defined methods for Sensor)

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
		this.boardComputers = newBoardComputers;
	}

}
