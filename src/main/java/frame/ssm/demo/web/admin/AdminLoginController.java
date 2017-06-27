package frame.ssm.demo.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import frame.ssm.demo.common.base.BaseController;
import frame.ssm.demo.model.User;
@Controller
@RequestMapping(value = "admin")
public class AdminLoginController extends BaseController{
	/**
	 * 后台登录页面
	 * @return
	 */
	@RequestMapping(value = "/toLogin")
	public String toAdminLogin(){
		return "/admin/login";
	}
	
	@RequestMapping(value = "/login")
	@ResponseBody
	public String login(User user){
		
		return "/admin/login?account="+user.getAccount();
	}
}
