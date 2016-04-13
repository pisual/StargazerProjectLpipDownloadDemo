package com.stargazerproject.download;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;

import com.stargazerproject.parameter.GetParamentByName;

/**
 * 下载包装HttpClient
 * **/
public class DownloadFileHttpResponse {
	
	/**是否启用代理连接模式**/
	private static final String ENABLE_PROXY_CONNECTION = GetParamentByName.GetParamentByKeyInSystemMemory("ENABLE_PROXY_CONNECTION");
	/**代理服务器的IP**/
	private static final String PROXY_SERVER_IP = GetParamentByName.GetParamentByKeyInSystemMemory("PROXY_SERVER_IP");
	/**代理服务器的端口**/
	private static final Integer PROXY_SERVER_PORT = GetParamentByName.GetParamentByKeyInSystemMemoryTransformInt("PROXY_SERVER_PORT");
	/**连接超时等待时间 毫秒**/
	private static final Integer CONNECTION_TIMEOUT_PERIOD = GetParamentByName.GetParamentByKeyInSystemMemoryTransformInt("CONNECTION_TIMEOUT_PERIOD");


	public static HttpResponse getDownloadFileHttpClient(String url) throws ClientProtocolException, IOException{
		HttpClient httpClient = new DefaultHttpClient();
		HttpClientSendPost.enableSSL(httpClient);
		if(ENABLE_PROXY_CONNECTION.equals("true")){
			HttpHost proxy = new HttpHost(PROXY_SERVER_IP,PROXY_SERVER_PORT, null);
			httpClient.getParams().setParameter(ConnRouteParams.DEFAULT_PROXY, proxy);
		}
		HttpGet httpGet = new HttpGet(url);
  		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, CONNECTION_TIMEOUT_PERIOD);
		httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, CONNECTION_TIMEOUT_PERIOD);
		HttpResponse response = httpClient.execute(httpGet);
		return response;
	}
}
