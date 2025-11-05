import java.util.Scanner;
import java.util.InputMismatchException;

public class InputValidation {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        try {
            int num = scanner.nextInt(); 
            System.out.println("You entered: " + num);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input format. Please enter a valid integer."); 

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); 

        } finally {
            scanner.close();
            
        }
    }
}