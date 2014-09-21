/**
 * IUserDao.java
 */
package com.canzs.lhjz.dao;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.canzs.lhjz.pojo.model.User;

/**
 * 【用户】持久化接口层.
 * 
 * @creation 2014年09月21日 08:44:42
 * @modification 2014年09月21日 08:44:42
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IUserDao {

	/**
	 * 查询【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @param locale
	 * @param user
	 * @param start
	 * @param limit
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, User user, Long start, Long limit);

	/**
	 * 查询总数查询【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @param locale
	 * @param user
	 * @return
	 */
	long queryCount(Locale locale, User user);
	
}
