package com.cm.cmojcodesandbox.Controller;

import com.cm.cmojcodesandbox.JavaNativeCodeSandbox;
import com.cm.cmojcodesandbox.model.ExecuteCodeRequest;
import com.cm.cmojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController("/")
public class testController {
    private static final String AUTH_REQUEST_HEADER = "auth";
    private static final String AUTH_REQUEST_SECRET = "secretKey";
    @Resource
    private JavaNativeCodeSandbox javaNativeCodeSandbox;
    @PostMapping("/executeCode")
    public ExecuteCodeResponse executecode(@RequestBody  ExecuteCodeRequest codeRequest, HttpServletRequest request, HttpServletResponse response){
       if(!request.getHeader(AUTH_REQUEST_HEADER).equals(AUTH_REQUEST_SECRET)){
            response.setStatus(403);
            return null;
       }
        System.out.println(javaNativeCodeSandbox.executeCode(codeRequest));
        return  javaNativeCodeSandbox.executeCode(codeRequest);
    }
}
