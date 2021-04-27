package springBean;

public class Coffee {
	String name;
	
	public void setCoffee(String name) {
		this.name = name;
	}
	
	public void getName() {
		System.out.println("주문하신 커피는 " + name);
	}
}
