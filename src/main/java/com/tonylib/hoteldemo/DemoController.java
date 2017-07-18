package com.tonylib.hoteldemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengge on 7/16/2017.
 */

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
