package com.corgi;

/**
 * @author YUDI-Corgi
 * @description 消息服务类，进行短信发送
 */
public class SmsService {

    /**
     * 访问发送短信的 url
     */
    private String url;
    /**
     * 短信服务商提供的请求 keyId
     */
    private String keyId;
    /**
     * 短信服务商提供的 keySecret
     */
    private String aKeySecret;

    public SmsService(String url, String keyId, String aKeySecret) {
        this.url = url;
        this.keyId = keyId;
        this.aKeySecret = aKeySecret;
    }

    /**
     * 模拟发送短信
     * @return 发送结果
     */
    public int sendSms(String msg) {
        return HttpClientUtils.sendSms(url, keyId, aKeySecret, msg);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getaKeySecret() {
        return aKeySecret;
    }

    public void setaKeySecret(String aKeySecret) {
        this.aKeySecret = aKeySecret;
    }
}
