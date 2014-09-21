/**
 * UserServiceImpl.java
 */
package com.canzs.lhjz.service.impl;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.canzs.lhjz.base.impl.BaseServiceImpl;
import com.canzs.lhjz.component.ApiInvoker;
import com.canzs.lhjz.dao.IUserDao;
import com.canzs.lhjz.pojo.model.User;
import com.canzs.lhjz.pojo.vo.PageResult;
import com.canzs.lhjz.service.IUserService;

/**
 * 【用户】业务逻辑实现.
 * 
 * @creation 2014年09月21日 08:44:42
 * @modification 2014年09月21日 08:44:42
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl implements IUserService {

	private static Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	IUserDao userDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Override
	public boolean save(Locale locale, User user) {

		logger.debug("[业务逻辑层]添加【用户】");

		// TODO
		return true;
	}

	@Override
	public boolean delete(Locale locale, User user) {

		logger.debug("[业务逻辑层]删除【用户】");

		// TODO
		return true;
	}

	@Override
	public User get(Locale locale, User user) {

		logger.debug("[业务逻辑层]获取【用户】");

		// TODO
		return null;
	}

	@Override
	public boolean update(Locale locale, User user) {

		logger.debug("[业务逻辑层]更新【用户】");

		// TODO
		return true;
	}

	@Override
	public List<User> list(Locale locale) {

		logger.debug("[业务逻辑层]列举【用户】");

		// TODO
		return null;
	}

	@Override
	public List<Map<String, Object>> query(Locale locale, User user) {

		logger.debug("[业务逻辑层]查询【用户】(不分页)");

		// TODO
		return null;
	}

	@Override
	public PageResult paging(Locale locale, User user, Long start, Long limit) {

		logger.debug("[业务逻辑层]查询【用户】(分页)");

		PageResult pageResult = new PageResult();

		// TODO
		return pageResult;
	}

	@Override
	public boolean exists(Locale locale, User user) {

		logger.debug("[业务逻辑层]判断【用户】是否存在");

		com.canzs.lhjz.pojo.entity.User user2 = new com.canzs.lhjz.pojo.entity.User();
		user2.setUsername(user.getUsername());
		user2.setPassword(user.getPassword());

		return findOneByExample(user2, com.canzs.lhjz.pojo.entity.User.class) != null;
	}

}