package frame.ssm.demo.web.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import frame.ssm.demo.common.base.BaseController;
import frame.ssm.demo.model.TDUser;

/**
 * 后台管理控制台
 * @author ZhouYu
 * @version 1.0
 */
@Controller
@RequestMapping(value = "admin")
public class AdminManagerController extends BaseController{
	
	@RequestMapping(value = "/manage")
	public String manage(HttpServletRequest request){
		TDUser user = this.getUser();
		request.getSession().setAttribute("admin", user);
		return "/admin/index";
	}
}
