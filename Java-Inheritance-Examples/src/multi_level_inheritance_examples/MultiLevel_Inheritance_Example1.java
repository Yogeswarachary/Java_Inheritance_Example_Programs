package multi_level_inheritance_examples;

//Parent class
class Bird{
	void eat() {
		System.out.println("Eating...");
	}
}

//Child class
class Dove extends Bird{
	void fly() {
		System.out.println("Dove flying...");
	}
}

//child class
class LittleDove extends Dove{
	void following() {
		System.out.println("Little Dove following the Big Dove.....");
	}
}

public class MultiLevel_Inheritance_Example1 {
	public static void main(String[] args) {
		
		//Creating object for the little
		LittleDove obj1=new LittleDove();
		
		//Calling methods using the child class objects
		obj1.eat();
		obj1.fly();
		obj1.following();
	}
}
