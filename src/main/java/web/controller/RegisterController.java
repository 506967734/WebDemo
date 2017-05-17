package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.controller.exception.UserDuplicateException;
import web.controller.model.User;
import web.controller.service.IUserService;

/**
 * Created by apple on 2017/5/16.
 */
@Controller
public class RegisterController {
    @Autowired
    private IUserService service;

    @RequestMapping(value = "prepareRegister", method = RequestMethod.GET)
    private String prepareRegister() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Model model, User user) {
        try {
            service.saveWithCheckDuplicate(user);
        } catch (UserDuplicateException e) {
            model.addAttribute("isUserDuplicate", "用户名已被注册");
            return "register";
        }
        return "redirect:/login";
    }


}
