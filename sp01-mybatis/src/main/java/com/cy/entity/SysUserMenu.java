package com.cy.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class SysUserMenu implements Serializable{
	private static final long serialVersionUID = 7266721118655784653L;
	private Integer id;
	private String name;
	private String url;
	//二级菜单
	private List<SysUserMenu> childs;

}//VO,BO,DO,DTO
