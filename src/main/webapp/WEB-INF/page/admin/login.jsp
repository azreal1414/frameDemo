<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/page/head.jsp" %>
<title>后台登录</title>
</head>
<body>
<div class="header"></div>
<div class="loginWraper">
  <div id="loginform" class="loginBox">
    <form id="loginForm" class="form form-horizontal" action="" method="post">
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input id="account" name="account" type="text" placeholder="账户" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="password" name="password" type="password" placeholder="密码" class="input-text size-L">
        </div>
      </div>
      <!-- <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">
          <img src=""> <a id="kanbuq" href="javascript:;">看不清，换一张</a> </div>
      </div> -->
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <label for="online">
            <input type="checkbox" name="online" id="online" value="">
            使我保持登录状态</label>
        </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input id="login" name="login" type="button" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
          <input name="reset" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
        </div>
      </div>
    </form>
  </div>
</div>
<div class="footer">Copyright 你的公司名称 by H-ui.admin v3.0</div>
<!-- 弹出层 -->
<div id="modal-demo" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content radius">
			<div class="modal-header">
				<h3 class="modal-title">提示信息</h3>
				<a class="close" data-dismiss="modal" aria-hidden="true" href="javascript:void();">×</a>
			</div>
			<div class="modal-body">
				<p>用户已经登录，是否退出并重新登录?</p>
			</div>
			<div class="modal-footer">
				<button class="btn btn-primary relog">是</button>
				<button class="btn" data-dismiss="modal" aria-hidden="true">否</button>
			</div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/page/foot.jsp" %>
<script type="text/javascript">
	$('#login').click(function(){
		var options = {
			url  : "/admin/login",
			type : "post",
			success : function(res){
				console.log(res);
				res = eval('('+res+')');
				if(res.code == 200){
					
				}else if(res.code == 401){
					$("#modal-demo").modal("show");
				}else{
					$.Huimodalalert(res.message,2000);
				}
			}
		};
		$("#loginForm").ajaxSubmit(options);
	});
	$('.relog').click(function(){
		var data = {};
		data.callBack = "admin";
		$.ajax({
			url : "/logout",
			type : "post",
			data : data
		});
		$("#modal-demo").modal("hide");
	})
</script>
</body>
</html>