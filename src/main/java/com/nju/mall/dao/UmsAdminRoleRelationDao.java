package com.nju.mall.dao;

import java.util.List;

import com.nju.mall.mbg.model.UmsPermission;

import io.lettuce.core.dynamic.annotation.Param;

/*
 * 后台用户与角色管理自定义Dao
 * */
public interface UmsAdminRoleRelationDao {
	/*
	 * 获取用户所有权限
	 * */
	List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
