package net.cc.demo_springboot_error.domain;

/**
 * @classname ErrorInfo
 * @author: zhonghua.zhi
 * @date: 2019-03-15 11:57
 * @version: 1.0
 * @description: TODO
 */
public class ErrorInfo {

    private String code;

    private String message;

    private String url;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}