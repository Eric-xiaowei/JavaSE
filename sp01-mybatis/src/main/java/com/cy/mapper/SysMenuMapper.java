package com.cy.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/19-21:12
 */
public interface SysMenuMapper {

    List<String> findPermissonsById(@Param("menuIds") List<Integer> menuIds);
}
