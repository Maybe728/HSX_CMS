package com.cn.hsx.tyqxcms.service;

import com.cn.hsx.tyqxcms.dto.UserInfo;
import com.cn.hsx.tyqxcms.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author Auto Generator
 * @since 2018-07-16
 */
public interface IUserService extends IService<User> {

    UserInfo findUserInfo(String userName);

}
