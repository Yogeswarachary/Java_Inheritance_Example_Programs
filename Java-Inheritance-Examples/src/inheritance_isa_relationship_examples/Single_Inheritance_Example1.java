package inheritance_isa_relationship_examples;

class Animal{
	//Method
	void eat() {
		System.out.println("Eating......");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}

public class Single_Inheritance_Example1 {
	public static void main(String[] args) {
		Dog obj1=new Dog();
		obj1.bark();
		obj1.eat();
	}
}
