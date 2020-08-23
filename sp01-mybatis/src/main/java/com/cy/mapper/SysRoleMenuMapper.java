package com.cy.mapper;

import com.cy.entity.SysUserMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/19-19:10
 */
public interface SysRoleMenuMapper {

    List<Integer> findMenuIdsByRoleIds(@Param("roleIds") List<Integer> roleIds);
}
