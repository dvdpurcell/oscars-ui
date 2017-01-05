package com.supurcell.oscars.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: dpurcell
 * Date: 1/5/17
 * Time: 8:48 AM
 * To change this template use File | Settings | File Templates.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @RequestMapping("/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }
}
