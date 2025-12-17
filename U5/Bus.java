public class Bus {
    private int numStops;
    private int currStop;
    private int direction;
    private int busNumber;

    private static int numBusses = 0;

    public Bus(int x) {
        numStops = x;
        currStop = 1;
        direction = 1;
        numBusses++;
        busNumber = numBusses;
    }

    public Bus() {
        this(8);
    }

    public String toString() {
        return "Bus Number " + busNumber + " at stop " + currStop;
    }

    public void move() {
        currStop += direction;
        if(currStop == numStops) {
            direction = -1;
        }
        if(currStop == 1) {
            direction = 1;
        }
    }

    public void move(int x) {
        for (int i = 1; i <= x; i++) {
            move();
        }
    }

    public static int getNumberofBusses() {
        return numBusses;
    }

    public boolean atSameStop(Bus other) {
        return this.currStop == other.currStop;
    }

    public static void main(String[] args) {
        Bus b1 = new Bus(7);
        Bus b2 = new Bus();
        System.out.println(b1);
        System.out.println(b2);
        b1.move(4);
        System.out.println(b1);
        Bus b3 = new Bus(5);
        System.out.println("There are " + getNumberofBusses() + " busses");
        System.out.println(b2.atSameStop(b3));
    }
}
