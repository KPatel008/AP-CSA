package U1.Yummy;
public class Yummy2 {
    public static void main(String[] args) {
        chocolate();
        iceCream();
        pasta();
        System.out.println("Done");
    }

    public static void chocolate() {
        System.out.println("Yummy Chocolate");
    }

    public static void iceCream() {
        System.out.println("ice");
        chocolate();
        System.out.println("Cream");
    }

    public static void pasta() {
        iceCream();
        System.out.println("Pasta");
    }
}
