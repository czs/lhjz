package com.canzs.lhjz.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.canzs.lhjz.util.PropUtil;

public class PropUtilTest {

	@Test
	public void testGetValueString() {
		System.out.println(PropUtil.getValue("weixin.api.url.access.token"));
		System.out.println(PropUtil.getValue("weixin.api.url.access.expires.in"));
	}

	@Test
	public void save() {
		assertTrue(PropUtil.save("key", "value"));
	}

}
