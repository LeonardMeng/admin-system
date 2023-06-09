package org.mengsoft.adminbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mengsoft.adminbackend.entity.SysUser;
import org.mengsoft.adminbackend.service.SysUserService;
import org.mengsoft.adminbackend.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author menglingjun
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2023-06-09 22:25:18
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




