package com.example.dynatrace.api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FreemarkerController {

    @GetMapping("/")
    public String index(Model model) {
        return "theme-lib.message-list";
    }

    @GetMapping("/test/")
    public String index2(Model model) {
        return "test";
    }
}