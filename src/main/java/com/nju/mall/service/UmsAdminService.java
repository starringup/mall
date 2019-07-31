package com.nju.mall.service;

import java.util.List;

import com.nju.mall.mbg.model.UmsAdmin;
import com.nju.mall.mbg.model.UmsPermission;

/*
 * 后台管理员service
 * */

public interface UmsAdminService {
	/*
	 * 根据用户名获取后台管理员
	 * */
    UmsAdmin getAdminByUsername(String username);

    UmsAdmin register(UmsAdmin umsAdminParam);

    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);
}
