package web.controller.chapter6.request;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 此种方式相对使用@RequestMapping 的“headers = "Content-Type=application/json"”更能表明你的目的
 */
@Controller
public class ConsumesController {

    //Content-Type 请求的内容类型
    @RequestMapping(value = "/request/consumes", consumes = {"application/json"})
    public String test(HttpServletRequest request) throws IOException {
        //表示请求的内容区数据为json数据
        InputStream is = request.getInputStream();
        byte bytes[] = new byte[request.getContentLength()];
        is.read(bytes);
        //得到请求中的内容区数据（以CharacterEncoding解码）
        //此处得到数据后你可以通过如json-lib转换为其他对象
        String jsonStr = new String(bytes, request.getCharacterEncoding());
        System.out.println("json data：" + jsonStr);
        return "success";
    }


}
