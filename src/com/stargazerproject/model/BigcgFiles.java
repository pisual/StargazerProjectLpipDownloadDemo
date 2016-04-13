package com.stargazerproject.model;

import java.io.Serializable;

import com.stargazerproject.util.ParameterCalibration;

public class BigcgFiles extends DownloadFile implements Serializable{
	private static final long serialVersionUID = 2281458466735870084L;
	
	/**ID**/
	private Integer id;
	/**标签**/
	private String  tags;
	
	public BigcgFiles(String name, FilesType filesType, Integer size, String location, String url, String md5, Integer id, String tags) {
		super(name, filesType, size, location, url, md5);
		ParameterCalibration.basicParameterCalibration(id,tags);
		this.id = id;
		this.tags = tags;
	}
	
	public BigcgFiles(DownloadFile downloadFile,Integer id, String tags) {
		super(downloadFile.name, downloadFile.filesType, downloadFile.size, downloadFile.location, downloadFile.url, downloadFile.md5);
		ParameterCalibration.basicParameterCalibration(id,tags);
		this.id = id;
		this.tags = tags;
	}
	
	public void save(){
		
	}
	
	@Override
	public Files clone() throws CloneNotSupportedException {
		return new BigcgFiles(name, filesType, size, location, url, md5, id, tags);
	}
	
	@Override
	public String toString() {
		return name+":"+filesType+":"+size+":"+location+":"+url+":"+md5+":"+downComplete+":"+id+":"+tags+"";
	}
}
