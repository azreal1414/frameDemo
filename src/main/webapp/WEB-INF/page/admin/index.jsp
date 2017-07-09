<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/WEB-INF/page/admin/head.jsp" ></jsp:include>
<title>后台管理</title>
</head>
<body>
<!-- 引入导航 -->
<jsp:include page="/WEB-INF/page/admin/header.jsp" ></jsp:include>
<!-- 边部菜单 -->
<aside class="Hui-aside">
	<div class="menu_dropdown bk_2">
		<dl id="menu-admin">
			<dt>
				<i class="Hui-iconfont">&#xe616;</i> 管理员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="/admin/showList" data-title="管理员管理" href="javascript:void(0)">管理员管理</a></li>
				</ul>
			</dd>
		</dl>
	</div>
</aside>
<!-- 菜单隐藏功能 -->
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>

<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active">
					<span title="我的桌面" data-href="">后台管理</span>
					<em></em>
				</li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group">
			<a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;">
				<i class="Hui-iconfont">&#xe6d4;</i>
			</a>
			<a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;">
				<i class="Hui-iconfont">&#xe6d7;</i>
			</a>
		</div>
	</div>
	
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src=""></iframe>
		</div>
	</div>
</section>

<div class="contextMenu" id="Huiadminmenu">
	<ul>
		<li id="closethis">关闭当前 </li>
		<li id="closeall">关闭全部 </li>
	</ul>
</div>

<!-- 引入页脚 -->
<jsp:include page="/WEB-INF/page/admin/foot.jsp" ></jsp:include>
<script type="text/javascript">
	$(".signOut").click(function(){
		location.href = "/logout?callBack=admin";
	});
</script>
</body>
</html>