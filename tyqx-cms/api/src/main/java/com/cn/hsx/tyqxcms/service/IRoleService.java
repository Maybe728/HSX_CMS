package com.cn.hsx.tyqxcms.service;

import com.cn.hsx.tyqxcms.entity.Role;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 系统角色表 服务类
 * </p>
 *
 * @author Auto Generator
 * @since 2018-07-16
 */
public interface IRoleService extends IService<Role> {

    Boolean saveRole(Role role);

}