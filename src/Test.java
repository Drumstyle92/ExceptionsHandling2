import java.util.Scanner;

/**
 * @author Drumstyle92
 * class that contains the whole program.
 */
public class Test {
    /**
     *
     * @param args main parameter.
     * method that contains a scanner that records
     * the user's numeric inputs and shows the result of a division.
     *
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // division variables
        int dividend;
        int divisor;
        // user input
        System.out.println("Enter the dividend:");
        dividend = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the divisor:");
        divisor = scanner.nextInt();
        scanner.close();
        // exception check
        try{
            int result = dividend / divisor;
            System.out.println("The result of the division is: " + result);
        }catch (ArithmeticException e){
            // Exception
            System.out.println("-You can't divide by zero!-");
        }
        System.out.println("-----------Finish------------");
    }
}
