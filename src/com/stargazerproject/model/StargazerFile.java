package com.stargazerproject.model;

import java.io.File;

import org.apache.log4j.Logger;

import com.stargazerproject.exception.StargazerFileException;

/**
 * @author Felixerio
 * Stargazer 包装File类型
 * @version 1.0.0.0
 * **/
public class StargazerFile{
	
	/** 日志初始化 **/
	static Logger logger = Logger.getLogger(DownloadFile.class.getName());
	private File file;
	/**用于判断最终是否正常生成**/
	private boolean createSuccessState = Boolean.FALSE;
	
	
	
	/**读取文件
	 * @throws StargazerFileException **/
	public StargazerFile readStargazerFile(String fileName) {
		if(null==fileName||fileName.trim().length()==0){
				try {
					throw new StargazerFileException("FileNameIsNull");
				} catch (StargazerFileException e) {
					logger.error(e.getMessage());
				}
		}
		else{
			file = new File(fileName);
			if(file.isDirectory()){
					try {
						throw new StargazerFileException("isDirectory");
					} catch (StargazerFileException e) {
						logger.error(e.getMessage());
					}
			}
			else{
				if(Boolean.FALSE.equals(file.exists())){
						try {
							throw new StargazerFileException("CouldNotFindFile");
						} catch (StargazerFileException e) {
							logger.error(e.getMessage());
						}
				}
				else{
					this.createSuccessState = Boolean.TRUE;
				}
			}
		} 
		return this;
	}
	
	/**创建文件
	 * @throws StargazerFileException **/
	public StargazerFile creatStargazerFile(String fileName) {
		if(null==fileName||fileName.trim().length()==0){
				try {
					throw new StargazerFileException("FileNameIsNull");
				} catch (StargazerFileException e) {
					logger.error(e.getMessage());
				}
		}
		else{
			file = new File(fileName);
			if(file.isDirectory()){
					try {
						throw new StargazerFileException("isDirectory");
					} catch (StargazerFileException e) {
						logger.error(e.getMessage());
					}
			}
			else{
				this.createSuccessState = Boolean.TRUE;
			}
		}
		return this;
	}
	
	public boolean isCreateSuccessState() {
		return createSuccessState;
		}
	
	public File getFile() {
		return file;
		}
}
