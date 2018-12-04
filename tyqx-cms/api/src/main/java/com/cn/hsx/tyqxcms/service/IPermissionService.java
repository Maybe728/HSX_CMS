package com.cn.hsx.tyqxcms.service;

import com.cn.hsx.tyqxcms.dto.PermissionInfo;
import com.cn.hsx.tyqxcms.entity.Permission;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;

/**
 * <p>
 * 系统权限表 服务类
 * </p>
 *
 * @author Auto Generator
 * @since 2018-07-16
 */
public interface IPermissionService extends IService<Permission> {

     List<Permission> getAllPermissions();

     Boolean savePermission(Permission permission);

     Boolean delBatchPermission(List<Integer> ids);

     List<PermissionInfo> allPermissionInfo();

     List<Permission> getMenuPermissions(String code);

     List<Permission> getAllDirectoryPermissions();

}