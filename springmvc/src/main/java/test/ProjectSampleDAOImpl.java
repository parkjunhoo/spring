package test;

import org.springframework.stereotype.Repository;

@Repository
public class ProjectSampleDAOImpl implements ProjectSampleDAO{

	@Override
	public void test() {
		System.out.println("test");
	}

}
