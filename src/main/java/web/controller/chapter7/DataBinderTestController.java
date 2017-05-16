package web.controller.chapter7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 2017/5/2.
 */
@Controller
public class DataBinderTestController {
    @RequestMapping(value = "/dataBind")
    public String test(DataBinderTestModel command, Model model) {
        //输出command对象看看是否绑定成功
        System.out.println(command);
        model.addAttribute("dataBinderTest", command);
        return "bind/success";

    }
}
