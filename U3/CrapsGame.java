package U3;

import java.util.Scanner;
/**
 * CrapsGame class
 */
public class CrapsGame
{
  private int point;
  private int gamesWon;
  private int totalGames;
/**
 * Constructor
 */
  public CrapsGame(){
    point = 0;
    gamesWon = 0;
    totalGames = 0;
  }
/**
 * Rolls two dice and returns the sum of the dots
 * @return sum of the two dice
 */
  public int rollDice(){
    int die1 = (int)(Math.random() * 6) + 1;
    int die2 = (int)(Math.random() * 6) + 1;
    return die1 + die2;
  }
  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   * 
   * @param total sum of the two dice
   * @return 1 if player won, -1 if player lost, 0 if player continues rolling
   */

  public int processRoll(int total) {
    if (point == 0) {
        if (total == 2||total == 3||total == 12){return -1;}
        else if (total == 7||total == 11) {return 1;}
        else {
            point = total;
            return 0;
        } }
    else if (total == point) {
        point = 0;
        return 1;
    }
    else if (total == 7) {
        point = 0;
        return -1;
    }
    else {return 0;}
   }
   /**
    * Prints the current statistics of the game
    */
   public void printCurrentStats(){
    int lost = totalGames-gamesWon;
    System.out.println(gamesWon + " games won " + lost + " games lost.");

   }

  /**
   *  Returns the saved point
   * @return the saved point
   */
  public int getPoint()
  {
    return point;
  }

  /**
   * Plays one round of the Craps game
   * roll the dice, process the roll and update and print the stats
   */
  public void playRound(){
    int R = rollDice();
    System.out.println("You rolled: " + R);
    int P = processRoll(R);
    if (P == 1) {
        gamesWon++;
        totalGames++;
        System.out.println("You win!");}
    if (P == -1) {
        totalGames++;
        System.out.println("You lose!");}
    else {System.out.println("Point is set to: " + point + ". Roll again! (Press Enter to roll, q to quit)");}
    printCurrentStats();
  }

  /**
   * Plays multiple rounds of the Craps game until the user decides to quit
   * Does a new roll when the user types enter.  q ends the game
   */
  public void playGame(){
    Scanner sc = new Scanner(System.in);
    String continuePlaying = "";
    while (!continuePlaying.equals("q")) {
      playRound();
      continuePlaying = sc.nextLine();
    }
    
    double winPercent = (double) gamesWon/totalGames*100;
    System.out.println("You won " + winPercent + "% of the time");
      
    sc.close();
  }

  public static void main(String[] args) {
    CrapsGame cg = new CrapsGame();
    cg.playGame();
  }
}
