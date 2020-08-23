package com.cy.mapper;

import com.cy.entity.SysRoleMenu;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/19-17:07
 */
public interface SysRoleMapper {

    SysRoleMenu findMenuIdsByRoleId(Integer id);
}
