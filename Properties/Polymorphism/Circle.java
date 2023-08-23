package Properties.Polymorphism;


public class Circle extends Shapes {
    void area(){
        System.out.println("Area is pi * r * r");
    }
    void greet(){
        System.out.println("hey Hello !");
    }
    void parameter(int a){
        System.out.println("Parameter of Circle");
    }
}
