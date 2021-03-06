/**
 * TestServiceImpl.java
 */
package com.canzs.lhjz.service.impl;

import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.canzs.lhjz.base.impl.BaseServiceImpl;
import com.canzs.lhjz.component.ApiInvoker;
import com.canzs.lhjz.dao.ITestDao;
import com.canzs.lhjz.pojo.model.Test;
import com.canzs.lhjz.pojo.vo.PageResult;
import com.canzs.lhjz.service.ITestService;

/**
 * 【测试】业务逻辑实现.
 * 
 * @creation 2014年03月19日 02:07:25
 * @modification 2014年03月19日 02:07:25
 * @company Canzs
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class TestServiceImpl extends BaseServiceImpl implements ITestService {

	private static Logger logger = Logger.getLogger(TestServiceImpl.class);

	@Autowired
	ITestDao testDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Override
	public boolean save(Locale locale, Test test) {
		
		logger.debug("[业务逻辑层]添加【测试】");
		
		// TODO
		return true;
	}

	@Override
	public boolean delete(Locale locale, Test test) {
		
		logger.debug("[业务逻辑层]删除【测试】");
		
		// TODO
		return true;
	}

	@Override
	public Test get(Locale locale, Test test) {
		
		logger.debug("[业务逻辑层]获取【测试】");
		
		// TODO
		return null;
	}

	@Override
	public boolean update(Locale locale, Test test) {
		
		logger.debug("[业务逻辑层]更新【测试】");
		
		// TODO
		return true;
	}
	
	@Override
	public List<Test> list(Locale locale) {

		logger.debug("[业务逻辑层]列举【测试】");

		// TODO
		return null;
	}
	
	@Override
	public List<Test> query(Locale locale, Test test) {

		logger.debug("[业务逻辑层]查询【测试】(不分页)");

		// TODO
		return null;
	}

	@Override
	public PageResult paging(Locale locale, Test test, Long start, Long limit) {

		logger.debug("[业务逻辑层]查询【测试】(分页)");

		PageResult pageResult = new PageResult();

		// TODO
		return pageResult;
	}
	
	@Override
	public boolean exists(Locale locale, Test test) {
		
		logger.debug("[业务逻辑层]判断【测试】是否存在");
		
		// TODO
		return true;
	}
	
}