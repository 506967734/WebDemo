package web.controller.chapter6.paramtype;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PathVariable 绑定 URI 模板变量值
 */
@Controller
@RequestMapping("/method/param/annotation")
public class PathVariableTypeController {
    
    @RequestMapping(value="/users/{userId}/topics/{topicId}")
    public String test(
            @PathVariable(value="userId") int userId, 
            @PathVariable(value="topicId") int topicId) {
        
        System.out.println(userId + ", " + topicId);
        
        return "success";
    }

}
