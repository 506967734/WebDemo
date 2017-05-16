package web.controller.chapter6.paramtype;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.controller.model.UserModel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by apple on 2017/4/29.
 */
@Controller
@RequestMapping(value = "/method/param/annotation/model")
public class ModelAttributeTypeController {
//    @ModelAttribute("cityList")
//    public List<String> cityList() {
//        return Arrays.asList("北京", "山东");
//    }

//    @ModelAttribute("user")  //①
//    public UserModel getUser(@RequestParam(value = "username", defaultValue = "") String username) {
//        //TODO 去数据库根据用户名查找用户对象
//        UserModel user = new UserModel();
//        user.setUsername("zhang");
//        return user;
//    }

    @RequestMapping(value="/model1") //②
    public String test1(@ModelAttribute("user") UserModel user) {
        System.out.println(user);
        return "success";
    }
}
