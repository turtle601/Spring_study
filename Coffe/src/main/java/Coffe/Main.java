package Coffe;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCtx.xml");
		Employee customer = (Employee) ctx.getBean("employee");
		
		//종업원에게 내가 시키고 싶은 커피를 주문한다. 
		customer.takeout();
		
		//출력창에 해당 커피의 가격이 나온다. 
		ctx.close();

	}

}
