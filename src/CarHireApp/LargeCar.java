/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project  - "Car hire application"
 */
package CarHireApp;
public class LargeCar extends AbstractCar {
	
	//Class in which we override all the methods which should be different from the small car.
	private static final int CAPACITY = 65;
	
	//Method giving the capacity of the large car.
	public int fuelCapacity() {
		return CAPACITY;
	}
	
	//Drive method returning the fuel used in integer value for a journey.
	public int drive(int km) {
		Math.abs(km);
		int fuelUsed;
		if (km <= 50) {
			fuelUsed = km / 15;
		} else {
			int extra = km - 50;
			fuelUsed = extra / 20 + 50 / 15;
		}
		return fuelUsed;
	}
}
