package multi_level_inheritance_examples;

//Parent class
class Bikes{
	static String company="Hero";
	//method
	void bike() {
		System.out.println(company+" Manufacturing bikes");
	}
}

//Sub class of bikes
class FuelBike extends Bikes{
	//Method
	void BikeMoving() {
		System.out.println(company+" fuel bikes are running....");
	}
}

//sub class of FuelBikes class
class ElectricBikes extends FuelBike{
	//method
	void elsectricBike() {
		System.out.println(company+" Electric bikes are running");
	}
}

//Main class
public class MultiLevel_Inheritance_Example2 {
	public static void main(String[] args) {
		//creating an object for the above sub class
		ElectricBikes obj1=new ElectricBikes();
		
		//Calling methods using the child class object
		obj1.bike();
		obj1.BikeMoving();
		obj1.elsectricBike();
	}
}
