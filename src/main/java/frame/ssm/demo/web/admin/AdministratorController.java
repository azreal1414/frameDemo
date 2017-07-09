package frame.ssm.demo.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import frame.ssm.demo.common.base.BaseController;

/**
 * 后台管理员功能控制台
 * @author ZhouYu
 * @version 1.0
 */
@Controller
@RequestMapping(value = "admin")
public class AdministratorController extends BaseController{
	
	@RequestMapping(value = "/showList")
	public String showList(){
		return "/admin/administrator";
	}
}
