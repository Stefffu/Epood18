package ee.ut.veebirakendus.epood.controller;

import java.util.List;

import ee.ut.veebirakendus.epood.bean.Toode;
import ee.ut.veebirakendus.epood.service.IToodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    IToodeService toodeService;

    @RequestMapping("/home")
    public String koduleht(Model model) {

        model.addAttribute("kogus", toodeService.kogus());

        return "home";
    }

    @RequestMapping("/")
    public String koduleht2(Model model) {

        model.addAttribute("kogus", toodeService.kogus());

        return "home";
    }

    @RequestMapping("/Tooted")
    public String findTooted(Model model) {

        List<Toode> tooted = (List<Toode>) toodeService.findAll();

        model.addAttribute("tooted", tooted);

        return "Tooted";
    }

    @RequestMapping(value="/form", method= RequestMethod.GET)
    public String tooteForm(Model model) {
        model.addAttribute("toode", new Toode());
        return "form";
    }

    @RequestMapping(value="/form", method=RequestMethod.POST)
    public String tooteSubmit(@ModelAttribute Toode toode, Model model) {

        model.addAttribute("toode", toode);
        String info = String.format("Toote sisestamine: id = %d, nimi = %s, kirjeldus = %s, kaal = %s, hind = %s, kogus_laos= %d",
                toode.getId(), toode.getNimi(), toode.getKirjeldus(), toode.getKaal(), toode.getHind(),toode.getKogus_laos());
        log.info(info);
        toodeService.lisa(toode);

        return "result";
    }
}