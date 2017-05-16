package web.controller.chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * URI 模板模式映射
 * Created by apple on 2017/4/28.
 * {×××}占位符
 */
@Controller
public class HelloWorldController3 {
    @RequestMapping(value = "/hello/{userId}")
    public ModelAndView hellowWorld() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World3");
        mv.setViewName("hello");
        return mv;
    }
}
