package annotation.exam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("service")
public class ServiceImpl implements MyService {
	@Value("BTS")
	String name;
	
	@Value("hi")
	String msg;
	
	@Autowired
	Logic logic;
	
	public ServiceImpl() {
		
	}
	
	public ServiceImpl(String name,String msg,Logic logic) {
		this.name = name;
		this.msg = msg;
		this.logic = logic;
	}
	
	@Override
	public void testService() {
		System.out.println(msg+","+name);
		logic.testLogic();
	}

	
}
