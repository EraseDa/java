package kr.kh.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/")
	public ModelAndView home(ModelAndView mv,String name, Integer age) {
		//int 대신 Integer 사용. int는 null값을 허용하지 않아서 오류가 남. 래퍼 클래스를 사용해주는게 좋음
		mv.addObject("age1", age);
		mv.addObject("name1",name); //왼쪽 매개변수는 화면에서 불릴 이름, 오른쪽 매개변수는 보내는 데이터 
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/board/{num}")
	public ModelAndView board(ModelAndView mv,@PathVariable("num")Integer num1) {
		System.out.println("게시글 번호 : " + num1);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/test")
	public ModelAndView test(ModelAndView mv, InfoVO info) {
		mv.addObject("info1",info);
		mv.setViewName("home2");
		return mv;
	}
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public ModelAndView login(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv, Login login) {
		mv.addObject("login1",login);
		System.out.println(login);
		mv.setViewName("login");
		return mv;
	}
	
}
