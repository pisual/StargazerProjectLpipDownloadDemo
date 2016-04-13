package com.stargazerproject.parameter;

import java.lang.reflect.Field;

import org.apache.log4j.Logger;

/**
 * 从package-info.java文件加载参数
 * 
 *@param String packageInfoPath 指定参数初始化package-info.java的位置\
 *@return Field[] 
 *@Web https://github.com/pisual http://www.pisual.com
 *@email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 *@author Felixerio FelixSion
 */
public class GetParamentByReflectFromPackageInfo {
	/** 日志初始化 **/
	static Logger logger = Logger.getLogger(GetParamentByReflectFromPackageInfo.class.getName());
	
	public static Field[] getParamentByReflectFromPackageInfo(String packageInfoPath){
		Field[] valueField = null;
		try {
			valueField = Class.forName(packageInfoPath).getDeclaredFields();
		} catch (ClassNotFoundException e) {
			valueField = new Field[0];
			logger.error("获取参数时,指定的的package-info.java文件不存在，请检查包名是否正确");
		}finally{			
		}
		return valueField;
	}
}
