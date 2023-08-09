package packages_Static_SingletonClass.Static;

public class Main {
    public static void main(String[] args) {
//        Human sumit = new Human(19 , "Sumit Kumar Upadhyay" , 0 , false);
//        Human papa = new Human(42 , "Laxmi Narayan Upadhyay" , 26000 , true);
//        System.out.println(Human.salary);
//        System.out.println(Human.population);
        Main obj = new Main();
//        obj.greet();
        obj.fun();

    }

    static void greet2(){
        Main obj = new Main();

        System.out.println("Orewa Monkey D Luffy");
//        obj.greet();
    }
    void fun(){
        greet();
        greet2();
    }
    void greet(){
        System.out.println("Moshi Moshi");
    }
}
