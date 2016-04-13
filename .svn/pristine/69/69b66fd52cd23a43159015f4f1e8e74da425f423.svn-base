package com.stargazerproject.download;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;

import com.stargazerproject.model.StargazerFile;

/**
 * 下载方法
 * **/
public class DownloadMethod {
	
	/** 日志初始化 **/
	static Logger logger = Logger.getLogger(DownloadMethod.class.getName());

	/** 基本下载方法 **/
	public static Boolean normalDownLoadFileMethod(String url, String targetFile) {
		FileOutputStream output = null;
		InputStream input = null;
		Boolean result = Boolean.FALSE;
		try {
			HttpResponse response = DownloadFileHttpResponse.getDownloadFileHttpClient(url);
			if (HttpStatus.SC_OK == response.getStatusLine().getStatusCode()) {
				HttpEntity entity = response.getEntity();
				StargazerFile storeFile = new StargazerFile().creatStargazerFile(targetFile);
				if(Boolean.TRUE.equals(storeFile.isCreateSuccessState())){
					output = new FileOutputStream(storeFile.getFile());
					input = entity.getContent();
					byte b[] = new byte[1024];
					int j = 0;
					while ((j = input.read(b)) != -1) {
						output.write(b, 0, j);
					}
					result = Boolean.TRUE;
				}
			}
			else{
				logger.error(url+"远程地址连接失败");
			}
		} catch (IOException e) {
			logger.error(e.getMessage());
			}finally {
				try {
					if (output != null) {
						output.flush();
						output.close();
					}
					if (input != null) {
						input.close();
					}
				} catch (IOException e1) {
					logger.error(e1.getMessage());
				}
			}
		return result;
	}
}
