package frame.ssm.demo.common.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

import frame.ssm.demo.common.enums.GlobalEnums;
import frame.ssm.demo.model.User;

/**
 * 基础控制
 * @author ZhouYu
 * @version 1.0
 */
public class BaseController {
	/**
	 * 日志
	 */
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	/**
	 * 当前日期
	 */
	protected Date date = new Date();
	/**
	 * 时间格式化
	 * @param fomat 时间格式
	 * @return 字符串类型时间
	 */
	protected String getTime(String fomat){
		SimpleDateFormat sdf = new SimpleDateFormat(fomat);
		return sdf.format(date);
	}
	/**
	 * 获取当前登录用户信息
	 * @return 用户实体
	 */
	protected User getUser(){
		return (User) SecurityUtils.getSubject().getPrincipal();
	}
	/**
	 * 分页工具类
	 * @param rows 起始页
	 * @param total 分页大小
	 * @return
	 */
	protected String responseJsonPageData(@SuppressWarnings("rawtypes") List rows, long total) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", GlobalEnums.SUCCESS.getCode());
		if (CollectionUtils.isNotEmpty(rows)) {
			jsonObject.put("rows", rows);
			jsonObject.put("total", total);
		}else {
			jsonObject.put("rows", "");
			jsonObject.put("total", 0);
		}
		return jsonObject.toString();
	}
	/**
	 * 返回成功信息
	 * @param msg 信息
	 * @return
	 */
	public String responseJsonSuccess(String msg){
		if (msg == null || "".equals(msg)) {
			msg = "成功!";
		}
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", 200);
		jsonObject.put("message",msg);
		return jsonObject.toString();
	}
	/**
	 * 返回失败信息
	 * @param msg 信息
	 * @return
	 */
	public String responseJsonFail(String msg){
		if (msg == null || "".equals(msg)) {
			msg = "失败!";
		}
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", 400);
		jsonObject.put("message",msg);
		return jsonObject.toJSONString();
	}
	/**
	 * 返回成功信息
	 * @param object
	 * @return
	 */
	public String responseJsonSuccess(Object object){
		if (object != null) {
			JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", 200);
            jsonObject.put("data", object);
            return jsonObject.toString();
		}
		return null;
	}
	/**
	 * 返回失败信息
	 * @param msg 信息
	 * @return
	 */
	public String responseJsonFail(Integer code,String msg){
		if (msg == null || "".equals(msg)) {
			msg = "失败!";
		}
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", code);
		jsonObject.put("message",msg);
		return jsonObject.toJSONString();
	}
}
