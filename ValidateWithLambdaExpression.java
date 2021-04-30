package javaPractice;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class ValidateWithLambdaExpression {
	public static void main(String[] args) {
	//VALIDATION FOR FIRST NAME	
	//input list
	List<String> name = Arrays.asList("Amar", "Mayur", "sagar","NisHad");
	Pattern pattern1 = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	
	// compile regex as predicate anr apply predicate filter
	List<String> res = name.stream().filter(pattern1.asPredicate()).collect(Collectors.<String>toList());
	
	//using regex with lambda expression
	List<String> res1 = name.stream().filter(p -> pattern1.matcher(p).find())
					.collect(Collectors.<String>toList());

	//using regex with predicate functional interface
	List<String> res2 = name.stream().filter(new Predicate<String>() {
		public boolean test(String s) {
			return pattern1.matcher(s).find();
		}
	}).collect(Collectors.<String>toList());

	// for printing the result
	res.forEach(System.out::println);
	res1.forEach(System.out::println);
	res2.forEach(System.out::println);
	
System.out.println("----------------------------------------------------------------------------------------------------");	
	//VALIDATION FOR LAST NAME
	List<String> lastname = Arrays.asList("Pawar", "Patil", "vairagi","MhaTre");
	Pattern pattern2 = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	//using lambda expression
	List<String> output = lastname.stream().filter(p -> pattern2.matcher(p).find())
						.collect(Collectors.<String>toList());
	//printing result
	output.forEach(System.out::println);
	
System.out.println("----------------------------------------------------------------------------------------------------");
	
	//VALIDATION FOR EMAIL ID
	List<String> emails = Arrays.asList("@amarpawar.com", "amar@.com", "amar@gmail.com", "amar.pawar@gmail.com");
	Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
	
	// Compile regex as predicate and apply predicate filter
	List<String> result = emails.stream().filter(pattern.asPredicate()).collect(Collectors.<String>toList());
	
	//using regex with lambda expression
	List<String> result1 = emails.stream().filter(p -> pattern.matcher(p).find())
						.collect(Collectors.<String>toList());

	//using regex with predicate functional interface
	List<String> result2 = emails.stream().filter(new Predicate<String>() {
		public boolean test(String s) {
			return pattern.matcher(s).find();
		}
	}).collect(Collectors.<String>toList());

	// Now printing the result
	result.forEach(System.out::println);
	result1.forEach(System.out::println);
	result2.forEach(System.out::println);
	
System.out.println("----------------------------------------------------------------------------------------------------");

//VALIDATION FOR MOBILE NUMBER
	//input list
	List<String> mobileNumber = Arrays.asList("919023433456", "919087566554", "090099889761","9087766787");
	Pattern pattern3 = Pattern.compile("^[1-9]{2}[1-9]{1}[0-9]{9}$");
	//using lambda expression
	List<String> output1 = mobileNumber.stream().filter(p -> pattern3.matcher(p).find())
						.collect(Collectors.<String>toList());
	//printing result
	output1.forEach(System.out::println);

System.out.println("----------------------------------------------------------------------------------------------------");

	//VALIDATION FOR PASSWORD
	//input list
	List<String> password = Arrays.asList("Amar@3kjsgk", "amarP@123", "amar@1","Ama@12");
	Pattern pattern4 = Pattern.compile("^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$");
	//using lambda expression
	List<String> output2 = password.stream().filter(p -> pattern4.matcher(p).find())
					.collect(Collectors.<String>toList());
	//printing result
	output2.forEach(System.out::println);





	}
}
