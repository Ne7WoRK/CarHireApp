/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project  - "Car hire application"
 */
package CarHireApp;
import java.util.Random;

final public class RegistrationNumber {
	
	//Using private final variables, since once created the car registration number should not be changed.
	private final String fullNumber;
	
	//The constructor of the class RegistrationNumber.
	private RegistrationNumber(String fullNumber) {
		this.fullNumber = fullNumber;

	}
	
	//Method guaranteeing the uniqueness of a registration number.
	//Returning a character with 4 digit random number.
	public static RegistrationNumber Instance() {
		Random letter = new Random();
		int number = (int) (Math.random() * (9999 - 1000) + 1000);
		char c;
		c = (char) (letter.nextInt(26) + 'A');
		return new RegistrationNumber(String.format("%s%s", c, String.valueOf(number)));

	}
	
	//Method giving a random character for the registration number.
	public char getLetter() {
		Random letter = new Random();
		return (char) (letter.nextInt(26) + 'A');

	}
	//Get method for accessing the registration number.
	public String getFullNumber() {
		return fullNumber;

	}

	//Overriding the toString method giving 
	public String toString() {
		return fullNumber;
	}
}