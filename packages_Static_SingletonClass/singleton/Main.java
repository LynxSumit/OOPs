package packages_Static_SingletonClass.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
//        both will points to same object


    }
}
