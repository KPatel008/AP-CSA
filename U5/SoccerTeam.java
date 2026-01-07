public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;

    private static int totalGames = 0;
    private static int totalGoals = 0;

    public SoccerTeam() {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        totalGames++;
        totalGoals += myScore + otherScore;
        if (myScore > otherScore) {
            this.wins++;
            other.losses++;
        }
        if (otherScore > myScore) {
            other.wins++;
            this.losses++;
        }
        else {
            this.ties++;
            other.ties++;
        }
    }

    public int totalPoints() {
        return wins*3 + ties;
    }

    public void reset() {
        wins = 0;
        ties = 0;
        losses = 0;
    }

    public static int totalGames() {return totalGames;}
    public static int totalGoals() {return totalGoals;}

    public static void startTournament() {
        totalGames = 0;
        totalGoals = 0;
    }

    public static void tournament() {
        System.out.println("New Tournament");

        startTournament();

        SoccerTeam s1 = new SoccerTeam();
        SoccerTeam s2 = new SoccerTeam();
        SoccerTeam s3 = new SoccerTeam();
        SoccerTeam s4 = new SoccerTeam();

        s1.reset();
        s2.reset();
        s3.reset();
        s4.reset();

        s1.played(s2, 5,3);
        s3.played(s4, 6, 7);
        s1.played(s3, 8,1);
        s2.played(s4, 4,4);

        System.out.println("Team 1 scored " + s1.totalPoints() + " points.");
        System.out.println("Team 2 scored " + s2.totalPoints() + " points.");
        System.out.println("Team 3 scored " + s3.totalPoints() + " points.");
        System.out.println("Team 4 scored " + s4.totalPoints() + " points.");

        System.out.println("Total Goals: " + totalGoals);
        System.out.println("Total Games: " + totalGames);
        
        System.out.println();
        System.out.println("New Tournament");
        

        startTournament();

        s1.reset();
        s2.reset();
        s3.reset();
        s4.reset();

        s1.played(s2, 6,9);
        s3.played(s4, 7, 7);
        s1.played(s3, 8,10);
        s2.played(s4, 0,4);

        System.out.println("Team 1 scored " + s1.totalPoints() + " points.");
        System.out.println("Team 2 scored " + s2.totalPoints() + " points.");
        System.out.println("Team 3 scored " + s3.totalPoints() + " points.");
        System.out.println("Team 4 scored " + s4.totalPoints() + " points.");

        System.out.println("Total Goals: " + totalGoals);
        System.out.println("Total Games: " + totalGames);
    }

    public static void main(String[] args) {
        tournament();
    }
}
