package kr.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.multi.erp.emp.EmpDTO;
import kr.multi.erp.emp.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService service;
	
	@RequestMapping("/signup")
	public String signup() {
		return "emp/register";
	}
	
	@RequestMapping(value="/emp/insert" , method = RequestMethod.GET)
	public String showPage() {
		return "emp/insert";
	}
	
	@RequestMapping(value = "/emp/insert" , method = RequestMethod.POST)
	public String insert(EmpDTO user) {
		service.insert(user);
		return "main/index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "emp/login";
	}
	
	@RequestMapping("/login.do")
	public ModelAndView logindo(@ModelAttribute EmpDTO user ,HttpSession session) {
		ModelAndView mav = new ModelAndView("main/index");
		EmpDTO loginUser = service.login(user.getId(), user.getPass());
		if(loginUser != null) {
			session.setAttribute("user", user);
		}else {
			mav.setViewName("emp/login");
		}
		
		return mav;
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "main/index";
	}
	
	
}
