/**
 * IUserService.java
 */
package com.canzs.lhjz.service;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.canzs.lhjz.base.IBaseService;
import com.canzs.lhjz.pojo.model.User;
import com.canzs.lhjz.pojo.vo.PageResult;

/**
 * 【用户】业务逻辑接口.
 * 
 * @creation 2014年09月21日 08:44:41
 * @modification 2014年09月21日 08:44:41
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IUserService extends IBaseService {

	/**
	 * 创建【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:41
	 * @modification 2014年09月21日 08:44:41
	 * @param user
	 * @return
	 */
	boolean save(Locale locale, User user);

	/**
	 * 删除【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:41
	 * @modification 2014年09月21日 08:44:41
	 * @param user
	 * @return
	 */
	boolean delete(Locale locale, User user);

	/**
	 * 获取【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:41
	 * @modification 2014年09月21日 08:44:41
	 * @param user
	 * @return
	 */
	User get(Locale locale, User user);
	
	/**
	 * 更新【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:41
	 * @modification 2014年09月21日 08:44:41
	 * @param user
	 * @return
	 */
	boolean update(Locale locale, User user);
	
	/**
	 * 列举【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:41
	 * @modification 2014年09月21日 08:44:41
	 * @param user
	 * @return
	 */
	List<User> list(Locale locale);

	/**
	 * 查询【用户】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:41
	 * @modification 2014年09月21日 08:44:41
	 * @param user
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, User user);

	/**
	 * 查询【用户】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:41
	 * @modification 2014年09月21日 08:44:41
	 * @param user
	 * @return
	 */
	PageResult paging(Locale locale, User user, Long start, Long limit);

	/**
	 * 判断【用户】是否存在.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:41
	 * @modification 2014年09月21日 08:44:41
	 * @param user
	 * @return
	 */
	boolean exists(Locale locale, User user);
}
