package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/Songform")
    public String LoadFormPage(Model model)
    {
        model.addAttribute("songobj", new Song());   // empty songobj, need it to use in Songform
        return "Songform";
    }

    @PostMapping("/Songform")
    public String LoadFromPage(@ModelAttribute Song songobj, Model model)
    {
        model.addAttribute("mysongvar", songobj);
        //model.addAttribute("songobj", songobj);   // if want to use songobj, will need to re-add the attribute here
        return "confirmsong";
    }
}
