package frame.ssm.demo.common.base;

import java.util.List;

/**
 * 基础DAO接口
 * @author ZhouYu
 * @version 1.0
 */
public interface BaseMapper<T> {
	/**
	 * 全量插入
	 * @param entity 实体
	 * @return
	 */
	int insert(T entity);
	/**
	 * 条件插入
	 * @param entity 实体
	 * @return
	 */
    int insertSelective(T entity);
    /**
	 * 根据主键查询
	 * @param entity 实体
	 * @return
	 */
    T selectByPrimaryKey(String key);
    /**
	 * 条件修改
	 * @param entity 实体
	 * @return
	 */
    int updateByPrimaryKeySelective(T entity);
    /**
	 * 根据主键修改
	 * @param entity 实体
	 * @return
	 */
    int updateByPrimaryKey(T entity);
    /**
	 * 查询集合
	 * @param entity 实体
	 * @return
	 */
    List<T> selectList(T entity);
    /**
	 * 数量查询
	 */
    int count();
}
