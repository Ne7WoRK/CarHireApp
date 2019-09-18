/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project  - "Car hire application"
 */
package CarHireApp;

import java.util.Calendar;

public class DrivingLicence {

	// Private variables,which will be used in the constructor of the DrivingLicence class.
	// Since the licence should be unique the constructor should use immutable variables.
	private final Name driverName;
	private final String driverDateOfBirth;
	private final int dateOfIssue;
	private final LicenceNumber number;
	private final boolean isFull;

	// Constructor for DrivingLicence with all the variables it should include.
	public DrivingLicence(Name driverName, Calendar birth, Calendar issue, LicenceNumber number, boolean isFull) {
		this.driverName = driverName;
		this.driverDateOfBirth = ((Calendar) birth).get(Calendar.YEAR)+"/"+birth.get(Calendar.MONTH)+"/"+birth.get(Calendar.DATE);
		this.dateOfIssue = issue.get(Calendar.YEAR);
		this.number = number;
		this.isFull = isFull;
	}

	// Get method to get the full name of a driver.
	public Name getFullName() {
		return driverName;
	}

	// Get method so we can get the date of birth of the driver.
	public String getDriverDateOfBirth() {
		return driverDateOfBirth;
	}

	// Get method for the date of issue so we can see if it is valid.
	public int getDateofIssue() {
		return dateOfIssue;
	}

	// Method that returns a unique number of the driving licence.
	public LicenceNumber getLicenceNumber() {
		return number;
	}

	// Boolean method showing if the licence itself is full.
	public boolean getIsFull() {
		return isFull;
	}

	public String toString() {
		return "Name of the driver: " + driverName + "\n" + "Date of birth of the driver: " + driverDateOfBirth + "\n"
				+ "Year of issue of the licence: " + dateOfIssue + "\n" + "Licence number: " + number + "\n"
				+ "Is it full?: " + isFull;
	}
}
