package com.sparta.spring_mvc.html_package;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class htmlcontroller {

    private static long visitcount=0;
    @GetMapping("/static-hello")
    public String H(){
        return "hello.html";
    }
    @GetMapping("/html_redirect")
    public String Hr(){
        return "redirect:/hello.html";
    }
    @GetMapping("/html_templates")
    public String Ht(){
        return "hello";
    }

    @GetMapping("/html/dinamic")
    public String Hd(Model model){
        visitcount++;
        model.addAttribute("visits",visitcount);
        return "hello-visit";
    }
}
