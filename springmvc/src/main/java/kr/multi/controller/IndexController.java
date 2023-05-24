package kr.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "main/index";
	}
	
	@RequestMapping("/index.do")
	public String tiles_index() {
		return "index";//컨트롤러에서 리턴하는 뷰이름은
							//tiles 설정파일에 등록한 
							//<definition>엘리먼트의
							//name 속성에 정의한 이름
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/jstl-if")
	public String jstlif() {
		return "jstl/jstl_if";
	}
	@RequestMapping("/jstl-choose")
	public String jstlchoose() {
		return "jstl/jstl_choose";
	}
	@RequestMapping("/jstl-foreach")
	public String jstlforeach() {
		return "jstl/jstl_foreach";
	}
	@RequestMapping("/jstl-collection-foreach")
	public String jstlCollectionForeach() {
		return "jstl/jstl_collection_foreach";
	}
}

