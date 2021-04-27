package springBean;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:application.xml");
		// 새로운 객체 생성
		Coffee coffee = ctx.getBean("coffee",Coffee.class);
		coffee.setCoffee("Americano");
		coffee.getName(); //출력 : 주문하신 커피는 Americano
		
		// 다른 객체 생성 but 똑같은 객체 coffee 참조
		Coffee coffee2 = ctx.getBean("coffee", Coffee.class);
		
		// singleton일 경우 동일한 객체를 참조(coffee = coffee2 주소가 같음)
		// prototype일 경우 새로운 복제 객체를 만들어 참조(coffee != coffee2 주소 다름)
		
		coffee2.getName(); //singleton 출력: 주문하신 커피는 Americano
						   //prototype 출력: 주문하신 커피는 null
		ctx.close();

	}

}
