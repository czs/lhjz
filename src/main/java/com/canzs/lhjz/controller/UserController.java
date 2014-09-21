/**
 * UserController.java
 */
package com.canzs.lhjz.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.canzs.lhjz.base.BaseController;
import com.canzs.lhjz.pojo.model.User;
import com.canzs.lhjz.pojo.vo.PageResult;
import com.canzs.lhjz.pojo.vo.ReqBody;
import com.canzs.lhjz.pojo.vo.ResultMsg;
import com.canzs.lhjz.service.IUserService;

/**
 * 【用户】请求控制层.
 * 
 * @creation 2014年09月21日 08:44:42
 * @modification 2014年09月21日 08:44:42
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	IUserService userService;

	/**
	 * 验证【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @return
	 */
	@RequestMapping("login")
	public String login(@ModelAttribute User user, Locale locale, Model Model) {

		logger.debug("添加【用户】");

		// 参数验证
		Assert.notNull(user.getUsername());
		Assert.notNull(user.getPassword());

		boolean exists = userService.exists(locale, user);

		if (exists) {
			return "main";
		} else {
			Model.addAttribute("error", "登录信息输入错误!");
			return "user/login-input";
		}
	}

	/**
	 * 转到登录【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @return
	 */
	@RequestMapping("loginInput")
	public String loginInput(Locale locale) {

		logger.debug("转到登录【用户】");

		return "user/login-input";
	}

	/**
	 * 添加【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @return
	 */
	// @RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("添加【用户】");

		// TODO

		User user = getParam(reqBody, User.class);

		// 参数验证
		// Assert.notNull(user.get);

		boolean saved = userService.save(locale, user);

		// TODO null->ID
		return new ResultMsg(saved, reqBody.getId(), null);
	}

	/**
	 * 删除【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @return
	 */
	// @RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("删除【用户】");

		// TODO

		User user = getParam(reqBody, User.class);

		// 参数验证
		// Assert.notNull(user.get);

		boolean deleted = userService.delete(locale, user);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("获取【用户】");

		// TODO

		User user = getParam(reqBody, User.class);

		// 参数验证
		// Assert.notNull(user.get);

		User getUser = userService.get(locale, user);

		return new ResultMsg(true, reqBody.getId(), getUser);
	}

	/**
	 * 更新【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @return
	 */
	// @RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("更新【用户】");

		// TODO

		User user = getParam(reqBody, User.class);

		// 参数验证
		// Assert.notNull(user.get);

		boolean updated = userService.update(locale, user);

		return new ResultMsg(updated, reqBody.getId());
	}

	/**
	 * 列举【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("列举【用户】");

		// TODO

		// User user = getParam(reqBody, User.class);

		// 参数验证
		// Assert.notNull(user.get);

		List<User> userList = userService.list(locale);

		return new ResultMsg(reqBody.getId(), userList);
	}

	/**
	 * 查询【用户】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @return
	 */
	// @RequestMapping("query")
	@ResponseBody
	public ResultMsg query(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【用户】");

		// TODO

		User user = getParam(reqBody, User.class);

		// 参数验证
		// Assert.notNull(user.get);

		List<Map<String, Object>> userList = userService.query(locale, user);

		return new ResultMsg(reqBody.getId(), userList);
	}

	/**
	 * 查询【用户】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年09月21日 08:44:42
	 * @modification 2014年09月21日 08:44:42
	 * @return
	 */
	// @RequestMapping("paging")
	@ResponseBody
	public ResultMsg paging(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【用户】");

		// TODO

		User user = getParam(reqBody, User.class);

		// 参数验证
		Assert.notNull(reqBody.getStart());
		Assert.notNull(reqBody.getLimit());

		// Assert.notNull(user.get);

		PageResult pageResult = userService.paging(locale, user, reqBody.getStart(), reqBody.getLimit());

		return new ResultMsg(reqBody.getId(), pageResult.getList(), pageResult.getTotal());
	}

}
