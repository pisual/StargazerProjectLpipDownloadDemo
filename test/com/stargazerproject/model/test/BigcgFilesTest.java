package com.stargazerproject.model.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.stargazerproject.model.BigcgFiles;
import com.stargazerproject.model.FilesType;
import com.stargazerproject.model.I18NParameter;
import com.stargazerproject.model.SystemParameter;

@SuppressWarnings("unused")
public class BigcgFilesTest {
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	@Test
	public void CreratBigcgFilesTest(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();

		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 1, System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
		//bigcgFiles.download(new Downloader(20000));
		//bigcgFiles.download(new Downloader(20000,"10.0.1.28",8080));
	}
	
	@Test
	public void CreratBigcgFilesTestNameIsNull(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("parameter 参数为空");
		BigcgFiles bigcgFiles = new BigcgFiles(null,FilesType.jpg, 1, System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestNameSizeIsZero(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("parameter 参数长度为0");
		BigcgFiles bigcgFiles = new BigcgFiles("",FilesType.jpg, 1, System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestFilesTypeIsNull(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("parameter 参数为空");
		BigcgFiles bigcgFiles = new BigcgFiles("name",null, 1, System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestFilesSizeIsNull(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("parameter 参数为空");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, null, System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestFilesSizeLessthanZero(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("parameter 参数小于0");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, -1, System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestFilesLocationSizeIsNull(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("parameter 参数为空");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 10,null, "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestLocationSizeIsZero(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("parameter 参数长度为0");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 1, "", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestFilesUrlIsNull(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("parameter 参数为空");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 10,System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", null, "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestFilesUrlSizeIsZero(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("parameter 参数长度为0");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 10,System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "", "c8de39c66b29889421d17828fb5970cf", 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestFilesMd5IsNull(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("parameter 参数为空");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 10,System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", null, 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestFilesMd5SizeIsZero(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("parameter 参数长度为0");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 10,System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "", 2034, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestIdIsNull(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("parameter 参数为空");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 1, System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", null, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestIDLessthanZero(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("parameter 参数小于0");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 10, System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", -1, "tags");
	}
	
	@Test
	public void CreratBigcgFilesTestTagsIsNull(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("parameter 参数为空");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 1, System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, null);
	}
	
	@Test
	public void CreratBigcgFilesTestTagsSizeIsZero(){
		SystemParameter.getInstance();
		I18NParameter.getInstance();
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("parameter 参数长度为0");
		BigcgFiles bigcgFiles = new BigcgFiles("name",FilesType.jpg, 1, System.getProperty("user.dir")+"/StargazerUIAssaultLily/DownLoadFile/1604132.jpg", "http://www.hacg.li/wp/wp-content/uploads/2016/04/160413.jpg", "c8de39c66b29889421d17828fb5970cf", 2034, "");
	}
	
}
