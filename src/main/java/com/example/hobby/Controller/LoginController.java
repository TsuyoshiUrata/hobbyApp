package com.example.hobby.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.hobby.Form.LoginMemberForm;

import org.springframework.ui.Model;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loginMemberForm", new LoginMemberForm());
        return "V002_1_login";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "V002_2_logout.html";
    }
}
