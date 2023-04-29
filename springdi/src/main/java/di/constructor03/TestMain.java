package di.constructor03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext fac = new ClassPathXmlApplicationContext("/config/constructor.xml");
		
		IWriteArticleMgr service = (IWriteArticleMgr)fac.getBean("articleMgr");
		
		service.write(new ArticleDTO());
	}

}
