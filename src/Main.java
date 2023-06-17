import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeMachineSimulator coffeeMachine = new CoffeeMachineSimulator();
        while(true) {
            System.out.println("Coffee Machine Simulator !!!");
            System.out.println("1. Buy a coffee");
            System.out.println("2. Fill ingredients");
            System.out.println("3. Take money");
            System.out.println("4. Show ingredients status");
            System.out.println("5. Show analytics");
            System.out.println("6. Exit");
            System.out.println("Enter your choice between 1 to 6");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter coffee type like Espresso/Latte/Cappuccino");
                    String coffeeType = sc.next();
                    System.out.println(coffeeType);
                    coffeeMachine.buyCoffee(coffeeType);
                    System.out.println();
                }

                case 2 -> {
                    System.out.println("Enter amount of water to add (in ml)");
                    int water = sc.nextInt();
                    System.out.println("Enter amount of milk to add (in ml)");
                    int milk = sc.nextInt();
                    System.out.println("Enter amount of beans to add (in g)");
                    int beans = sc.nextInt();
                    coffeeMachine.fillIngredients(water, milk, beans);
                    System.out.println();
                }

                case 3-> {
                    coffeeMachine.takeMoney();
                    System.out.println();
                }

                case 4-> {
                    coffeeMachine.showStatus();
                    System.out.println();

                }
                case 5-> {
                    coffeeMachine.showAnalytics();
                    System.out.println();
                }
                case 6-> {
                    System.out.println("Exiting Coffee Machine Simulator...");
                    System.exit(0);
                }

                default-> {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}