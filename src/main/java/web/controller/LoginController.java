package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.controller.model.User;
import web.controller.service.IUserService;

/**
 * Created by apple on 2017/5/14.
 */
@Controller
public class LoginController {

    @Autowired
    private IUserService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/toJson", method = RequestMethod.POST)
    public String toJson(Model model, User user) throws Exception {
        try {
            User u = service.login(user);
            return "index";
        } catch (Exception e) {
            model.addAttribute("loginError", "用户名或密码错误");
            return "login";
        }
//        service.addUser(user); //一起测试了
//        Map map = new HashMap();
//        User user1 = service.findUserById(2);
//        System.out.println(user1.getUsername());
//        map.put("user", user1);
//        map.put("status", 1);
//        map.put("success", true);
    }
}
