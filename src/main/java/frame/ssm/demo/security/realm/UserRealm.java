package frame.ssm.demo.security.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import frame.ssm.demo.service.UserService;

public class UserRealm {
	
	@Autowired
	private UserService userService;
	
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//获取当前登录的用户名
		//User user = (User) principals.getPrimaryPrincipal();
		
		//SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		
		return null;
	}
	
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		return null;
	}
}
