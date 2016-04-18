package com.stargazerproject.log;

import org.apache.log4j.Logger;

import com.stargazerproject.model.I18NParameter;

/**核心日志托管**/
public final class CoreLogManaged {
	/** 日志初始化 **/
	static Logger logger;
	/** 单例 **/
	private static I18NParameter i8NParameter = I18NParameter.getInstance();
	
	public static void DEBUG(Object object, String i18NMessage, String message){
		logger = Logger.getLogger(object.getClass().getName());
		logger.debug(" Stargazer System Debug Report * "+i8NParameter.getString(i18NMessage)+" : "+message);
	}
	
	public static void DEBUG(Object object, String message){
		logger = Logger.getLogger(object.getClass().getName());
		logger.debug(" Stargazer System Debug Report * "+" : "+message);
	}
	
	public static void INFO(Object object, String i18NMessage, String message){
		logger = Logger.getLogger(object.getClass().getName());
		logger.info(" Stargazer System Debug Report * "+i8NParameter.getString(i18NMessage)+" : "+message);
	}
	
	public static void INFO(Object object, String message){
		logger = Logger.getLogger(object.getClass().getName());
		logger.info(" Stargazer System Debug Report * "+" : "+message);
	}
	
	public static void WARN(Object object, String i18NMessage, String message){
		logger = Logger.getLogger(object.getClass().getName());
		logger.warn(" Stargazer System Debug Report * "+i8NParameter.getString(i18NMessage)+" : "+message);
	}
	
	public static void WARN(Object object, String message){
		logger = Logger.getLogger(object.getClass().getName());
		logger.warn(" Stargazer System Debug Report * "+" : "+message);
	}
	
	public static void ERROR(Object object, String i18NMessage, String message){
		logger = Logger.getLogger(object.getClass().getName());
		logger.error(" Stargazer System Debug Report * "+i8NParameter.getString(i18NMessage)+" : "+message);
	}
	
	public static void ERROR(Object object, String message){
		logger = Logger.getLogger(object.getClass().getName());
		logger.error(" Stargazer System Debug Report * "+" : "+message);
	}
	
	public static void FATAL(Object object, String i18NMessage, String message){
		logger = Logger.getLogger(object.getClass().getName());
		logger.fatal(" Stargazer System Debug Report * "+i8NParameter.getString(i18NMessage)+" : "+message);
	}
	
	public static void FATAL(Object object, String message){
		logger = Logger.getLogger(object.getClass().getName());
		logger.fatal(" Stargazer System Debug Report * "+" : "+message);
	}
}
