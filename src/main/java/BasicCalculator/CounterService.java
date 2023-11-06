package BasicCalculator;

import java.util.Scanner;

public class CounterService {

    Counter cnt= new Counter();
    public void increase(){
        cnt.setCount(cnt.getCount() + 1);
        System.out.println("BasicCalculator.Counter is increased: " + cnt.getCount());
    }

    public void decrease(){
        if (cnt.getCount()>0) {
            cnt.setCount(cnt.getCount() - 1);
        }
        System.out.println("BasicCalculator.Counter is decreased: " + cnt.getCount() );
    }

    public void reset(){
        cnt.setCount(0);
        System.out.println("BasicCalculator.Counter is reset: " + cnt.getCount());
    }
    public void displayMenu(){
        cnt.setCount(0);

        boolean exit=true;

        while (exit){

            Scanner input= new Scanner(System.in);
            System.out.println("*** MAKE YOUR CHOICE ***");
            System.out.println("1. Increase");
            System.out.println("2. Decrease");
            System.out.println("3. Reset");
            System.out.println("0. Exit");
            System.out.println(cnt.getCount());
            int choice= input.nextInt();

        switch (choice) {
            case 1:
                increase();
                break;
            case 2:
                decrease();
                break;
            case 3:
                reset();
                break;
            case 0:
                System.out.println("Good Bye..");
                exit=false;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        }

    }









}
