import java.util.Scanner;
import java.util.Arrays;

public class RestaurantMenu {
	public static String items = "HFCMBS";
	public static double[] prices = {5.25, 2.5, 7, 3.75, 6.25, 1.25};
	public static int findItemIndex(char arr[], char t) {
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
	}

	public static double itemCost(char item) {

		int index = items.indexOf(item);
		if (index != -1) {
			double price = prices[index];
			return price;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {

		/* you probably want to use user input for the
		 * menu item using Scanner
		 * I've written some code that will get the
		 * menu item code and read it in as a char
		 */

		double total = 0;


		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter menu item: ");
			char item = in.next().charAt(0);
			if (item == 'X') {
				System.out.printf("Order complete. Total is $%.2f", total);
				System.out.println("");
				break;
			}
			double cost = itemCost(item);
			if (cost == 0) {
				System.out.println("Invalid menu item");
			} else {
				total += cost;
				System.out.printf("Total = $%.2f", total);
				System.out.println("");
			}
		}

	}
}
