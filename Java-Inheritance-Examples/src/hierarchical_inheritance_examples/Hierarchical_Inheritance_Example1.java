package hierarchical_inheritance_examples;

class Phone{
	static String company="Nokia";
	//method
	void calling() {
		System.out.println("Calling from "+company+" landline phone");
	}
}

class MobilePhone extends Phone{
	//Method
	void keypadMobile() {
		System.out.println("Calling from "+company+" keypad mobile");
	}
}

class AndroidPhone extends Phone{
	//method
	void androidMobile() {
		System.out.println("Calling from "+company+" Android mobile");
	}
}

class Iphone extends Phone{
	String brand="Apple";
	//method
	void iphoneMobile() {
		System.out.println("Calling from "+brand+" IOS mobile");
	}
}
public class Hierarchical_Inheritance_Example1 {
	public static void main(String[] args) {
		//creating object for the child class
		Iphone obj1=new Iphone();
		
		//Calling methods using the child class object
		obj1.calling();
		//obj1.keypadMobile();//compiletime error
		obj1.iphoneMobile();
		//obj1.androidMobile();//compile time error
	}
}
