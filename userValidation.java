import java.util.regex.*;
import java.util.Scanner;
public class userValidation {

    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
	//first name validatuion
            String usernamePattern = "^[A-Z]{1}[a-z]{2,}$";
            System.out.print("Input first name: ");
            String input = sc.next();
            flag = input.matches(usernamePattern);
            if (!flag) System.out.println("Invalid first name!");
        } while (!flag);
        System.out.println("Valid first name");
        
	//last name validation
        Scanner bc = new Scanner(System.in);
        do {
            String usernamePattern = "^[A-Z]{1}[a-z]{2,}$";
            System.out.print("Input last name: ");
            String input = bc.next();
            flag = input.matches(usernamePattern);
            if (!flag) System.out.println("Invalid last name!");
        } while (!flag);
        System.out.println("Valid last name");

	//email id validation
	Scanner ec = new Scanner(System.in);
        do {
            String emailPattern = "^[a-z]{1}[a-zA-Z0-9.+_-]+@[a-zA-Z0-9.]+[a-zA-z]{2,3}$";
            System.out.print("Input Email Id: ");
            String input = ec.next();
            flag = input.matches(emailPattern);
            if (!flag) System.out.println("Invalid email Id!");
        } while (!flag);
        System.out.println("Valid email Id");

	//contact number validation
	Scanner cc = new Scanner(System.in);
        do {
            String contactPattern = "^[0-9]{10}$";
            System.out.print("Input Contact Number: ");
            String input = cc.next();
            flag = input.matches(contactPattern);
            if (!flag) System.out.println("Invalid Contact Number!");
        } while (!flag);
        System.out.println("Valid Contact Number");

	//password validation
	Scanner pc = new Scanner(System.in);
        do {
            String passwordPattern = "^[A-Za-z0-9_@$]+$";
            System.out.print("Enter a Password: ");
            String input = pc.next();
            flag = input.matches(passwordPattern);
            if (!flag) System.out.println("Invalid Password!");
        } while (!flag);
        System.out.println("Valid Password");
    }
}
