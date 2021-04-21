package creatingPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//		Walking walking = new Walking();
//		walking.move();
//			
		
		// GenericXmlApplicationContext 클래스를 이용하여 resouce 폴더에서 생성한 xml파일(모든 객체를 설정하는)을 가져온다. 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		// xml 파일에서 생성한 bean들 중 하나를 가져와서 객체 인스턴스를 생성한다. 
		Walking walking = ctx.getBean("tWalk", Walking.class);
		walking.move();
		
		// 사용 완료했으면 객체 인스턴스는 닫아준다. 
		ctx.close();
		
	}

}
