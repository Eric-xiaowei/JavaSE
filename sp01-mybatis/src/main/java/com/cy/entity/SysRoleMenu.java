package com.cy.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class SysRoleMenu implements Serializable{
	private static final long serialVersionUID = 7760822353996803000L;
	private Integer id;
	private String name;
	private String note;
	private List<Integer> menuIds;
}
