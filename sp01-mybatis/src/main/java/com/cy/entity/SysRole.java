package com.cy.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class SysRole implements Serializable{
	 private static final long serialVersionUID = -7664225534835759344L;
	 private Integer id;
	 private String name;
	 private String note;
	 private Date createdTime;
	 private Date modifiedTime;
	 private String createdUser;
	 private String modifiedUser;
}
