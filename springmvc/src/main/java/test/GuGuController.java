package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuGuController {
	
	@RequestMapping(value = "/gugu.do")
	public ModelAndView printgugu(){
		ModelAndView mav = new ModelAndView("gugu/gugu");
		mav.addObject("dd","dd");
		return mav;
	}
}
