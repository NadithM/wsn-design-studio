package com.fyp.wsn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Asela on 5/3/2017.
 */

@Controller

public class RouteController {

    @RequestMapping("/")
    public String Index(){
        return "home";
    }

    @RequestMapping("/create/network")
    public String CreateNetwork(){
        return "createNetwork";
    }

}
