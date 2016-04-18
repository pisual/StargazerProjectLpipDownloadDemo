package com.stargazerproject.parameter;

import java.lang.reflect.Field;
import java.util.HashMap;

import com.stargazerproject.log.CoreLogManaged;

/**
 * 从package-info.java文件加载参数
 * 
 *@param String packageInfoPath 指定参数初始化package-info.java的位置\
 *@return Field[] 
 *@Web https://github.com/pisual http://www.pisual.com
 *@email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 *@author Felixerio FelixSion
 */
public class GetParamentByReflect {
	
	public static HashMap<String,String> getParamentByReflectFromPackageInfo(String packageInfoPath) throws IllegalArgumentException, IllegalAccessException{
		Field[] valueField = null;
		HashMap<String, String> value = new HashMap<String,String>();
		try {
			valueField = Class.forName(packageInfoPath).getDeclaredFields();
		} catch (ClassNotFoundException e) {
			valueField = new Field[0];
			CoreLogManaged.ERROR(GetParamentByReflect.class, "Gain_parameter_the_specified_package_info_Java_file_does_not_exist_please_check_whether_the_package_name_is_correct", packageInfoPath);
		}finally{
			int lenght = valueField.length;
			for(int i = 0;i<lenght;i++){
				value.put(valueField[i].getName(), valueField[i].get(valueField[i].getName()).toString());
			}
		}
		return value;
	}
	
	public static Field[] getParamentByReflectFromCLass(Object object){
		Field[] valueField = null;
		valueField = object.getClass().getDeclaredFields();
		return valueField;
	}
}
