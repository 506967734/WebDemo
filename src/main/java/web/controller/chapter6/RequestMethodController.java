package web.controller.chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by apple on 2017/4/28.
 */
@Controller
@RequestMapping("customers/**")
public class RequestMethodController {
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm() {
        System.out.println("====================Get");
        return "customer/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String submit() {
        System.out.println("====================Post");
        return "redirect:success";
    }
}
