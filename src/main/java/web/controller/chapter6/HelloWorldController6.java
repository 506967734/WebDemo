package web.controller.chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 组合使用是“或”的关系
 * Created by apple on 2017/4/28.
 * @RequestMapping(value={"/test1", "/user/create"}) 组合使用是或的关系，即“/test1”或“/user/create”请求 URL 路径都可以映射到@RequestMapping 指定的功能处理方法。
 */
@Controller
public class HelloWorldController6 {
    @RequestMapping(value = {"/test1","/user/test1"})
    public ModelAndView hellowWorld() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World6");
        mv.setViewName("hello");
        return mv;
    }
}
