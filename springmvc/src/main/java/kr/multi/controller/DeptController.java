package kr.multi.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.multi.erp.dept.DeptDTO;
import kr.multi.erp.dept.DeptService;

@Controller
public class DeptController {

	@Autowired
	DeptService service;
	
	/*
	 * @RequestMapping("/dept/list.do") public ModelAndView list() { ModelAndView
	 * mav = new ModelAndView("dept/deptlist_jstl"); ArrayList<DeptDTO> list =
	 * (ArrayList<DeptDTO>)service.select(); mav.addObject("deptList",list);
	 * System.out.println(list); return mav; }
	 */
	
	//tiles
	@RequestMapping("/dept/list.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("deptlist");
		ArrayList<DeptDTO> list = (ArrayList<DeptDTO>)service.select();
		mav.addObject("deptList",list);
		System.out.println(list);
		return mav;
	}
	
	@RequestMapping("/dept/read.do")
	public ModelAndView read(@RequestParam String deptno) {
		ModelAndView mav = new ModelAndView("dept/dept_read_jstl");
		
		mav.addObject("dept",service.read(deptno));
		
		return mav;
	}
}
