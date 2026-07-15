package com.example.hobby.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

@Controller
public class TopController {

    @RequestMapping("/top")
    public String top(Model model, HttpSession session) {
        session.removeAttribute("memberDto");
        session.removeAttribute("member");
        return "V000_0_top.html";
    }

    @GetMapping("/survey-create")
    public String surveyCreate() {
        return "survey-create.html";
    }
}
