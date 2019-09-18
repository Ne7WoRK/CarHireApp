/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project  - "Car hire application"
 */
package CarHireApp;
public class SmallCar extends AbstractCar {
	
	private static final int CAPACITY = 45;

	// Overriding all the methods which make the difference between a small and  large car.

	// Method returning the tank capacity of a small car.
	public int fuelCapacity() {
		return CAPACITY;
	}

	// Method returning the amount of fuel used during a journey with the small
	// car.
	public int drive(int km) {
		Math.abs(km);
		return km / 25;
	}
}