package web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by apple on 2017/4/12.
 * 缓存5秒，cacheSeconds=5
 */
public class HelloWorldCacheController extends AbstractController {
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //点击后再次请求当前页面
        httpServletResponse.getWriter().write("<a href=''>this</a>");
        return null;
    }
}
