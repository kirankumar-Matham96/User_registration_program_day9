//import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProgram
{
	//UC-1: validating first name
	public static boolean validateFirstName(String firstName)
	{
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
	}

	//UC-2: validating last name
	public static boolean validateLastName(String lastName)
	{
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
	}

	//UC-3 & 9: validating email
	public static boolean validateEmail(String email)
	{
		return Pattern.matches("[-a-zA-Z0-9+]+.[-a-zA-Z0-9]*@[a-zA-Z0-9]+(.[a-zA-Z0-9]+)*.[a-zA-Z]{2,}$", email);
	}

	//UC-4: validating predefined mobile number
	public static boolean validatePhoneNumber(String phoneNumber)
	{
		return Pattern.matches("^[91]{2}[0-9]{10}",phoneNumber);
	}

	//UC-5: validating password
	public static boolean validatePassWord(String passWord)
	{
		/*
		 * Rule1: minimum 8 characters
		 */
		return Pattern.matches("(?=.*[0-9])(?=.[a-z])(?=.*[A-Z])^[0-9a-zA-Z!@#$%^&*()_+]{8,}$", passWord);
	}

	//main method
	public static void main(String[] args)
	{
		String firstName = "Rahul";
		String lastName = "Shinde";
		long phoneNumber = 918688332960L;
		String email1 = "Rahul.Shinde@gmail.com.in";
		String email2 = "Rahul.Shinde@gmail.com";
		String email3 = "Rahul-Shinde@gmail.com";
		String email4 = "Rahul.123@gmail.com";
		String email5 = "Rahul.Shinde123@gmail.com";
		String email6 = "RahulShinde.123@gmail.com";
		String email7 = "Rahul123.Shinde123@gmail.com";
		String email8 = "Rahul123.Shinde123@gmail.com.com";
		String email9 = "Rahul123.Shinde123@yahoo.com.in";
		String email10 = "Rahul-123.Shinde-123@rahul.com.in";
		String passWord = "Enery@123gyhnj168745yJY";

		System.out.println("first name: "+validateFirstName(firstName));
		System.out.println("last name: "+validateLastName(lastName));

		//emails
		System.out.println("emails:");
		System.out.println(validateEmail(email1));
		System.out.println(validateEmail(email2));
		System.out.println(validateEmail(email3));
		System.out.println(validateEmail(email4));
		System.out.println(validateEmail(email5));
		System.out.println(validateEmail(email6));
		System.out.println(validateEmail(email7));
		System.out.println(validateEmail(email8));
		System.out.println(validateEmail(email9));
		System.out.println(validateEmail(email10));
		System.out.println("phone numbar: "+validatePhoneNumber(Long.toString(phoneNumber)));
		System.out.println("password: "+validatePassWord(passWord));

	}
}

