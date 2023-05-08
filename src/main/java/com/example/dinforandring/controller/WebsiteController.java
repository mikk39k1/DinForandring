package com.example.dinforandring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {

    @GetMapping("/")
    public String forside(){
        return "home/forside";
    }

    @GetMapping("/om")
    public String om(){
        return "om/om";
    }

    @GetMapping("/sessioner")
    public String sessioner(){
        return "sessioner/sessioner";
    }

    @GetMapping("/artikler")
    public String artikler(){
        return "artikler/angst";
    }

    @GetMapping("/angst")
    public String angst(){
        return "artikler/angst";
    }

    @GetMapping("/fobier")
    public String fobier(){
        return "artikler/fobier";
    }

    @GetMapping("/rygestop")
    public String rygestop(){
        return "artikler/rygestop";
    }

    @GetMapping("/vægttab")
    public String vægttab(){
        return "artikler/vægttab";
    }

    @GetMapping("/priser")
    public String priser(){
        return "priser/priser";
    }

    @GetMapping("/kontakt")
    public String kontakt(){
        return "kontakt/kontakt";
    }

    @GetMapping("/fakta&myter")
    public String faktaogmyter(){
        return "fakta&myter/fakta&myter";
    }
}
