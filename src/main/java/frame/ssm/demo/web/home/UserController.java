package frame.ssm.demo.web.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;

import frame.ssm.demo.common.base.BaseController;
import frame.ssm.demo.common.utils.PageUtils;
import frame.ssm.demo.model.User;
import frame.ssm.demo.service.UserService;
/**
 * 用户控制器
 * @author ZhouYu
 * @version 1.0
 */
@Controller
@RequestMapping(value = "home")
public class UserController extends BaseController{
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public String test(User user){
		PageUtils.startPage(user.getPage(), user.getRows());
		Page<User> page = (Page<User>)userService.selectList(user);
		return responseJsonPageData(page.getResult(), page.getTotal());
	}
}
