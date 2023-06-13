import java.util.*;

/**
 * This class reads a list of integer numbers from the scanned input and saves them into a Linked List
 * sorted from the smallest to the largest using the Collections Framework.
 */
public class Module4 {

    /**
     * The main method of the program.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.print("Enter a list of integers (space-separated): ");
        String input = scanner.nextLine();

        // Split the input string into individual integers
        String[] numbers = input.split(" ");

        // Convert and add each number to the linked list
        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                linkedList.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + number);
            }
        }

        // Sort the linked list in ascending order
        Collections.sort(linkedList);

        // Print the sorted linked list
        System.out.println("Sorted Linked List:");
        for (Integer num : linkedList) {
            System.out.print(num + " ");
        }
    }
}
