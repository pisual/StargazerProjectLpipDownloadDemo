package com.stargazerproject.model.test;

import org.junit.Test;

import com.stargazerproject.model.BigcgFiles;
import com.stargazerproject.model.FilesType;
import com.stargazerproject.parameter.InitializationParameterList;

public class BigcgFilesTest {
	
	@Test
	public void CreratBigcgFilesTest(){
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 1, "location", "url", "md5", 2034, "tags");
		//System.out.println(bigcgFiles.toString());
	}
	
	@Test
	public void DownLoadSuccessTest(){

		InitializationParameterList initializationParameterListnew = new InitializationParameterList();
		initializationParameterListnew.InitializationParameterFormPackageInfoToMemory("com.stargazerproject.parameter.StargazerProjectParameter");
		BigcgFiles bigcgFiles = new BigcgFiles("160413",FilesType.jpg, 10, "location", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
		//System.out.println(bigcgFiles.toString());
		bigcgFiles.downLoadFile();
		//System.out.println(bigcgFiles.toString());
	}
}
