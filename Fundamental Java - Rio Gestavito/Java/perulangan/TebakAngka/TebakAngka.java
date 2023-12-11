import java.util.Scanner;

public class TebakAngka{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        boolean pass = false;

        int secret, guess;

        secret = 1 + (int) (Math.random()*10);

        System.out.println("i am thinking number from 1 to 10");
        System.out.println("you must guess what it is in three tries");
        System.out.print("enter a guess: ");

        for (int i=1; i <= 3; i++ ) {
            guess = input.nextInt();
            
            if (guess == secret) {
                System.out.println("RIGHT");
                System.out.println("you have won the game.");
                pass = true;
                break;
            } else if (guess - secret == 1) {
                System.out.println("HOT");
            } else if (guess - secret == 2) {
                System.out.println("WARM");
            } else {
                System.out.println("cold");
            }
        }
        
        if (!pass) {
            System.out.println("WRONG!!");
            System.out.println("the correct number was: "+secret);
            System.out.println("you have lost the game.");
        }
    }
}