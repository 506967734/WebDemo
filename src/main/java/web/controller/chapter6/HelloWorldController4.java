package web.controller.chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Ant 风格的 URL 路径映射
 * Created by apple on 2017/4/28.
 * @RequestMapping(value="/users/**"):可以匹配“/users/abc/abc”，但“/users/123”将会被【URI模板模式映射中的“/users/{userId}”模式优先映射到】【详见4.14的最长匹配优先】。
 * @RequestMapping(value="/product?"):可匹配“/product1”或“/producta”，但不匹配“/product”或“/productaa”;
 * @RequestMapping(value="/product*"):可匹配“/productabc”或“/product”，但不匹配“/productabc/abc”;
 * @RequestMapping(value="/product/*"):可匹配“/product/abc”，但不匹配“/productabc”;
 * @RequestMapping(value="/product/XXX/{productId}"):可匹配“/products/abc/abc/123”或“/products/123”")
 */
@Controller
public class HelloWorldController4 {
    @RequestMapping(value = "/hello/*")
    public ModelAndView hellowWorld() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World4");
        mv.setViewName("hello");
        return mv;
    }
}
