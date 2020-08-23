package com.cy.resultmap;

import com.cy.entity.SysRoleMenu;
import com.cy.mapper.SysMenuMapper;
import com.cy.mapper.SysRoleMapper;

import com.cy.mapper.SysRoleMenuMapper;
import com.cy.mapper.SysUserRoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/19-17:04
 */
@SpringBootTest
public class Test_01 {

    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;
    @Autowired
    private SysMenuMapper sysMenuMapper;

    //1.基于role_id查询菜单id
    @Test
    void findObjectByRoleId(){
        Integer id = 48;//测试数据
        SysRoleMenu sysRoleMenu = sysRoleMapper.findMenuIdsByRoleId(id);
        System.out.println(sysRoleMenu);//已经重写了toString()方法
    }

    //2.基于user_id查询菜单id,进而查询授权标识：
    //分析：一个用户可能有多个角色，每个角色可能有多个菜单id，每个菜单id都对应着相应的权限
    @Test
    void findObjectPermission(){
        Integer id = 18;//测试数据
        //1.首先基于user_id查询role_id
        List<Integer> roleIds = sysUserRoleMapper.findRoleIdsByUserId(id);
        System.out.println(roleIds);//测试查询结果
        //2.基于多个role_id去查询多个menu_id
        List<Integer> menuIds = sysRoleMenuMapper.findMenuIdsByRoleIds(roleIds);
        System.out.println(menuIds);
        //3.根据menu_id查询permisson的标识：
        List<String> permissons = sysMenuMapper.findPermissonsById(menuIds);
        System.out.println(permissons);

    }
}
