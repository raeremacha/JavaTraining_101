package Exercise2;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(5, "Hyundai");
		Truck truck = new Truck(18, "Fuso");
		
		car.startEngine();
		car.refuel();
		
		truck.startEngine();
		truck.refuel();
		
		destroyVehicle(car);
		//destroyVehicle(truck);

	}
	
    public static void destroyVehicle(Vehicle v) {
        v.destroy();
    }

}
