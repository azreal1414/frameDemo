package frame.ssm.demo.web.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;

import frame.ssm.demo.common.base.BaseController;
import frame.ssm.demo.common.utils.PageUtils;
import frame.ssm.demo.model.TDUser;
import frame.ssm.demo.service.TDUserService;
/**
 * 用户控制器
 * @author ZhouYu
 * @version 1.0
 */
@Controller
@RequestMapping(value = "home")
public class UserController extends BaseController{
	
	@Autowired
	TDUserService tDUserService;
	
	@RequestMapping(value = "/userList")
	@ResponseBody
	public String test(TDUser user){
		PageUtils.startPage(user.getPage(), user.getRows());
		Page<TDUser> page = (Page<TDUser>)tDUserService.selectList(user);
		return responseJsonPageData(page.getResult(), page.getTotal());
	}
}
