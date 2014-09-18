package com.canzs.lhjz.component;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.canzs.lhjz.base.BaseTest;
import com.canzs.lhjz.component.PropUtil;

public class PropUtilTest extends BaseTest {

	@Autowired
	PropUtil propUtil;

	@Test
	public void test() {
		assertTrue(propUtil.isLogReqbody());
	}

}
