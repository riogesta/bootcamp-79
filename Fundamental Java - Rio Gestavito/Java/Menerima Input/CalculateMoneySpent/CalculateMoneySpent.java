import java.util.Scanner;

public class CalculateMoneySpent{
    public static void main(String [] args){
        String name;
        int moneySpent;
        double average;
        int total;
        int totalDay = 7;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate your money!!\n");
        System.out.print("Hey, what is your name? : ");
        name = input.nextLine();

        System.out.print("how much money did you spend at the club on monday? ");
        moneySpent = input.nextInt();

        total = moneySpent;

        System.out.print("how much money did you spend at the club on tuesday? ");
        moneySpent = input.nextInt();

        total += moneySpent;

        System.out.print("how much money did you spend at the club on wednesday? ");
        moneySpent = input.nextInt();

        total += moneySpent;

        System.out.print("how much money did you spend at the club on thursday? ");
        moneySpent = input.nextInt();

        total += moneySpent;

        System.out.print("how much money did you spend at the club on friday? ");
        moneySpent = input.nextInt();

        total += moneySpent;

        System.out.print("how much money did you spend at the club on saturday? ");
        moneySpent = input.nextInt();

        total += moneySpent;

        System.out.print("how much money did you spend at the club on sunday? ");
        moneySpent = input.nextInt();

        total += moneySpent;

        average = (double) total / totalDay;

        System.out.println("the calculation results:");
        System.out.println("Hi, "+ name);
        System.out.println("your total expenditure at the club this week is $"+total);
        System.out.println("with average daily expenditure of $"+average);
    }
}