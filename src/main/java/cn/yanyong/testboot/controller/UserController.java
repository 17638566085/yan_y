package cn.yanyong.testboot.controller;

import cn.yanyong.testboot.entity.User;
import cn.yanyong.testboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.logging.Logger;

/**
 * 2018/9/28$ {Yan_y}
 */
@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){

    return "/login";

    }

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView index(){
        List<User> usersList=userService.findUserLogin(null);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("userList", usersList);

        modelAndView.setViewName("/index");

        return modelAndView;

          }




   /* @RequestMapping(value = "/index",method = RequestMethod.POST)
    @ResponseBody
    public String index(){
        User user=new User();
        user.getId();
        user.getPassword();
        user.getUserName();
        List<User> list= userService.findUserLogin(user);

        return  "/index";

    }*/






    }

