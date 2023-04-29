package annotation.exam01;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LogicImpl implements Logic {
	@Override
	public void testLogic() {
		System.out.println("db연동,xml,json,연산등을 수행하는 비지니스 메소드");
	}
}
