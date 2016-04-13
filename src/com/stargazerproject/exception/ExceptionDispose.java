package com.stargazerproject.exception;

/**
 * 核心托管异常处理类
 * 
 *@Web https://github.com/pisual http://www.pisual.com
 *@email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 *@author Felixerio FelixSion
 */
public class ExceptionDispose {
	
	/** 捕获异常并存储在数据库，现在未完成，用于测试使用**/
	public static void catchExceptionAndSaveToDatabase(String Messgae){
		System.out.println("StargazerSystem Error Report : "+Messgae);
		System.out.println();
	}
}