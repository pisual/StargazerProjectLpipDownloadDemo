package com.stargazerproject.download;

import org.apache.log4j.Logger;

import com.stargazerproject.parameter.GetParamentByName;
import com.stargazerproject.util.FileMD5;

public class DownloadHanding {
	/** 日志初始化 **/
	static Logger logger = Logger.getLogger(DownloadHanding.class.getName());
	/**保存下载文件的地址**/
	private static final String DOWNLOAD_FILE_PATH = GetParamentByName.GetParamentByKeyInSystemMemory("DOWNLOAD_FILE_PATH");
	
	public static Boolean downloadFileAndCheckMd5(String url, String targetFile, String originalMd5){
		targetFile = DOWNLOAD_FILE_PATH +targetFile;
		if(Boolean.TRUE.equals(DownloadMethod.normalDownLoadFileMethod(url, targetFile))){
			if(originalMd5.equals(FileMD5.getFileMD5String(targetFile))){
				logger.info(targetFile + "文件下载完成 校验通过");
				return Boolean.TRUE;
			}
			else{
				logger.error(targetFile + "文件下载完成 校验失败");
			}
		}
		else{
			logger.error(targetFile + "文件下载失败");
		}
		return Boolean.FALSE;
	}
}
