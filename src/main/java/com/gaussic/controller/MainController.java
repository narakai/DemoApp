package com.gaussic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by leon on 16/4/13.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        //处理完该请求后返回的页面，此请求返回 index.jsp页面
        return "index";
    }

    //关于controller如何找到视图文件，这里需要详细的说明。在 controller 的一个方法中，返回的字符串定义了所需访问的jsp的名字（如上面的index）。
    // 在jspViewResolver中，有两个属性，一个是prefix，定义了所需访问的文件路径前缀，另一是suffix，表示要访问的文件的后缀，这里为 .jsp。
    // 那么，如果返回字符串是 xxx ，SpringMVC就会找到 /WEB-INF/pages/xxx.jsp 文件。

}
