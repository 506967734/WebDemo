package web.controller.chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by apple on 2017/4/28.
 * http://localhost:8080/Webapp/user/hello2
 */
@Controller
@RequestMapping(value = "/user")
public class HelloWorldController2 {
    @RequestMapping(value = "/hello2")
    public ModelAndView hellowWorld() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World2");
        mv.setViewName("hello");
        return mv;
    }
}
