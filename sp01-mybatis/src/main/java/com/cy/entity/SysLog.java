package com.cy.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 基于此对象存储表中查询到的数据
 * 建议：在java中所有用于存储数据的对象都实现Serializable接口
 */
@Data
public class SysLog implements Serializable{
    private static final long serialVersionUID = 8924387722922123121L;
	private Integer id;
	//用户名
	private String username;
	//用户操作
	private String operation;
	//请求方法
	private String method;
	//请求参数
	private String params;
	//执行时长(毫秒)
	private Long time;
	//IP地址
	private String ip;
	//创建时间
	private Date createdTime;
}
