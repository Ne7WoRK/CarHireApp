/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project || - "Online hotel booking system"
 */
package CarHireApp;
public interface Car {

	//Creating the Car interface

	public enum CarType {
		smallCar, largeCar
	}
	public RegistrationNumber getRegNumber();

	public int fuelCapacity();

	public int getCurrentFuelCapacity();

	public boolean fullTank();

	public boolean getRentedCar();

	public int addFuel(int fuel);

	public int drive(int km);
	
	public void carState (boolean rent);


}