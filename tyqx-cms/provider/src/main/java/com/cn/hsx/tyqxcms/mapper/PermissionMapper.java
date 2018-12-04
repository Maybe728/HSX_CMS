package com.cn.hsx.tyqxcms.mapper;

import com.cn.hsx.tyqxcms.dto.PermissionInfo;
import com.cn.hsx.tyqxcms.entity.Permission;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 系统权限表 Mapper 接口
 * </p>
 *
 * @author Auto Generator
 * @since 2018-07-16
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    List<PermissionInfo> allPermissionInfo();

}
