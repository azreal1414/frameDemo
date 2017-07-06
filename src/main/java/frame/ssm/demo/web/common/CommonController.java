package frame.ssm.demo.web.common;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import frame.ssm.demo.common.base.BaseController;
/**
 * 公共控制器
 * @author ZhouYu
 * @version 1.0
 */
@Controller
@RequestMapping(value = "")
public class CommonController extends BaseController{
	/**
	 * 通用用户登录
	 * @return
	 */
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
	/**
	 * 后台用户登录
	 * @return
	 */
	@RequestMapping(value="/adminLogin")
	public String adminLogin(){
		return "admin/login";
	}
	/**
	 * 首页跳转
	 * @return
	 */
	@RequestMapping(value = "/home")
	public String index(){
		return "index";
	}
	/**
	 * 退出登录
	 * @param callBack 回调地址  为空时返回前台首页  
	 * @return
	 */
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request){
		SecurityUtils.getSubject().logout();
		String callBack = request.getParameter("callBack");
		if ("admin".equals(callBack)) {
			return "admin/login";
		}else if ("home".equals(callBack)) {
			return "home/login";
		}else {
			return "index";
		}
	}
}
