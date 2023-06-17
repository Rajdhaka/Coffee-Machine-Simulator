import java.util.HashMap;
import java.util.Map;

public class CoffeeMachineSimulator {
    private int water;
    private int milk;
    private int beans;
    private int money;
    private Map<String, Integer> coffeesSold;
    public CoffeeMachineSimulator() {
        water = 0;
        milk = 0;
        beans = 0;
        money = 0;
        coffeesSold = new HashMap<>();
        coffeesSold.put("Espresso", 0);
        coffeesSold.put("Latte", 0);
        coffeesSold.put("Cappuccino", 0);
    }
    public void buyCoffee(String coffeeType) {
        int waterNeeded, milkNeeded, beansNeeded, price;
        switch (coffeeType) {
            case "Espresso":
                waterNeeded = 250;
                milkNeeded = 0;
                beansNeeded = 16;
                price = 4;
                break;
            case "Latte":
                waterNeeded = 350;
                milkNeeded = 75;
                beansNeeded = 20;
                price = 7;
                break;
            case "Cappuccino":
                waterNeeded = 200;
                milkNeeded = 100;
                beansNeeded = 12;
                price = 6;
                break;
            default:
                System.out.println("Invalid coffee type.");
                return;
        }

        if (water < waterNeeded || milk < milkNeeded || beans < beansNeeded) {
            System.out.println("Insufficient ingredients to make " + coffeeType + ".");
            return;
        }

        System.out.println("Dispensing " + coffeeType + "...");
        water -= waterNeeded;
        milk -= milkNeeded;
        beans -= beansNeeded;
        money += price;
        coffeesSold.put(coffeeType, coffeesSold.get(coffeeType) + 1);
        System.out.println("Enjoy your " + coffeeType + "!");
    }
    public void fillIngredients(int waterToAdd, int milkToAdd, int beansToAdd) {
        water += waterToAdd;
        milk += milkToAdd;
        beans += beansToAdd;
        System.out.println("Ingredients added to the coffee machine.");
    }

    public void takeMoney() {
        System.out.println("Taking out $" + money + " from the money box.");
        money = 0;
    }

    public void showStatus() {
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Beans: " + beans + " g");
    }

    public void showAnalytics() {
        System.out.println("Coffee sales:");
        for (Map.Entry<String, Integer> entry : coffeesSold.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        int totalEarnings = coffeesSold.get("Espresso") * 4 +
                coffeesSold.get("Latte") * 7 +
                coffeesSold.get("Cappuccino") * 6;
        System.out.println("Total earnings: $" + totalEarnings);
        int totalWater = coffeesSold.get("Espresso") * 250 +
                coffeesSold.get("Latte") * 350 +
                coffeesSold.get("Cappuccino") * 200;
        System.out.println("Water consumed: " + totalWater + " ml");
        int totalMilk = coffeesSold.get("Latte") * 75 +
                coffeesSold.get("Cappuccino") * 100;
        System.out.println("Milk consumed: " + totalMilk + " ml");
        int totalBeans = coffeesSold.get("Espresso") * 16 +
                coffeesSold.get("Latte") * 20 +
                coffeesSold.get("Cappuccino") * 12;
        System.out.println("Beans consumed: " + totalBeans + " g");
    }

}
