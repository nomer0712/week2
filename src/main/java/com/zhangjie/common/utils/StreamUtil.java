package com.zhangjie.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {

	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(FileInputStream f) throws IOException{
	f.close();
	
	}
	
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src) throws IOException{
		InputStream f = null;
		try {
			f = new FileInputStream("week2.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll((FileInputStream) f);
		return null;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容，并且要求内部调用上面第2个方法。* 
	*/
	public static String readTextFile(File srcFile){
		
		if (!srcFile.exists()) {
			System.out.println(srcFile+"不存在！");
		}
		if (srcFile.isDirectory()) {
			System.out.println(srcFile+"不是一个文件！");
		}
		try {
			InputStream in=new FileInputStream(srcFile);
			byte [] b=new byte[2*1024];
			int i = in.read(b);
			if (i>-1) {
				System.out.println(b);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}
}
