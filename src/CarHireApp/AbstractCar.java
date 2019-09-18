/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project  - "Car hire application"
 */
package CarHireApp;

public abstract class AbstractCar implements Car {

	// Private variables for the AbstractCar method.
	// In this method we develop all methods which are the same for SmallCar and
	// LargeCar.
	private RegistrationNumber regNumber;
	private int currentFuelCapacity;
	private boolean rentedCar;

	// Get method for the private variable regNumber,so we have access to int
	// through this method.
	public RegistrationNumber getRegNumber() {
		return regNumber;
	}

	// Method returning the current fuel capacity.
	public int getCurrentFuelCapacity() {
		return currentFuelCapacity;
	}

	public final void setCurrentFuelAmount(int fuel) {
		this.currentFuelCapacity = fuel;
	}

	// Boolean method which will return true if tank is full and false if it is
	// not.
	public boolean fullTank() {
		if (getCurrentFuelCapacity() == fuelCapacity()) {
			return true;
		} else
			return false;
	}

	// Boolean method returning true if the car is rented and false if it is
	// not.
	public boolean getRentedCar() {
		return rentedCar;
	}

	// Method which will give us information whether the car is rented or not.
	public final void carState(boolean state) {
		rentedCar = state;
	}

	// The method through which we will add fuel in the car.
	public final int addFuel(int fuel) {
		if (fullTank() == true) {
			return 0;
		} else if (!getRentedCar()) {
			return 0;
		}
		int litres = getCurrentFuelCapacity();
		litres += fuel;

		if (fuel > getCurrentFuelCapacity()) {
			this.currentFuelCapacity = fuelCapacity();
			return -(litres - fuelCapacity() - fuel);
		}
		setCurrentFuelAmount(litres);
		return fuel;
	}
}