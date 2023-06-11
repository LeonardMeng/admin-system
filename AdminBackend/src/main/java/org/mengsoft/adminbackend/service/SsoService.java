package org.mengsoft.adminbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.mengsoft.adminbackend.entity.SysUser;

public interface SsoService extends IService<SysUser> {

    SysUser login(String username, String password);

    boolean logout(String token);
}
