package frame.ssm.demo.web.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import frame.ssm.demo.common.base.BaseController;
import frame.ssm.demo.common.utils.LoginUtil;
import frame.ssm.demo.common.utils.ParamUtil;
import frame.ssm.demo.model.RoleRelation;
import frame.ssm.demo.model.User;
import frame.ssm.demo.service.UserService;

/**
 * 后台用户登录控制器
 * @author ZhouYu
 * @version 1.0
 */
@Controller
@RequestMapping(value = "admin")
public class AdminLoginController extends BaseController{
	/**
	 * 注入service
	 */
	@Autowired
	UserService userService;
	/**
	 * 后台登录
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login")
	@ResponseBody
	public String login(User user,HttpServletRequest request){
		//判断用户是否登录
		if (this.getUser() != null) {
			return this.responseJsonFail(401,"用户已经登录!");
		}
		if (!ParamUtil.isBlank(user.getAccount()) && !ParamUtil.isBlank(user.getPassword())) {
			//调用登录公用方法
			boolean login = LoginUtil.login(user.getAccount(), user.getPassword());
			//登录成功后将用户信息放入session中
			if (login) {
				User userInfo = this.getUser();
				List<RoleRelation> list = userService.getRolesByUserId(userInfo.getAccount());
				for (RoleRelation relation : list) {
					if (relation.getRoleUuid().equals("11111111")) {
						request.getSession().setAttribute("user", userInfo);
						return this.responseJsonSuccess("登录成功!");
					}
				}
				return this.responseJsonFail("权限不足!");
			}
		}
		return this.responseJsonFail("获取用户名或密码失败!");
	}
	
	@RequestMapping(value = "loginTest")
	@ResponseBody
	public String loginTest(HttpServletRequest request){
		User user = this.getUser();
		if (user != null) {
			request.getSession().setAttribute("user", user);
			return this.responseJsonSuccess(request.getSession().getAttribute("user"));
		}
		return this.responseJsonFail("没有获取到用户信息!");
	}
}
