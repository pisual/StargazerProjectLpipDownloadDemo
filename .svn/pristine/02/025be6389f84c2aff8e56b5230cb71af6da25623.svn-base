package com.stargazerproject.util;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import com.stargazerproject.exception.StargazerFileException;
import com.stargazerproject.model.StargazerFile;

/** 
 * 计算文件的MD5 
 */  
public class FileMD5 {  
	/** 日志初始化 **/
	static Logger logger = Logger.getLogger(FileMD5.class.getName());
 
    public static String getFileMD5String(String fileName){
       	 FileInputStream fileInputStream = null;
         String md5 = "MD5Result";
		try {
			StargazerFile stargazerFile = new StargazerFile().creatStargazerFile(fileName);
			if(Boolean.TRUE.equals(stargazerFile.isCreateSuccessState())){
				fileInputStream = new FileInputStream(stargazerFile.getFile());
				md5 = DigestUtils.md5Hex(IOUtils.toByteArray(fileInputStream));
				IOUtils.closeQuietly(fileInputStream);    	
			}
			else{
				try {
					throw new StargazerFileException(fileName+"文件创建失败");
				} catch (StargazerFileException e) {
					logger.error(e.getMessage());
				}
			}
		} catch (IOException e) {
			logger.error(e.getMessage());
		} finally{
			if(null != fileInputStream){
				try {
					fileInputStream.close();
				} catch (IOException e) {
					logger.error(e.getMessage());
				}
			}
		}
         return md5;  
    }  
}  