package com.gupta.learning.controller;

import com.gupta.learning.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by vikasg on 11/25/2015.
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public String getUserDetails(Model model){

        User user = new User();
        user.setfName("Vikas");
        user.setlName("Gupta");
        user.setAge(35);
        model.addAttribute("user", user);
        return "userview";
    }

    @ResponseBody
    @RequestMapping("/")
    public String entry() {
        return "Hello Spring Boot 123!!!!";
    }


}
