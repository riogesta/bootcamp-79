import java.util.Scanner;

public class CafeReservation{
    public static void main(String [] args){
        String name, gender, day, result;
        int age;
        double appereance, money;

        Scanner input = new Scanner(System.in);

        System.out.println("welcome to reservation cafe 79.\n\n");
        System.out.print("please insert your name : ");
        name = input.next();

        System.out.print("how old are you?");
        age = input.nextInt();

        System.out.print("what is your gender (male/female): ");
        gender = input.next();

        System.out.print("how attractive are you? (1 to 10)");
        appereance = input.nextDouble();

        System.out.print("how much money do you have : ");
        money = input.nextDouble();

        System.out.print("what day do you want to make a reservation : ");
        day = input.next();

        result = "";

        if (day.equalsIgnoreCase("monday")) {
            /*
                kondisi monday
                young night:
                - age from 20 to 30
                - all gender
                - money start from $500
             */

            if (age >= 20 && age <= 30 && money >= 500){
                result = "reservation successfully, you can order on monday. young night";
            } else {
                result = "sorry, you can't order on monday. because it is for young night";
            }
        } else if (day.equalsIgnoreCase("tuesday")) {
            /*
                kondisi tuesday
                oldest night:
                - age from 31 to 50
                - all gender
                - money start from $250
             */

            if (age >= 31 && age <= 50 && money >= 250){
                result = "reservation successfully, you can order on tuesday. oldest night";
            } else {
                result = "sorry, you can't order on tuesday. because it is for oldest night";
            }
        } else if (day.equalsIgnoreCase("wednesday")) {
            /*
                kondisi wednesday
                ladies neight:
                - age from 20 to 35
                - female only
                - must attractive
                - money start from $300
             */

            if (age >= 20 && age <= 35 && gender.equalsIgnoreCase("female") && appereance >= 8 && money >= 300) {
                result = "reservation successfully, you can order on wednesday. ladies night";
            } else {
                result = "sorry, you can't order on wednesday. because it is for ladies night";
            }
        } else if (day.equalsIgnoreCase("thursday")) {
            /*
                kondisi thursday
                party night for single:
                - age from 21 to 30
                - all gender
                - female must attractive and money from $300
                - male must have money start $1000
             */
            if (age >= 21 && age <= 30 && appereance >= 8 && gender.equalsIgnoreCase("female") && money >= 300 && appereance >= 8) {
                result = "reservation successfully, you can order on thursday. party night for single";
            } else if (age >= 21 && age <= 30 && gender.equalsIgnoreCase("male") && money >= 1000) {
                result = "reservation successfully, you can order on thursday. party night for single";
            } else {
                result = "sorry, you can't order on thursday. because it is for party night for single";
            }
        } else if (day.equalsIgnoreCase("friday")) {
            /*
                kondisi friday
                women night:
                - all gender
                - female age 31 to 45
                - male age 21 to 25
                - male must attractive
                - female must have money at least $1000
             */

            if (gender.equalsIgnoreCase("female") && age >= 31 && age <= 45 && money <= 1000) {
                result = "reservation successfully, you can order on friday. women night";
            } else if (gender.equalsIgnoreCase("male") && age >= 21 && age <= 25 && appereance >= 8) {
                result = "reservation successfully, you can order on friday. women night";
            } else {
                result = "sorry, you can't order on friday. because it is for party night for single";
            }
        } else if (day.equalsIgnoreCase("saturday")) {
            /*
                weekend freedom:
                - age 18 to 60
                - money start from $100
             */

            if (age >= 18 && age <= 60 && money >= 100) {
                result = "reservation successfully, you can order on weekend days. weekend days";
            } else {
                result = "sorry, you can't order on saturday. because it is for weekend freedom";
            }
        }

        System.out.println("\n\nHi "+ name +", thank you for using our applications");
        System.out.println("following result for you reservation");
        System.out.println(result);
    }
}