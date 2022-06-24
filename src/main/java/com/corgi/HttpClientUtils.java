package com.corgi;

/**
 * @author YUDI-Corgi
 * @description HTTP 操作工具类
 */
public class HttpClientUtils {

    public static int sendSms(String url, String keyId, String keySecret, String msg) {
        // 模拟调用短信发送接口
        System.out.println("Http 请求，url=" + url + "; keyId=" + keyId + "; keySecret=" + keySecret + "; msg=" + msg);
        return 200;
    }

}
