package BasicCalculator;

import BasicCalculator.CounterService;

public class Main {
    public static void main(String[] args) {
        CounterService counterService= new CounterService();

        counterService.displayMenu();
    }
}
