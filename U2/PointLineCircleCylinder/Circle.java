package U2.PointLineCircleCylinder;

public class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    /**
     * Finds the area of a circle
     * @return - double - the area of the circle
     */
    public double area() {
        double a = Math.PI*Math.pow(radius, 2);
        return a;
    }
    
    /**
     * Finds the circumference of a circle
     * @return - double - the circumference of the circle
     */
    public double circumference() {
        double c = 2 * Math.PI*radius;
        return c;
    }
}
