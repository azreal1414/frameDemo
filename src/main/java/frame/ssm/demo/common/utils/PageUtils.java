package frame.ssm.demo.common.utils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * 分页工具类
 * @author ZhouYu
 * @version 1.0
 */
public class PageUtils {
	/**
	 * 分页拦截
	 * @param pageNum 起始页
	 * @param pageSize 分页大小
	 * @param <E> 泛型
	 * @return 分页信息
	 */
	public static <E> Page<E> startPage(int pageNum, int pageSize){
		return PageHelper.startPage(pageNum, pageSize);
	}
}
