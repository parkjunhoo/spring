package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectSampleServiceImpl implements ProjectSampleService{
	
	@Autowired
	private ProjectSampleDAO dao;
	
	
	@Override
	public void serviceTest() {
		System.out.println("난 서비스단");
		dao.test();
	}
	
}
