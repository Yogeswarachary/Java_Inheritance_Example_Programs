package inheritance_isa_relationship_examples;

//Parent class
class Bike{
	String name;
	float cost;
	//Method
	void bike() {
		System.out.println("Xpulse"+" "+140000);
	}
}
class Xpulse extends Bike{
	String company;
	//Method
	void bikeDetails() {
		System.out.println("Pulsar"+" "+100000+" "+"Bajaj");
	}
	
}

public class Sinlge_Inheritance_Example2 {
	public static void main(String[] args) {
		
		//Creating object for the sub class/child class
		Xpulse obj1=new Xpulse();
		obj1.bike();
		obj1.bikeDetails();
	}
}
