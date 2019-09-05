package nnamdi.springframework.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nwabuokei Nnamdi
 */

@Controller
public class indexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
