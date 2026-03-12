package U7.QuackStax;

public class QuackStax {
	private Peg peg1;
	private Peg peg2;
	private Peg peg3;
	private int numDiscs;
	
	/**
	 * Initialize the stax and pegs
	 * @param number of discs in the game
	 */
	public QuackStax {
		// TODO implement constructor
		
		
	}
	/**
	 * solveStax - compute the solution.
	 */
	public void solveStax()
	{
		moveStax(peg1, peg3, peg2, numDiscs);
	}
	/**
	 * moveStax - recursive call to compute the solution.
	 * @param startPeg - peg to remove discs from
	 * @param endPeg - peg disc will end up on
	 * @param extraPeg - the extra peg
	 * @param numtoMove - how many discs to move
	 */
	private void moveStax(Peg startPeg, Peg endPeg, Peg extraPeg, int numtoMove)
	{
		// TODO move discs(number input) from the start peg to the end peg
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuackStax qs = new QuackStax(5);
		qs.solveStax();
	}

}