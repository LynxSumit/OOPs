package Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();   // circle can only access methods which are overridden by Circle class and the methods which are in Shapes class cuz of Dynamic Method Dispatch ....
        Square square = new Square();
       circle.parameter();
    }
}
