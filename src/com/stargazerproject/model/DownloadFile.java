package com.stargazerproject.model;

import java.io.Serializable;

import com.stargazerproject.download.DownloadHanding;
import com.stargazerproject.util.ParameterCalibration;

public class DownloadFile extends Files implements Serializable{
	private static final long serialVersionUID = -2384103078655087776L;
	
	/**文件来源地址**/
	protected String url;
	/**是否下载完成**/
	protected boolean downComplete;
	/**MD5**/
	protected String md5;
	
	public DownloadFile(String name, FilesType filesType, Integer size, String location,String url,String md5) {
		super(name, filesType, size, location);
		ParameterCalibration.basicParameterCalibration(url,md5);
		this.url = url;
		this.md5 = md5;
		this.downComplete = Boolean.FALSE;
	}
	
	public DownloadFile(Files files,String url,String md5) {
		super(files.name, files.filesType, files.size, files.location);     
		ParameterCalibration.basicParameterCalibration(url,md5);
		this.url = url;
		this.md5 = md5;
		this.downComplete = Boolean.FALSE;
	}
	
	public void downLoadFile(){
		if(Boolean.TRUE.equals(DownloadHanding.downloadFileAndCheckMd5(url, name + filesType, md5))){
			downComplete = Boolean.TRUE;
		}
	}
	
	@Override
	public Files clone() throws CloneNotSupportedException {
		return new DownloadFile(name, filesType, size, location, url, md5);
	}
	
	@Override
	public String toString() {
		return name+":"+filesType+":"+size+":"+location+":"+url+":"+md5+":"+downComplete+"";
	}
}
