package com.cy.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/19-20:14
 */
public interface SysUserRoleMapper {

    List<Integer> findRoleIdsByUserId(@Param("id") Integer id);
}
