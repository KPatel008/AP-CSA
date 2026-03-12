package U7.QuackStax;

import java.util.Arrays;
public class Peg {
	private int pegNum;
	private int[] discs;   // array of discs - bottom disc is in position 0
						   // the discs are integers which represent their size
	private int count;     // the number of discs currently on the peg.
	
	/**
	 * Peg constructor
	 * @param p   peg number
	 * @param num number of discs in the game
	 */
	public Peg(int peg, int num)
	{
		
	}
	/**
	 * getPegNum - returns the peg number
	 * @return peg number, 1,2 or 3
	 */
	public int getPegNum()
	{
		return pegNum;
	}
		
	public String toString()
	{
		String s = "Peg " + pegNum;
		return s;
	}
	/**
	 * discs are represented by integers
	 * the bigger the number, the bigger the disc
	 * @param whichOne
	 * @return  true if you are able to successfully
	 * add the disc to the peg.
	 */
	public boolean addDisc(int whichOne)
	{
		// TODO add the disc with the given number to the top of the stack on the peg.
		// don't forget to make sure the move is value (no disc on top of a smaller one)
	}
	/**
	 * Remove the top disc from the peg.  
	 * @return  the disc number removed
	 */
	public int popDisc()
	{
		// TODO remove the top disc from the peg.  Return its value.
		
	}
	/**
	 * moveTopDisc - take the top disc of the peg and
	 * add it to the new peg
	 * @param newPeg
	 * @return  success of move
	 */
	public boolean moveTopDisc(Peg newPeg)
	{
		int disc = popDisc();
		if (newPeg.addDisc(disc))
		{
			System.out.println("Moving disc " + disc + " from peg " + pegNum + " to peg " + newPeg.getPegNum());
			return true;
		}
		else{
			System.out.println("Bad Move");
			return false;
		}
	}
	public static void main(String [] arg) {
		Peg p1 = new Peg(1,5);
		p1.addDisc(3);
		System.out.println(Arrays.toString(p1.discs));
		p1.addDisc(2);
		System.out.println(Arrays.toString(p1.discs));
		p1.addDisc(4);
		System.out.println(Arrays.toString(p1.discs));
		p1.popDisc();
		System.out.println(Arrays.toString(p1.discs));
	}
	

}
/**
[3, 0, 0, 0, 0]
[3, 2, 0, 0, 0]
Can't do that
[3, 2, 0, 0, 0]
[3, 0, 0, 0, 0]
**/
