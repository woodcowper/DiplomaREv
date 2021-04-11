
package com.testweb.TestBlog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tmp", "Main page");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("tmp", "About us");
        return "about";
    }

    @GetMapping("/signin")
    public String signin(Model model) {
        model.addAttribute("tmp", "Sign in");
        return "signin";
    }

    @GetMapping("/admin-panel")
    public String adminPanel(Model model) {
        model.addAttribute("tmp", "Panel administratora");
        return "admin-panel";
    }

}