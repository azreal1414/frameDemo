package frame.ssm.demo.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前台首页控制器
 * @author ZhouYu
 * @version 1.0
 */
@Controller
public class IndexController {
	
	@RequestMapping(value = "/home")
	public String toIndex(){
		return "index";
	}
}
