package org.mengsoft.adminbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.adminbackend.common.responseutils.BusinessException;
import org.mengsoft.adminbackend.common.responseutils.enums.ResponseCode;
import org.mengsoft.adminbackend.entity.SysUser;
import org.mengsoft.adminbackend.mapper.SysUserMapper;
import org.mengsoft.adminbackend.service.SsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SsoServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SsoService {

    @Resource
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser login(String username, String password) {
        SysUser sysUser = sysUserMapper.selectById(username);
        if( sysUser == null)
            throw new BusinessException(ResponseCode.USER_NOT_EXSITED);
        if(!sysUser.getPassword().equals(password))
            throw new BusinessException(ResponseCode.USER_PASSWORD_ERROR);
        return sysUser;
    }

    @Override
    public boolean logout(String token) {
        return false;
    }
}
