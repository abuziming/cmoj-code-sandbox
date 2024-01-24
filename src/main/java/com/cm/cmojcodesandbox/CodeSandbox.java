package com.cm.cmojcodesandbox;

import com.cm.cmojcodesandbox.model.ExecuteCodeRequest;
import com.cm.cmojcodesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码逻辑
     * @param executeCodeRequest
     * @return
     */
        ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
