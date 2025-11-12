package U3;

public class TwoSpinners{
 	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
 	public int spin(int min, int max)
 	{
        int a = (int)(Math.random()*(max - min + 1) + min);
        return a; 
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
   	    int computerSpin1 = spin(2,8);
        int playerSpin1 = spin(1,10);
        int dif1 = playerSpin1 - computerSpin1;
        if (playerSpin1 > computerSpin1) {
            System.out.println("You Win! " + dif1 + " points");
        }  
        else if (computerSpin1 > playerSpin1) {
            System.out.println("You Lose. " + dif1 + " points");
        }
        else {
            int computerSpin2 = spin(2,8);
            int playerSpin2 = spin(1,10);
            if (playerSpin2 > computerSpin2) {
            System.out.println("You Win! 1 point");
            }  
            else if (computerSpin1 > playerSpin1) {
            System.out.println("You Lose. -1 point");
            }
            else {System.out.println("Tie. 0 points");}
        }
	}

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playRound 10 times
         		ds.playRound();
     	      }
 	}
}

/*You Win! 5 points
You Win! 1 points
You Lose. -2 points
Tie. 0 points
You Lose. -1 points
You Win! 4 points
You Win! 1 points
You Lose. -2 points
You Win! 2 points
You Win! 1 points
*/