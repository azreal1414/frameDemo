package frame.ssm.demo.security.realm;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import frame.ssm.demo.model.TDUser;
import frame.ssm.demo.service.TDUserService;

public class UserRealm extends AuthorizingRealm {
	
	@Autowired
	private TDUserService tdUserService;
	
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//获取当前登录的用户名
		TDUser user = (TDUser) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		List<String> list = tdUserService.selectRoleByUserAccount(user.getAccount());
		simpleAuthorInfo.addRoles(list);
		return simpleAuthorInfo;
	}
	/**
	 * 认证
	 * @param token 身份令牌
     * @return 认证信息
     * @throws AuthenticationException
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken authToken = (UsernamePasswordToken) token;
		TDUser user = tdUserService.getUserByUsername(authToken.getUsername());
		if (null != user) {
			return new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
		}
		return null;
	}
}
