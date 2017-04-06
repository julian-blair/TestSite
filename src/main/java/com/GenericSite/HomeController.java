package com.GenericSite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Tim on 2017-04-05.
 */


@Controller
public class HomeController {

    @RequestMapping("/greeting")
    public String index() {
        return "greeting";
    }

    @RequestMapping("/counter")
    public String counter() {
        return "counter";
    }
}
