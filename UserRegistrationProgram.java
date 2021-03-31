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

	//UC-3: validating email
	public static boolean validateEmail(String email)
	{
		return Pattern.matches("[-a-zA-Z0-9+]+.[-a-zA-Z0-9]*@[a-zA-Z0-9]+(.[a-zA-Z0-9]+)*.[a-zA-Z]{2,}$", email);
	}

	//UC-4: validating mobile number
	public static boolean validatePhoneNumber(String phoneNumber)
	{
		return Pattern.matches("^[91]{2}[0-9]{10}",phoneNumber);
	}

	//main method
	public static void main(String[] args)
	{
		String firstName = "Rahul";
		String lastName = "Shinde";
		String email = "Rahul.Shinde@gmail.com.in";
		long phoneNumber = 918688332960L;

		System.out.println("first name: "+validateFirstName(firstName));
		System.out.println("last name: "+validateLastName(lastName));
		System.out.println("email: "+validateEmail(email));

		//converted long into string before passing phone number
		System.out.println("phone numbar: "+validatePhoneNumber(Long.toString(phoneNumber)));

	}
}
