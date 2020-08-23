package com.cy.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class SysUserDept implements Serializable {
	private static final long serialVersionUID = -924193587093306322L;
	private Integer id;
	private String username;
	private String password;//md5
	private String salt;
	private String email;
	private String mobile;
	private Integer valid=1;
	/**借助此属性存储部门信息*/
	private SysDept sysDept; //private Integer deptId;
	private Date createdTime;
	private Date modifiedTime;
	private String createdUser;
	private String modifiedUser;
}
