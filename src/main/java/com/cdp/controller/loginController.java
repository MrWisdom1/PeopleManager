package com.cdp.controller;

import com.cdp.model.People;
import com.cdp.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {
    @Autowired
    private PeopleService peopleService;
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(@RequestParam("P_account") String P_account, @RequestParam("P_password") String P_password, HttpSession session){
        if (P_account == null||P_account.equals("")){
            session.setAttribute("errorMsg","用户名不能为空！！！");
            return "login";
        }
        if (P_password.equals("")||P_password == null){
            session.setAttribute("errorMsg","密码不能为空！！！");
            return "login";
        }
        People people = peopleService.login(P_account,P_password);
        if (people == null || people.equals("")){
            session.setAttribute("errorMsg", "账户或密码错误，请重新输入！！！");
            System.out.println("人物："+people);
            return "login";
        }else {
            return "redirect:/index";
        }
    }

}
