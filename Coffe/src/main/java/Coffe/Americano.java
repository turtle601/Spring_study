package Coffe;

public class Americano implements Coffee{
	String price;
	
	public void setPrice(String money) {
		this.price = money;
		
	}
	
	public void howmuch() {
		
		System.out.println("아메리카노의 가격은 " + price);
		
	}
	
}