package U2.PointLineCircleCylinder;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double r, double h) {
        base = new Circle(r);
        height = h;
    }

    /**
     * Finds the volume of a cylinder
     * @return - double - the volume of the cylinder
     */
    public double vol() {
        double v = base.area()*height;
        return v;
    }
    
    /**
     * Finds the surface area of a cylinder
     * @return - double - the surface area of the cylinder
     */
    public double sa() {
        double sa = base.circumference()*height + base.area()*2;
        return sa;
    }
}
