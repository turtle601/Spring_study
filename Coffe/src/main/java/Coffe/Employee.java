package Coffe;

public class Employee {
	
	public Coffee coffee;
	public Employee(Coffee coffee) {
		this.coffee = coffee;
		
	}
	public void takeout() {
		coffee.howmuch();
		
	}
}
