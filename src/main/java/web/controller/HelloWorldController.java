package web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by apple on 2017/4/10.
 */
//public class HelloWorldController implements Controller {
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        //1、收集参数、验证参数
//        //2、绑定参数到命令对象
//        //3、将命令对象传入业务对象进行业务处理
//        //4、选择下一个页面
//        ModelAndView mv = new ModelAndView();
//        //添加模型数据 可以是任意的POJO对象
//        mv.addObject("message", "Hello World!");
//        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
//        mv.setViewName("hello");
//
//        return mv;
//    }
//}

//public class HelloWorldController extends AbstractController {
//
//    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        //1、收集参数、验证参数
//        //2、绑定参数到命令对象
//        //3、将命令对象传入业务对象进行业务处理
//        //4、选择下一个页面
//        ModelAndView mv = new ModelAndView();
//        //添加模型数据 可以是任意的POJO对象
//        mv.addObject("message", "Hello World!");
//        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
//        mv.setViewName("hello");
//
//        return mv;
////        httpServletResponse.getWriter().write("Hello World!!!!!");
//
////        return null;
//    }
//}
public class HelloWorldController {
    @RequestMapping(value = "/hello")
    public ModelAndView helloWorld() {
        //1、收集参数
        //2、绑定参数到命令对象
        //3、调用业务对象
        //4、选择下一个页面
        ModelAndView mv = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        mv.addObject("message", "Hello World!");
        // 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("hello");
        return mv;
    }

}
