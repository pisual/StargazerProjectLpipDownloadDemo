package com.stargazerproject.parameter;

/**
 * StargazerProject UI 核心参数配置
 * 
 * @Web https://github.com/pisual http://www.pisual.com
 * @email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 * @author Felixerio FelixSion
 */
class StargazerProjectParameter {
	
	/**全局根路径**/
	public static final String BasePath = System.getProperty("user.dir") + "/StargazerUIAssaultLily/";
	
	/**I18N全局语言配置**/
	public static final String I18N = "CHINA";
	/**I18配置文件路径**/
	public static final String I18N_PROPERTIES_FILE_PATH = "com.stargazerproject.parameter.StargazerI18N";

	/**保存下载文件的地址**/
	public static final String DOWNLOAD_FILE_PATH = BasePath + "DownLoadFile/";
	/**代理服务器的IP**/
	public static final String PROXY_SERVER_IP = "10.0.1.11";
	/**代理服务器的端口**/
	public static final String PROXY_SERVER_PORT = "808";
	/**连接超时等待时间 毫秒**/
	public static final String CONNECTION_TIMEOUT_PERIOD = "20000";
	
}
