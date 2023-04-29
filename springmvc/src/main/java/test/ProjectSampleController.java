package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectSampleController {
	
	@Autowired
	ProjectSampleService service;
	
	@RequestMapping("/pro.do")
	public String sampletest() {
		service.serviceTest();
		return "main/index";
	}
}
