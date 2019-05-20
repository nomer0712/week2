package com.zhangjie.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 获取Calendar工具
	 * @param date
	 * @return
	 */
	public static Calendar getCalendar(String date) {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = Calendar.getInstance();
		if (null!=date && date.length()>0) {
			try {
				Date date2 = df.parse(date);
				//获取时间
				c1.setTime(date2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return c1;
	}
	//获取开始时间
	public static String getDateByInitMonth(String date) {
		SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = getCalendar(date);
		//设置日期为当月一号
		c1.set(Calendar.DAY_OF_MONTH, 1);
		Date time = c1.getTime();
		return df.format(time);
	}
	
	public static String getDateByFullMonth(String date) {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1=getCalendar(date);
		//设置当前月+1
		c1.add(Calendar.MONTH, 1);
		//设置日期为上月最后一天
		c1.set(Calendar.DAY_OF_MONTH, 0);
		Date time = c1.getTime();
		return df.format(time);
	}
	
}
