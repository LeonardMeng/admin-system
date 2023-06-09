package org.mengsoft.adminbackend.controller;

import lombok.extern.slf4j.Slf4j;
import org.mengsoft.adminbackend.entity.SysUser;
import org.mengsoft.adminbackend.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@Slf4j
public class TestController {

    @Autowired
    private SysUserService sysUserService;
//    @ApiOperation("Get Userinfo by UserID")
    @RequestMapping(value="/user/hellowolrd", method= RequestMethod.GET, produces="application/json")
    public String getHelloWorld(){
        return "this.hello";
    }

    @RequestMapping(value="/user/userList", method= RequestMethod.GET, produces="application/json")
    public List<SysUser> userList(){
        return sysUserService.list();
    }
}
