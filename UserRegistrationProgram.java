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

	//main method
	public static void main(String[] args)
	{
		String firstName = "Rahul";
		String lastName = "Shinde";
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

		System.out.println(validateFirstName(firstName));
		System.out.println(validateLastName(lastName));
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
	}
}
