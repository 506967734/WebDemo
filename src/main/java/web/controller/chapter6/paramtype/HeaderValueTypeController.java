package web.controller.chapter6.paramtype;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 2017/4/29.
 *
 * @RequestHeader 绑定请求头数据
 */
@Controller
@RequestMapping(value = "/method/param/annotation")
public class HeaderValueTypeController {
    @RequestMapping(value = "/headerType")
    public String test(@RequestHeader("User-Agent") String userAgent, @RequestHeader("Accept") String accept) {
        System.out.println(userAgent + "----" + accept);
        return "success";
    }
}
