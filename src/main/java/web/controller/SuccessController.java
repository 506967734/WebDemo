package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 2017/4/28.
 */
@Controller
@RequestMapping("customers/**")
public class SuccessController {
    @RequestMapping(value = "/success")
    public String success() {
        return "success";
    }
}
