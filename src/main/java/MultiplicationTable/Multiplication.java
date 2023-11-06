package MultiplicationTable;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("********Multiplication Table********");

            System.out.println("Enter your choice: ");
            System.out.println("1.Add\n" +
                    "2.Substruction\n" +
                    "3.Multiply\n" +
                    "4.Divide\n" +
                    "0.Exit");

            int choice = input.nextInt();

            if (choice==0){
                System.out.println("Good Bye...");
                break;
            }

            input.nextLine();//dummy

            System.out.println("Enter first number");
            double a = input.nextInt();
            System.out.println("Enter second number");
            double b = input.nextInt();

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(a, b);
                    break;
                case 2:
                    result = substruction(a, b);
                    break;
                case 3:
                    result = multiply(a, b);
                    break;
                case 4:
                    if (a!=0){
                        result = divide(a, b);
                    }else System.out.println("Calculation error, you entered 0");
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }
            System.out.println("Result: " + result);
        }

    }

    private static double divide(double a, double b) {
     return a/b;


    }

    private static double multiply(double a, double b) {
       return a*b;

    }

    private static double substruction(double a, double b) {
      return a-b;

    }

    public static double add(double a, double b){
        return a+b;

    }

}
