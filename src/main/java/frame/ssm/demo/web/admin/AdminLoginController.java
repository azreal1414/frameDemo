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
import frame.ssm.demo.model.TDRoleRelation;
import frame.ssm.demo.model.TDUser;
import frame.ssm.demo.service.TDUserService;

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
	TDUserService tDUseServcie;
	/**
	 * 后台登录
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login")
	@ResponseBody
	public String login(TDUser user,HttpServletRequest request){
		//判断用户是否登录
		if (this.getUser() != null) {
			return this.responseJsonFail(401,"用户已经登录!");
		}
		if (!ParamUtil.isBlank(user.getAccount()) && !ParamUtil.isBlank(user.getPassword())) {
			//调用登录公用方法
			boolean login = LoginUtil.login(user.getAccount(), user.getPassword());
			//登录成功后将用户信息放入session中
			if (login) {
				TDUser userInfo = this.getUser();
				TDRoleRelation relation = new TDRoleRelation();
				relation.setUserAccount(userInfo.getAccount());
				List<TDRoleRelation> list = tDUseServcie.selectRoleByUserAccount(relation);
				for (TDRoleRelation rel : list) {
					if (rel.getRoleUuid().equals("11111111")) {
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
		TDUser user = this.getUser();
		if (user != null) {
			request.getSession().setAttribute("user", user);
			return this.responseJsonSuccess(request.getSession().getAttribute("user"));
		}
		return this.responseJsonFail("没有获取到用户信息!");
	}
	
	public static void main(String[] args) {
		String str = "123123123123";
		System.out.println(str.substring(0, 3));;
	}
}
