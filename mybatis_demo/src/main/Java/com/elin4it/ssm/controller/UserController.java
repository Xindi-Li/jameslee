package com.elin4it.ssm.controller;

import com.elin4it.ssm.pojo.User;
import com.elin4it.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lixindi on 2017/1/11.
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String findUser(Model model) throws Exception {

        //调用service方法得到用户列表
        List<User> users = userService.findUser();
        //将得到的用户列表内容添加到ModelAndView中
        model.addAttribute("users", users);
        return "findUser";
    }
}
