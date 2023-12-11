import java.util.Scanner;

public class PigDice {
    public static void main(String [] args){
        int roll, player_total, computer_total, turnTotal;
        String choice = "";
        Scanner input = new Scanner(System.in);
        player_total = 0;
        computer_total = 0;

        do {
            if(player_total < 100){
                turnTotal = 0;
                System.out.println("computer has "+computer_total+" points.");

                do {
                    roll = 1 + (int) (Math.random()*6);
                    System.out.println("\tcomputer rolled "+roll+".");
                    if (roll == 1) {
                        System.out.println("\tthats ends its turn.");
                        turnTotal = 0;
                    } else {
                        turnTotal += roll;
                        System.out.println("\tcomputer has "+turnTotal+" points so far this is round.\n");
                        if (turnTotal < 10) {
                            System.out.println("\tcomputer will roll again");
                        }
                    }
                } while(roll != 1 && turnTotal < 10);

                computer_total += turnTotal;
                System.out.println("\tcomputer ends the round with "+computer_total+" points.");
            }

            turnTotal = 0;
            System.out.println("you have "+player_total+" points.");

            do {
                roll = 1 + (int) (Math.random()*6);
                System.out.println("\tyou rolled "+roll+".");
                if (roll == 1) {
                    System.out.println("\tthats ends its turn.");
                    turnTotal = 0;
                } else {
                    turnTotal += roll;
                    System.out.println("\tyou have "+turnTotal+" points so far this is round.\n");
                    System.out.println("\twould you like to \"roll\" again or \"hold\"?");
                    choice = input.next();

                    if (turnTotal < 10) {
                        System.out.println("\t will roll again");
                    }
                }
            } while(roll != 1 && choice.equalsIgnoreCase("roll"));

            player_total += turnTotal;
            System.out.println("\tyou end the round with "+player_total+" points.");

        } while (player_total < 50 && computer_total < 50);

        if (player_total > computer_total) {
            System.out.println("Humanity win!!");
        } else {
            System.out.println("computer win.");
        }
    }   
}
