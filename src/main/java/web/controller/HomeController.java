package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by apple on 2017/5/17.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String home(Model model, HttpServletRequest request) {
        return "index";

    }
}
