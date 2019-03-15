# demo_springboot_error
全局统一异常处理

### 处理全局Rest请求对应异常（JSON返回）
1. 新增注解类
```
@ControllerAdvice
public class XXXXXXXHandler
```

2. 新增注解函数
```
@ExceptionHandler(value = Exception.class)
@ResponseBody
public ErrorInfo execException(HttpServletRequest req , Exception e)
```