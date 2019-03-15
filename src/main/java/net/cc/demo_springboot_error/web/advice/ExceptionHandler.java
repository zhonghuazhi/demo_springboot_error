package net.cc.demo_springboot_error.web.advice;

import net.cc.demo_springboot_error.domain.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @classname ExceptionHandler
 * @author: zhonghua.zhi
 * @date: 2019-03-15 15:16
 * @version: 1.0
 * @description: TODO
 */
@ControllerAdvice
public class ExceptionHandler {


    /**
     * 功能描述:
     * 当异常为 Eception 时 就可以使用此函数进行拦截并处理
     *
     * @param httpServletRequest
     * @param exception
     * @return: net.cc.demo_springboot_error.domain.ErrorInfo
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-03-15 15:25
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo procException(HttpServletRequest httpServletRequest, Exception exception) {

        ErrorInfo errorInfo = new ErrorInfo();

        errorInfo.setCode("1001");
        errorInfo.setMessage(exception.getMessage());
        errorInfo.setUrl(httpServletRequest.getRequestURL().toString());

        return errorInfo;
    }
}