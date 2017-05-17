package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import web.controller.model.User;
import web.controller.service.IUserService;

import java.util.HashMap;
import java.util.Map;

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

    @ResponseBody
    @RequestMapping(value = "/toJson", method = RequestMethod.POST)
    public Map<String, Object> toJson(User user) throws Exception {
        service.addUser(user); //一起测试了
        Map map = new HashMap();
        User user1 = service.findUserById(2);
        System.out.println(user1.getUsername());
        map.put("user", user1);
        map.put("status", 1);
        map.put("success", true);
        return map;
    }
}
