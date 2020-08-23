package com.cy.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class SysMenu  implements Serializable{
	private static final long serialVersionUID = 3080223330352007070L;
	private Integer id;
	private String name;
	private String url;
	private Integer type;
	private Integer sort;
	private String note;
	private String permission;
	private Integer parentId;
	private String parentName;
	private String createdUser;
	private String modifiedUser;
	private Date createdTime;
	private Date modifiedTime;
}
