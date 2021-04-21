import java.util.regex.*;
public class userValidation {

	  // Function to validate the firstname
        public static boolean isValidFirstName(String firstName)
        {

          // Regex to check valid username.
         String regex = "^[A-Z]{1}[a-z]{2,}$";

         // Compile the ReGex
         Pattern p = Pattern.compile(regex);
        // If the firstname is empty return falls
         if (firstName == null) {
                return false;
         }
        //find matching between firstName and  regular expression
         Matcher m = p.matcher(firstName);
         return m.matches();
         }



	public static void main(String[] args){
		System.out.println("Welcome To User Regestration Validation");
		String Name = args[0];
                System.out.println(Name + ": " + isValidFirstName(Name));

	}
}
