package org.mengsoft.adminbackend.controller;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.tools.jconsole.inspector.XTree;

@RestController
@EnableAutoConfiguration
@Slf4j
@RequestMapping(value="/sso")
public class SSOController {

    @RequestMapping(value="/user/userList", method= RequestMethod.GET, produces="application/json")
    public String login(){
        return JwtUtils.genJwtToken("java1234");
    }

}
