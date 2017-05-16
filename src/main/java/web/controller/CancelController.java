package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 2017/4/28.
 */
@Controller
public class CancelController {
    @RequestMapping(value = "/cancel")
    public String success() {
        return "cancel";
    }
}
