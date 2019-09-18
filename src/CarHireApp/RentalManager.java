/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project  - "Car hire application"
 */
package CarHireApp;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import CarHireApp.Car;
import CarHireApp.Car.CarType;


public class RentalManager {
	
	private static final int smallCars = 20;
	private static final int largeCars = 10;
	
	private final Map<DrivingLicence, Car> contract = new HashMap<DrivingLicence, Car>();
	private final SmallCar[] smallCarss = new SmallCar[smallCars];
	private final LargeCar[] largeCarss = new LargeCar[largeCars];
	
	public static final RentalManager INSTANCE = new RentalManager();
	
	private RentalManager() {
		for (int i = 0; i < smallCars; i++)
			smallCarss[i] = new SmallCar();
		for (int i = 0; i < largeCars; i++)
			largeCarss[i] = new LargeCar();
	}
	
	public int availableCars(CarType type) {
		int rentedCars = 0;
		int availableCars = 0;

		switch (type) {
		case smallCar:
			for (SmallCar car : smallCarss)
				if (((Car) car).getRentedCar())
					rentedCars++;
			availableCars = smallCars - rentedCars;
			break;
		case largeCar:
			for (LargeCar car : largeCarss)
				if (car.getRentedCar())
					rentedCars++;
			availableCars = largeCars - rentedCars;
			break;
		}
		return availableCars;
	}
	
	public Collection<Car> getRentedCars() {
		return contract.values();
	}
	
	public boolean issueCar(DrivingLicence drivingLicence, CarType type) {
		if (drivingLicence == null)
			throw new NullPointerException("Driving licence not found");

		if (!drivingLicence.getIsFull())
			return false;

		if (contract.containsKey(drivingLicence))
			return false;

		if (availableCars(type) == 0)

		return false;
		return false;
	}
	
	public Car getCar(DrivingLicence drivingLicence) {
		return contract.get(drivingLicence);
	}
	
	public int terminateRental(DrivingLicence drivingLicence) {
		
		if (drivingLicence == null)
			throw new NullPointerException("Driving licence not found or not complete.You can not rent a car");

		Car car = contract.remove(drivingLicence);
		if (car == null)
			throw new NullPointerException("Car should be refiled");

		int addingfuel = car.fuelCapacity() - car.getCurrentFuelCapacity();
		
		car.carState(false);
		
		return addingfuel;
	}
	
}
