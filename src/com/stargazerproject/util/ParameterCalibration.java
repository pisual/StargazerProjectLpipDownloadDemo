package com.stargazerproject.util;

/**
 * 参数校验
 * **/
public class ParameterCalibration {
	/**基本参数校验 提供不定长参数统一校验
	 * 将自动判断参数类型进行特定性的校验
	 *   @针对字符串校验规则:
	 * 1，非NULL
	 * 2，长度大于0
	 *   @针对Integer（提供正整数校验）
	 * 1，非NULL
	 * 2，大于等于0
	 *   @针对其他未自定类型
	 *    1，非NULL
	 * 
	 * **/
	public static void basicParameterCalibration(Object... parameters){
		  for (Object parameter : parameters) {
			  if(parameter instanceof String){
				  checkForNull(parameter);
				  checkForEmpty((String)parameter);
			  }
			  if(parameter instanceof Integer){
				  checkForNull(parameter);
				  positiveIntegerDetection((Integer)parameter);
			  }
			  else{
				  checkForNull(parameter);
			  }
	        }  
	}
	
	private static void checkForNull(Object parameter)
	{
		if (parameter == null){
			throw new NullPointerException("parameter"+"参数为空");
		}
	}
	
	private static void checkForEmpty(String parameter)
	{
		if (parameter.length() == 0){
			throw new IllegalArgumentException(parameter.toString()+"参数长度为0");
		}
	}
	
	private static void positiveIntegerDetection(Integer parameter){
		if(parameter<0){
			throw new IllegalArgumentException(parameter.toString()+"参数小于0");
		}
	}
	
}
