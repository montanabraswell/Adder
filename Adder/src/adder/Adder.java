/* MOOC Java Tutorial 8
 * Java Tutorial 8
 * Montana Braswell
 * 11/8/2017
 */
package adder;

/**
 *
 * @author Montana
 */
import java.util.Scanner;
public class Adder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creating a scanner to read to the user
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        // letting a number variable be passed to the user
        int number = Integer.parseInt(reader.nextLine());
        // typing another number to the user
        System.out.println("Type another number: ");
        // reading second number through the user
        int number2 = Integer.parseInt(reader.nextLine());
        // created a sum variable to add both numbers
        int sum = number + number2;
        // printing out numbers with the sum variable
        System.out.println("Sum of the numbers: " + sum);
                
    }
    
}
