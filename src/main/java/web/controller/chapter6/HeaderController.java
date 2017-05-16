package web.controller.chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 2017/4/28.
 * @RequestMapping(value = "/header1", headers = "abc") 表示请求的URL必须为“/header1”且 请求头中必须有 abc 参数才能匹配
 * @RequestMapping(value="/header1", headers = "!abc") 表示请求的URL必须为“/header/test2” 且 请求头中必须没有 abc 参数才能匹配
 * @RequestMapping(value="/header1", headers = "Content-Type=application/json") 表示请求 的URL必须为“/header/test3”且 请求头中必须有“Content-Type=application/json”参数即可匹配。(将Modify Header 的Content-Type参数值改为“application/json”即可)
 */
@Controller
public class HeaderController {
    //@RequestMapping(value = "/header1", headers = "abc")
    //@RequestMapping(value="/header1", headers = "!abc")
    @RequestMapping(value="/header1", headers = "Content-Type=application/json")
    public String show() {
        System.out.println("=============Show");
        return "hello";
    }

}
