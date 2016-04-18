package com.stargazerproject.parameter;

import java.lang.reflect.Field;

import com.stargazerproject.log.CoreLogManaged;
import com.stargazerproject.model.SystemParameter;

/**
 * 同过类的顶级参数列表自动从内存中加载参数
 *
 * @Web https://github.com/pisual http://www.pisual.com
 * @email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 * @author Felixerio FelixSion
 * **/
public class LoadingParameterList {
	
	private static SystemParameter systemParameter = SystemParameter.getInstance();
	
	/**
	 * 同过类的顶级参数列表自动从内存中加载参数
	 * 
	 * @param String
	 *            packageInfoPath 指定参数初始化的Object
	 * **/
	public LoadingParameterList(Object object) {
		Field[] valueField = GetParamentByReflect.getParamentByReflectFromCLass(object);
		int filedLenght = valueField.length;
		for (int j = 0; j < filedLenght; j++) {
			valueField[j].setAccessible(Boolean.TRUE);
			try {
				System.out.println(valueField[j].getType().toString());
				switch (valueField[j].getType().toString()) {
				case "class java.lang.String":
					valueField[j].set(object, systemParameter.getString(valueField[j].getName()));
					break;
				case "class java.lang.Integer":
					valueField[j].set(object, systemParameter.getInteger(valueField[j].getName()));
					break;
				default:
					break;
				}
			} catch (IllegalArgumentException e) {
				CoreLogManaged.ERROR(this, e.getMessage());
			} catch (IllegalAccessException e) {
				CoreLogManaged.ERROR(this, e.getMessage());
			}
		}
	}
}
