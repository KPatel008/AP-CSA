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
	public QuackStax(int number) {
		// TODO implement constructor
		numDiscs = number;
		peg1 = new Peg(1, numDiscs);
		peg2 = new Peg(2, numDiscs);
		peg3 = new Peg(3, numDiscs);
		for (int i = numDiscs; i > 0; i--) {
			peg1.addDisc(i);
		}
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
		if (numtoMove <= 0) {
			return;
		}
		else {
			moveStax(startPeg, extraPeg, endPeg, numtoMove - 1);
			startPeg.moveTopDisc(endPeg);
			moveStax(extraPeg, endPeg, startPeg, numtoMove - 1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuackStax qs = new QuackStax(5);
		qs.solveStax();
	}

}

// Moving disc 1 from peg 1 to peg 3
// Moving disc 2 from peg 1 to peg 2
// Moving disc 1 from peg 3 to peg 2
// Moving disc 3 from peg 1 to peg 3
// Moving disc 1 from peg 2 to peg 1
// Moving disc 2 from peg 2 to peg 3
// Moving disc 1 from peg 1 to peg 3
// Moving disc 4 from peg 1 to peg 2
// Moving disc 1 from peg 3 to peg 2
// Moving disc 2 from peg 3 to peg 1
// Moving disc 1 from peg 2 to peg 1
// Moving disc 3 from peg 3 to peg 2
// Moving disc 1 from peg 1 to peg 3
// Moving disc 2 from peg 1 to peg 2
// Moving disc 1 from peg 3 to peg 2
// Moving disc 5 from peg 1 to peg 3
// Moving disc 1 from peg 2 to peg 1
// Moving disc 2 from peg 2 to peg 3
// Moving disc 1 from peg 1 to peg 3
// Moving disc 3 from peg 2 to peg 1
// Moving disc 1 from peg 3 to peg 2
// Moving disc 2 from peg 3 to peg 1
// Moving disc 1 from peg 2 to peg 1
// Moving disc 4 from peg 2 to peg 3
// Moving disc 1 from peg 1 to peg 3
// Moving disc 2 from peg 1 to peg 2
// Moving disc 1 from peg 3 to peg 2
// Moving disc 3 from peg 1 to peg 3
// Moving disc 1 from peg 2 to peg 1
// Moving disc 2 from peg 2 to peg 3
// Moving disc 1 from peg 1 to peg 3