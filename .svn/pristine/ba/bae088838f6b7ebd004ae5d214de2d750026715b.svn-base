package com.stargazerproject.model;

import java.io.Serializable;

import com.stargazerproject.model.shared.Entity;
import com.stargazerproject.util.ParameterCalibration;

public class Files implements Entity<Files>,Serializable{
	private static final long serialVersionUID = 4926169457256038378L;
	
	protected String name;
	protected FilesType filesType;
	protected Integer size;
	protected String location;
	
	public Files(String name,FilesType filesType,Integer size,String location) {
		ParameterCalibration.basicParameterCalibration(name,filesType,size,location);
		this.name = name;
		this.filesType = filesType;
		this.size = size;
		this.location = location;
	}
	
	@Override
	public Files clone() throws CloneNotSupportedException {
		return new Files(name,filesType,size,location);
	}
	
	@Override
	public boolean sameIdentityAs(Files other) {
		if(name.endsWith(other.name)&&filesType.equals(other.filesType)&&size.equals(other.size)&&location.equals(other.location)){
			return Boolean.TRUE;
		}
		else{
			return Boolean.FALSE;
		}
	}
	
	@Override
	public String toString() {
		return name+":"+filesType+":"+size+":"+location;
	}
}
