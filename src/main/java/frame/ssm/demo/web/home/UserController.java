package frame.ssm.demo.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import frame.ssm.demo.common.base.BaseController;
/**
 * 用户控制器
 * @author ZhouYu
 * @version 1.0
 */
@Controller
@RequestMapping(value = "home")
public class UserController extends BaseController{
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public String test(){
		return "test";
	}
}
