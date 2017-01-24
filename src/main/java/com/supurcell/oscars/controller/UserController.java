package com.supurcell.oscars.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
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
public class UserController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
