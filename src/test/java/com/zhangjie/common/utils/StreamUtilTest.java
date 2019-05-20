package com.zhangjie.common.utils;

import java.io.File;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testReadTextFileFile() {
		///传入读取的文件
		File srcFile=new File("C:\\Users\\DOMER、\\Desktop\\week2.txt");
		StreamUtil.readTextFile(srcFile);
	}

}
