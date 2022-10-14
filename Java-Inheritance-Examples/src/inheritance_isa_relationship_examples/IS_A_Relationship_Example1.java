package inheritance_isa_relationship_examples;

//Base class/Parent class
class Employee{
	float salary=30000;
	String company="TCS";
}

public class IS_A_Relationship_Example1 extends Employee {
	int bonus=10000;
	public static void main(String[] args) {
		
		//Creating an object for the child class
		IS_A_Relationship_Example1 obj1=new IS_A_Relationship_Example1();
		
		System.out.println("Salary is= "+obj1.salary+" "+obj1.company+" "+obj1.bonus);
		
	}
}
