package org.mengsoft.adminbackend.controller;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.mengsoft.adminbackend.common.JwtUtils;
import org.mengsoft.adminbackend.entity.SysUser;
import org.mengsoft.adminbackend.service.SsoService;
import org.mengsoft.adminbackend.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import sun.tools.jconsole.inspector.XTree;

import javax.annotation.Resource;
import java.util.Map;

import static org.mengsoft.adminbackend.constant.JwtConstant.JWT_TTL;

@RestController
@EnableAutoConfiguration
@Slf4j
@RequestMapping(value="/sso")
public class SSOController {
    @Autowired
    private SysUserService sysUserService;

    @Resource
    private SsoService ssoService;

    @RequestMapping(value="/login", method= RequestMethod.POST, produces="application/json")
    public String login(@RequestBody Map<String, String> params) {
        SysUser user = ssoService.login(params.get("username"), params.get("password"));
        return JwtUtils.createJWT(user.getUsername(), user.getUsername(), JWT_TTL);
    }

}
