package com.zhangjie.common.utils;

import java.io.File;

public class FilePathUtil {
	/**
	 * 获取本机操作系统临时目录
	 * @return
	 */
	public static String  getTempDirectory(){
		String property = System.getProperty("java.io.tempdir");
		return property;
		}
	/**
	 * 输出本机操作系统当前登录用户目录
	 * @return
	 */
	public static String  getUserDirectory(){
		String property = System.getProperty("user.home");
		return property;
	}
	/**
	 * ：给定一个文件名，返回该文件名的扩展名
	 * @param fileName
	 * @return
	 */
	public static String    getExtendName(String fileName){
		String property = System.getProperty(fileName);
		return property;
		
		
		
	}
}
