package Games;

import java.util.Random;
import java.util.Scanner;

class Game{
    int random;
    int count = 1;
    Game(){
        Random rand = new Random();
        this.random = rand.nextInt(100);
        System.out.println(random);
    }

   public int TakingInput(){
        Scanner sc = new Scanner(System.in);
       return sc.nextInt();
    }
    boolean Correct(){
        int entered = TakingInput();

        boolean correct =  this.random == entered;
        if(entered > this.random){
this.count++;
            System.out.println("Please enter smaller number");

        } else if (entered < this.random) {
            this.count++;
            System.out.println("Please enter greater number");

        }
        if(correct) System.out.println("Hurray You have Entered correct number in " + this.count  +  " attempts");
       return correct;
    }


}
public class Main {
    public static void main(String[] args) {
        Game myg = new Game();
        System.out.println("Please Enter a Number between 1 to 100");
              while(!myg.Correct()){}
    }
}
