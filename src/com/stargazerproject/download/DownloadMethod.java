package com.stargazerproject.download;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;

import com.stargazerproject.log.CoreLogManaged;
import com.stargazerproject.model.StargazerFile;

/**
 * 下载方法
 * **/
public class DownloadMethod {
	private HttpClient httpClient;
	
	public DownloadMethod(String proxyServerIP, Integer proxyServerPort, Integer timeoutTime) {
		httpClient = new DefaultHttpClient();
		HttpsConnectionProcessing.enableSSL(httpClient);
	    HttpHost proxy = new HttpHost(proxyServerIP,proxyServerPort, null);
	    httpClient.getParams().setParameter(ConnRouteParams.DEFAULT_PROXY, proxy);
  		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, timeoutTime);
		httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, timeoutTime);
	}
	
	public DownloadMethod(Integer timeoutTime) {
		httpClient = new DefaultHttpClient();
		HttpsConnectionProcessing.enableSSL(httpClient);
  		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, timeoutTime);
		httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, timeoutTime);
	}

	/** 基本下载方法 **/
	public Boolean normalDownLoadFileMethod(String url, String targetFile) {
		FileOutputStream output = null;
		InputStream input = null;
		try {
			HttpResponse response = httpClient.execute(new HttpGet(url));
			if (HttpStatus.SC_OK == response.getStatusLine().getStatusCode()) {
				StargazerFile storeFile = new StargazerFile().creatStargazerFile(targetFile);
				if(Boolean.TRUE.equals(storeFile.isCreateSuccessState())){
					output = new FileOutputStream(storeFile.getFile());
					input = response.getEntity().getContent();
					byte b[] = new byte[1024];
					int j = 0;
					while ((j = input.read(b)) != -1) {
						output.write(b, 0, j);
					}
					return Boolean.TRUE;
				}
			}
			else{
				CoreLogManaged.ERROR(this, "Address_of_the_remote_connection", url);
			}
		} catch (IOException e) {
			CoreLogManaged.ERROR(this, e.getMessage());
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
					CoreLogManaged.ERROR(this, e1.getMessage());
				}
			}
		return Boolean.FALSE;
	}
}
