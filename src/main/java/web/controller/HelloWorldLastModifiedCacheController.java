package web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by apple on 2017/4/12.
 * Spring判断是否过期，通过如下代码，即请求的“If-Modified-Since” 大于等于当前的getLastModified方法的时间戳，则认为没有修改：
 * this.notModified = (ifModifiedSince >= (lastModifiedTimestamp / 1000 * 1000));
 */
public class HelloWorldLastModifiedCacheController extends AbstractController implements LastModified {
    private long lastModified;

    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //点击后再次请求当前页面
        httpServletResponse.getWriter().write("<a href=''>this</a>");
        return null;
    }

    public long getLastModified(HttpServletRequest httpServletRequest) {
        if (lastModified == 0L) {
            //TODO 此处更新的条件：如果内容有更新，应该重新返回内容最新修改的时间戳
            lastModified = System.currentTimeMillis();
        }
        return lastModified;
    }
}
