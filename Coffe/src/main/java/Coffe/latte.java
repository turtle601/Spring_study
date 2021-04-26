package Coffe;

public class latte implements Coffee{
	String price;
	
	public void setPrice(String money) {
		this.price = money;
		
	}
	
	public void howmuch() {
		
		System.out.println("라떼의 가격은 " + price);
	}
}
