package Exercise1;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		
		car1.setBrand("Hyundai");
		car1.setModel("Tuczon");
		car1.setColor("Black");
		car1.setYear(2025);
		
	    Car car2 = new Car("Mitsubishi", "Montero", "Copper", 2025);
		
		
		System.out.println("Car 1" + "\n" + car1.output());
	    System.out.println("Car 2" + "\n" + car2.output());
	}

}
