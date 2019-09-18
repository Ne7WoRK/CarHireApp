/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project  - "Car hire application"
 */
package CarHireApp;
import java.util.Calendar;
import java.util.Random;

public class LicenceNumber {
	
	//Private variables,which will be used in the constructor of LicenceNumber.
	//Since it should be unique the constructor should use immutable variables.
	private final String driverName;
	private final int dateOfIssue;

	//The constructor of the LicenceNumber class.
	public LicenceNumber(Name driverName, Calendar dateOfIssue) {
		
		this.driverName =driverName.getFirstName().substring(0, 1) + driverName.getLastName().substring(0, 1) ;
		this.dateOfIssue = dateOfIssue.get(Calendar.YEAR);

	}
	
	//Get method so we can access the private variable driverName through this method.
	public String getDriverName() {
		return driverName;
	}
	
	//Get method so we can access the private variable dateOfIssue through this method.
	public int getDateOfIssue() {
		return dateOfIssue;
	}

	//Method to get a random unique 2 digit number of the licence.
	private static String getRandomTwoDigitNumber() {
		Random rn = new Random();
		int number = (int) (rn.nextInt(99 - 0 - +1) + 0);
		return String.format("%02d", number);
	}

	//Overriding the toString method.
	public String toString() {
		return driverName + "-"+dateOfIssue+"-"+getRandomTwoDigitNumber();
	}

}