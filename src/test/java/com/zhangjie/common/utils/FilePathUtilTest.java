package com.zhangjie.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FilePathUtilTest {

	/**
	 * 系统虚拟路径
	 */
	@Test
	public void testGetTempDirectory() {
		String directory = FilePathUtil.getTempDirectory();
		System.out.println(directory);
	}

	/**
	 * 系统登录用户
	 */
	@Test
	public void testGetUserDirectory() {
		String user=FilePathUtil.getUserDirectory();
		System.out.println(user);
	}

	/**
	 * 返回文件后缀
	 */
	@Test
	public void testGetExtendName() {
		String fileName="week2.txt";
		String name = FilePathUtil.getExtendName(fileName);
		System.out.println(name);

	}

}
