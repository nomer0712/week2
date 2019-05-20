package com.zhangjie.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test() {
		String date="2018-10-03";
		String dateByInitMonth = DateUtil.getDateByInitMonth(date);
		String dateByFullMonth = DateUtil.getDateByFullMonth(date);
		System.out.println(dateByInitMonth);
		System.out.println(dateByFullMonth);
		//测试sql
		String sql="select * from t_order where create_time>='"+dateByInitMonth+"' and create_time<='"+dateByFullMonth+"'";
		System.out.println(sql);
	}

}
