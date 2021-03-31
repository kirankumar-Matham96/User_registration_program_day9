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

	//main method
	public static void main(String[] args)
	{
		String firstName = "Rahul";
		String lastName = "Shinde";
		System.out.println(validateFirstName(firstName));
		System.out.println(validateLastName(lastName));
	}
}
