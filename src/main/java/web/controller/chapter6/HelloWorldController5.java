package web.controller.chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 正则表达式风格的 URL 路径映射
 * Created by apple on 2017/4/28.
 * @RequestMapping(value="/products/{categoryCode:\\d+}-{pageNumber:\\d+}") : 可 以 匹 配 “/products/123-1”，但不能匹配“/products/abc-1”，这样可以设计更加严格的规则。
 */
@Controller
public class HelloWorldController5 {
    @RequestMapping(value = "/user/{userId:\\d+}-{userCode:\\d+}")
    public ModelAndView hellowWorld() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World5");
        mv.setViewName("hello");
        return mv;
    }
}
