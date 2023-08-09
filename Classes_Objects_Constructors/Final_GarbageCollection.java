package Classes_Objects_Constructors;

public class Final_GarbageCollection {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name"; // giving err because of keyword final

        // when a non primitive is final, you cannot reassign it.
//        kunal = new com.sumit.A("new object");

        A obj = new A("fjjgdhgh");

        System.out.println(obj);

//        for (int i = 0; i < 100000000; i++) {
//            obj = new com.sumit.A("Random name");
//        }

    }
// Here swapping won't occur because java is a pass by value lang.
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int age = 10;
    String name;

     A(String name) {
//        System.out.println("object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}