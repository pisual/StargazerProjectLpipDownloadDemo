package com.stargazerproject.parameter;

import java.lang.reflect.Field;

import org.apache.log4j.Logger;


/**
 *初始化参数配置，提供多种读取参数方式
 *使用方法：
 * InitializationParameterList initializationParameterList = new InitializationParameterList();
 * initializationParameterList.InitializationParameterFormPackageInfoToMemory("com.stargazerproject.ui.parameter.StargazerProjectParameter");
 *
 *@Web https://github.com/pisual http://www.pisual.com
 *@email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 *@author Felixerio FelixSion
 * **/
public class InitializationParameterList {
	/** 日志初始化 **/
	static Logger logger = Logger.getLogger(InitializationParameterList.class.getName());
	
	/**
	 * 读取package-info中的参数并存储在系统内存中，通过System.setProperties来实现
	 * @param String packageInfoPath 指定参数初始化package-info.java的位置
	 * **/
	public void InitializationParameterFormPackageInfoToMemory(String packageInfoPath){
		Field[] valueField = GetParamentByReflectFromPackageInfo.getParamentByReflectFromPackageInfo(packageInfoPath);
		int filedLenght = valueField.length;
		 for (int j = 0; j < filedLenght; j++) {
			 try {
				 if(ValidationStringParament.validationStringParament(valueField[j].getName())==Boolean.TRUE && 
				    ValidationStringParament.validationStringParament(valueField[j].get(valueField[j].getName()).toString())==Boolean.TRUE)
				 {
					 System.setProperty(valueField[j].getName(), valueField[j].get(valueField[j].getName()).toString());
				 }
			 } catch (IllegalArgumentException e) {
				logger.error("输入参数类型不合法");
		     } catch (IllegalAccessException e) {
		    	    logger.error("目标类没有访问权限");
			}
		 }
	}
	
}
