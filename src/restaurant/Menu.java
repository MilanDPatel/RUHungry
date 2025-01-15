package restaurant;
/**
 * Use this class to test your Menu method. 
 * This class takes in two arguments:
 * - args[0] is the menu input file
 * - args[1] is the output file
 * 
 * This class:
 * - Reads the input and output file names from args
 * - Instantiates a new RUHungry object
 * - Calls the menu() method 
 * - Sets standard output to the output and prints the restaurant
 *   to that file
 * 
 * To run: java -cp bin restaurant.Menu menu.in menu.out
 * 
 */
public class Menu {
    public static void main(String[] args) {
        // Read input file names from STDIN
        String menuInputFile = StdIn.readString();
        String stockInputFile = StdIn.readString();
        String orderInputFile = StdIn.readString();

        // Instantiate an RUHungry object
        RUHungry rh = new RUHungry();

        // Call the menu() method to read the menu
        rh.menu(menuInputFile);

        // Print restaurant
        rh.printRestaurant();

        // Call the createStockHashTable method to create the stock hash table
        rh.createStockHashTable(stockInputFile);

        rh.order(orderInputFile, 0);
    }
}