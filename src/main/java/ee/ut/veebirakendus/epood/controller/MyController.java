package ee.ut.veebirakendus.epood.controller;

import java.util.List;

import ee.ut.veebirakendus.epood.bean.Toode;
import ee.ut.veebirakendus.epood.service.IToodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    IToodeService toodeService;

    @RequestMapping("/Tooted")
    public String findCities(Model model) {

        List<Toode> tooted = (List<Toode>) toodeService.findAll();

        model.addAttribute("tooted", tooted);

        return "Tooted";
    }
}