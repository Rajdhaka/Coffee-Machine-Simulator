# Coffee Machine Simulator #


Coffee Machine Simulator
This is a REPL (Read, Eval, Print, Loop) console application in Java that simulates a Coffee Machine. The coffee machine contains the ingredients required to make coffee, such as milk, water, and coffee beans. It also has a money box to store the collected money.

## Features ##
The Coffee Machine Simulator offers the following features:
1. **Buy Coffee:** Allows the user to buy a coffee of their choice. The coffee will be dispensed only if the machine has enough ingredients. Otherwise, an error message will be displayed. The coffee types available are:

* Espresso: Price - $4/cup, Water needed - 250 ml/cup, Milk needed - 0 ml/cup, Beans needed - 16/cup
* Latte: Price - $7/cup, Water needed - 350 ml/cup, Milk needed - 75 ml/cup, Beans needed - 20/cup
* Cappuccino: Price - $6/cup, Water needed - 200 ml/cup, Milk needed - 100 ml/cup, Beans needed - 12/cup

2. **Fill Ingredients:** Allows the user to add ingredients to the coffee machine. The user can specify the amount of water, milk, and beans to add.

3. **Take Money:** Enables the maintainer to take the money stored in the money box.
4. **Show Ingredients:** Displays the remaining ingredients in the coffee machine (water, milk, beans).
5. **Exit:** Stops the simulation and exits the program.

## Analytics
The Coffee Machine Simulator also includes an analytics option, which provides information about the coffee sales, earnings, and ingredients consumed. The analytics feature displays:
* Count of each type of coffee sold.
* Total earnings from coffee sales.
* Total amount of water, milk, and beans consumed.

## Getting Started
To run the Coffee Machine Simulator, follow these steps:

1. Make sure you have Java installed on your system.
2. Clone this repository or download the source code.
3. Open a terminal or command prompt and navigate to the directory containing the source code.
4. Compile the Java file by running the following command:

```java
 javac Main.java
 ```

5. Run the compiled Java file with the following command:
``` java
java Main
``` 
6. The Coffee Machine Simulator will start in the console, and you can interact with the available options.

## Usage
Once the Coffee Machine Simulator is running, you will be presented with a menu of options. Enter the corresponding number for the action you want to perform:

1. Buy a coffee: Choose the type of coffee you want to buy.
2. Fill ingredients: Specify the amount of water, milk, and beans to add to the machine.
3. Take money: Retrieve the money from the money box.
4. Show ingredients status: Display the current status of the ingredients in the coffee machine.
5. Show analytics: View the count of coffees sold, total earnings, and ingredients consumed.
6. Exit: Stop the simulation and exit the program.


## Example
```
Coffee Machine Simulator !!!
1. Buy a coffee
2. Fill ingredients
3. Take money
4. Show ingredients status
5. Show analytics
6. Exit

Enter your choice between 1 to 6
2
Enter amount of water to add (in ml)
1000
Enter amount of milk to add (in ml)
1000
Enter amount of beans to add (in g)
100
Ingredients added to the coffee machine.

Enter your choice between 1 to 6 
1 
Enter coffee type like Espresso/Latte/Cappuccino 
Espresso 
Espresso 
Dispensing Espresso... 
Enjoy your Espresso! 

Enter your choice between 1 to 6 
1 
Enter coffee type like Espresso/Latte/Cappuccino 
Latte 
Latte 
Dispensing Latte... 
Enjoy your Latte! 

Enter your choice between 1 to 6 
3 
Taking out $11 from the money box. 

Enter your choice between 1 to 6 
4 
Water: 400 ml 
Milk: 925 ml 
Beans: 64 g 

Enter your choice between 1 to 6
5
Coffee sales:
Espresso: 1
Latte: 1
Cappuccino: 0
Total earnings: $11
Water consumed: 600 ml
Milk consumed: 75 ml
Beans consumed: 36 g

Enter your choice between 1 to 6
6
Exiting Coffee Machine Simulator...
```



