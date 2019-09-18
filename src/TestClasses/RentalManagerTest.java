/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project  - "Car hire application"
 */
package TestClasses;

import java.util.Calendar;

import CarHireApp.Car;
import CarHireApp.DrivingLicence;
import CarHireApp.LicenceNumber;
import CarHireApp.Name;
import CarHireApp.RentalManager;

public class RentalManagerTest {

	public static void main(String[] args) {

		Calendar a, b;
		Name a1;
		LicenceNumber r;
		DrivingLicence d1;

		a = new Calendar.Builder().setDate(1996, 8, 14).build();
		b = new Calendar.Builder().setDate(1985, 10, 1).build();
		a1 = new Name("Ivaylo", "Georgiev");
		r = new LicenceNumber(a1, a);
		boolean full = true;

		d1 = new DrivingLicence(a1, a, b, r, full);
		System.out.println("Is licence full: "+ RentalManager.INSTANCE.issueCar(d1, Car.CarType.smallCar));
		System.out.println("Rented car details: "+RentalManager.INSTANCE.getRentedCars());
		System.out.println("Available small cars: "+RentalManager.INSTANCE.availableCars(Car.CarType.smallCar));
		System.out.println("Available large cars: "+RentalManager.INSTANCE.availableCars(Car.CarType.largeCar));
		Car a5 = RentalManager.INSTANCE.getCar(d1);
		System.out.println("Is it possible to rent a car"+a5);
		
	}
}
