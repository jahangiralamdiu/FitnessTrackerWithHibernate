package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lenovo on 08/10/2014.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model)
    {
        System.out.println("I am in Login Method");

        return "login";
    }

    @RequestMapping(value = "/loginFailed", method = RequestMethod.GET)
    public String loginFailed(ModelMap model)
    {
        System.out.println("Login Failed");
        model.addAttribute("error", "true");
        return "login";
    }

    @RequestMapping(value= "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model)
    {
        return "logout";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String error403(ModelMap model)
    {
        return "403";
    }
}
