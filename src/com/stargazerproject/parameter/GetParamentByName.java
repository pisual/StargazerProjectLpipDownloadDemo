package com.stargazerproject.parameter;

import org.apache.log4j.Logger;



/**
 * 根据Key获取指定Value
 * 
 *@Web https://github.com/pisual http://www.pisual.com
 *@email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 *@author Felixerio FelixSion
 */
public class GetParamentByName {
	
	/** 日志初始化 **/
	static Logger logger = Logger.getLogger(GetParamentByName.class.getName());
	
	/** 根据指定名称获取String类型结果 **/
	public static String GetParamentByKeyInSystemMemory(String key){
		String value = System.getProperty(key);
		if(null == value){
			value = "Get Value Is Null";
			logger.error("获取系统参数值 "+key+" 失败，系统参数值为空");
			throw new NullPointerException("获取系统参数 "+key+" 失败，系统参数为空");
		}
		return value;
	}
	
	/** 根据指定名称获取颜色数组，返回为一个三色RGB数组，如果没有初使参数，返回一个初始化RGB #000000 **/
	public static int[] GetParamentByKeyInSystemMemoryTransformArray(String key){
		int integerResult[] = new int[]{0,0,0};
		String stringResulr[] = GetParamentByKeyInSystemMemory(key).trim().split(",");
		if(stringResulr.length == 3){
			for(int i=0;i<stringResulr.length;i++){
				integerResult[i] = Integer.parseInt(stringResulr[i]);
			}
		}
		else{
		     	logger.error("传入参数不合法 不满足RGB的三位数组形式");
				throw new IllegalArgumentException("传入参数不合法 不满足RGB的三位数组形式");
		}
		return integerResult;
	}
	
	/** 根据指定名称获取数组形参数，如果没有初使参数，返回一个初始化数组**/
	public static int[] GetParamentByKeyInSystemMemoryTransformNormallArray(String key){
		int integerResult[];
		String stringResulr[] = GetParamentByKeyInSystemMemory(key).trim().split(",");
		if(stringResulr.length>0){
			integerResult = new int[stringResulr.length];
			for(int i=0;i<stringResulr.length;i++){
				integerResult[i] = Integer.parseInt(stringResulr[i]);
			}
		}
		else{
			integerResult = new int[]{1,1,1};
			logger.error("传入参数不合法 不满足数组形似");
			throw new IllegalArgumentException("传入参数不合法 不满足数组形似");
		}
		return integerResult;
	}
	
	/** 根据指定名称获取int形参数，如果没有初使参数，返回一个初始化int**/
	public static int GetParamentByKeyInSystemMemoryTransformInt(String key){
		int intResulr = Integer.parseInt(GetParamentByKeyInSystemMemory(key).trim());
		return intResulr;
	}
}
