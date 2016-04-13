package com.stargazerproject.download;

import java.security.KeyManagementException; 
import java.security.NoSuchAlgorithmException; 
import java.security.cert.CertificateException; 
import java.security.cert.X509Certificate; 

import javax.net.ssl.SSLContext; 
import javax.net.ssl.TrustManager; 
import javax.net.ssl.X509TrustManager; 

import org.apache.http.client.HttpClient; 
import org.apache.http.conn.scheme.Scheme; 
import org.apache.http.conn.ssl.SSLSocketFactory; 

import com.stargazerproject.exception.ExceptionDispose;

/**
 * 针对Https资源的特殊处理
 * **/
public class HttpClientSendPost {
	
    private static TrustManager truseAllManager = new X509TrustManager() {  
        @Override  
        public X509Certificate[] getAcceptedIssuers() {  
            return null;  
        }  
        @Override  
        public void checkServerTrusted(X509Certificate[] chain, String authType)  
                throws CertificateException {  
        }  
        @Override  
        public void checkClientTrusted(X509Certificate[] chain, String authType)  
                throws CertificateException {  
        }  
    };  
      
    @SuppressWarnings("deprecation")
	public static void enableSSL(HttpClient httpClient) {  
        try {  
            SSLContext sslcontext = SSLContext.getInstance("TLS");  
            sslcontext.init(null, new TrustManager[] { truseAllManager }, null);  
            SSLSocketFactory sf = new SSLSocketFactory(sslcontext);  
            sf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);  
			Scheme https = new Scheme("https", sf, 443);  
            httpClient.getConnectionManager().getSchemeRegistry().register(https);  
        } catch (KeyManagementException e) {  
        	ExceptionDispose.catchExceptionAndSaveToDatabase(e.getMessage());
        } catch (NoSuchAlgorithmException e) {  
          	ExceptionDispose.catchExceptionAndSaveToDatabase(e.getMessage());
        }  
    }  
}
