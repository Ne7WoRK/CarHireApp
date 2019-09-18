/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project  - "Car hire application"
 */
package CarHireApp;

public class Name {
	// Private variables of the class Name.
	//They should not be final since 2 people can have the same name.
	private String firstName;
	private String lastName;

	// The constructor for the name class.
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Get method for the first name so it can be accessed easily when needed.
	public String getFirstName() {
		return firstName;
	}

	// Get method for the last name so it can be accessed easily when needed.
	public String getLastName() {
		return lastName;
	}

	// Overriding the toString method for the name so it will appear with first
	// name and last name when it is printed.
	public String toString() {
		return firstName + " " + lastName;
	}
}
