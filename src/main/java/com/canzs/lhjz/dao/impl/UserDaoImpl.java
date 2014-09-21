/**
 * UserDaoImpl.java
 */
package com.canzs.lhjz.dao.impl;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.canzs.lhjz.base.impl.BaseDaoImpl;
import com.canzs.lhjz.dao.IUserDao;
import com.canzs.lhjz.pojo.model.User;

/**
 * 【用户】持久化实现层.
 * 
 * @creation 2014年09月21日 08:44:42
 * @modification 2014年09月21日 08:44:42
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class UserDaoImpl extends BaseDaoImpl implements IUserDao {

	@Override
	public List<Map<String, Object>> query(Locale locale, User user, Long start, Long limit) {
		
		// TODO
		
		return null;
	}

	@Override
	public long queryCount(Locale locale, User user) {
	
		// TODO
	
		return 0L;
	}
	
}
