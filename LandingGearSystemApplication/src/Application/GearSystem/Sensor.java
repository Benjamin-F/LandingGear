/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/
package Application.GearSystem;

import Application.View.ViewController;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Sensor.
 * Check state of doors and gears 
 * @author lemee
 */
public abstract class Sensor extends Thread{
	
	public BoardComputer boardComputers = null;

	protected ViewController viewController = null;

	/**
	 * Constructor
	 * @param viewController
	 */
	public Sensor(ViewController viewController) {
		super();
		
		this.viewController = viewController;
	}
	
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
