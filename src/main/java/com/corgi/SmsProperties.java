package com.corgi;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author YUDI-Corgi
 * @description SMS 参数注入
 */
@ConfigurationProperties(prefix = "sms")
public class SmsProperties {

    /**
     * 是否启用 SMS 服务
     */
    private Boolean enabled = Boolean.FALSE;
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
    private String keySecret;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public String getKeySecret() {
        return keySecret;
    }

    public void setKeySecret(String keySecret) {
        this.keySecret = keySecret;
    }
}
