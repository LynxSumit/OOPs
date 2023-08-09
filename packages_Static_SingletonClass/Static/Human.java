package packages_Static_SingletonClass.Static;

public class Human {
    int age;
    String name;
    static int salary = 0;
//    long salary;
    boolean Married;
 static int  population;
    public Human(int age , String name , int salary , boolean Married) {
        this.age = age;
        this.name = name;
        Human.salary = salary;
        this.Married = Married;
        Human.population += 1;
    }
}

//public class Human {
//
//    String message = "Hello World";
//
//    public static void display(Human human){
//        System.out.println(human.message);
//    }
//
//    public static void main(String[] args) {
//        Human kunal = new Human();
//        kunal.message = "Kunal's message";
//        Human.display(kunal);
//    }
//
//}
// Demonstrate static variables, methods, and blocks.
class UseStatic {
    static int a = 3;
    static int b;
    static void meth(int x) {

        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String args[]) {
        meth(42);
    }
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
}