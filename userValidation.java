import java.util.regex.*;
import java.util.Scanner;
public class userValidation {

    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            String usernamePattern = "^[A-Z]{1}[a-z]{2,}$";
            System.out.print("Input first name: ");
            String input = sc.next();
            flag = input.matches(usernamePattern);
            if (!flag) System.out.println("Invalid first name!");
        } while (!flag);
        System.out.println("Valid first name");
        
        Scanner bc = new Scanner(System.in);
        do {
            String usernamePattern = "^[A-Z]{1}[a-z]{2,}$";
            System.out.print("Input last name: ");
            String input = bc.next();
            flag = input.matches(usernamePattern);
            if (!flag) System.out.println("Invalid last name!");
        } while (!flag);
        System.out.println("Valid last name");
    }
}
