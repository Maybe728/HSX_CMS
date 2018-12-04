package com.cn.hsx.tyqxcms.service.impl;

import com.cn.hsx.tyqxcms.entity.LoginLog;
import com.cn.hsx.tyqxcms.mapper.LoginLogMapper;
import com.cn.hsx.tyqxcms.service.ILoginLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 系统登录日志表 服务实现类
 * </p>
 *
 * @author Auto Generator
 * @since 2018-10-01
 */
@Service(version = "1.0.0", timeout = 60000)
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {

}
