package U1.box;

public class Box {
    // attributes
    private double height;
    private double width;
    private double length;
    private String color;
    private boolean hasALid;

    /*
     * Constructor - sets all of the attributes
     */
    public Box(double h, double l, double w, String c, boolean lid) {
        height = h;
        length = l;
        width = w;
        color = c;
        hasALid = lid;
    }

    //overloaded constructor
    public Box(double h, double l, double w) {
        height = h;
        length = l;
        width = w;
        color = "brown";
        hasALid = false;
    }

    /*
     * Default constructor
     */
    public Box() {
        height = 1.0;
        length = 1.0;
        width = 1.0;
        color = "brown";
        hasALid = false;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public double getVolume() {
        return height * length * width;
    }
    /*
     * toString method - allows us to print a Box
     * @return String
     */
    public String toString() {
       String s = "A Box with dimensions " + height + " " + length + " " + width;
       s += " Its color is " + color + " and it has a lid? " + hasALid;
       return s;
    }

    public static void main(String[] args) {
        Box b1 = new Box(5.4, 8.3, 2.7, "purple", true);
        Box b2 = new Box(8.2, 4.7, 6.0);

        double h = b1.getHeight();
        System.out.println(h);
        b1.setHeight(7.5);
        System.out.println(b1.getHeight());
        System.out.println(b2.getColor());
        System.out.println(b1.getVolume());
        System.out.println(b2.getVolume());

        int x = 5;
        String name = "Howdy Doody";
        System.out.println(x);
        System.out.println(name);
        System.out.println(b1);
        System.out.println(b2);
    }
}
