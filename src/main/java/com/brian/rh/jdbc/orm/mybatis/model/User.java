package com.brian.rh.jdbc.orm.mybatis.model;

import java.util.Date;

public class User{

	private Long id;//主键
	
	private String account;//账号
	
	private String password;//密码
	
	private String picUrl;
	
	private String email;//
	
	private Integer state;//状态 1是有效 0是无效
	
	private Date lastlogindate;//上次登录日期
	
	private String lastloginip;//上次登录IP
	
	private Integer errorcount;//错误记录 默认5次锁定账号
	
	private Date errordate;//登录密码错误时间记录
	
	private Integer islock;//密码输入错误5次后直接锁定 1是锁定 0是未锁定
	
	private Date createdate;//创建日期
	
	private String phone;//电话号码
	
	private String userName;//昵称
	
	private String userType;//用户类型
	
	private Long orgId;//组织
	
	private String token;//IM编号
	
	private Long teamId;//小组
	
	private Long rolelevel;//权限角色 1：监管户运维
	
	private String teamName;//小组名称

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getLastlogindate() {
		return lastlogindate;
	}

	public void setLastlogindate(Date lastlogindate) {
		this.lastlogindate = lastlogindate;
	}

	public String getLastloginip() {
		return lastloginip;
	}

	public void setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip;
	}

	public Integer getErrorcount() {
		return errorcount;
	}

	public void setErrorcount(Integer errorcount) {
		this.errorcount = errorcount;
	}

	public Date getErrordate() {
		return errordate;
	}

	public void setErrordate(Date errordate) {
		this.errordate = errordate;
	}

	public Integer getIslock() {
		return islock;
	}

	public void setIslock(Integer islock) {
		this.islock = islock;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public Long getRolelevel() {
		return rolelevel;
	}

	public void setRolelevel(Long rolelevel) {
		this.rolelevel = rolelevel;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", account='" + account + '\'' +
				", password='" + password + '\'' +
				", picUrl='" + picUrl + '\'' +
				", email='" + email + '\'' +
				", state=" + state +
				", lastlogindate=" + lastlogindate +
				", lastloginip='" + lastloginip + '\'' +
				", errorcount=" + errorcount +
				", errordate=" + errordate +
				", islock=" + islock +
				", createdate=" + createdate +
				", phone='" + phone + '\'' +
				", userName='" + userName + '\'' +
				", userType='" + userType + '\'' +
				", orgId=" + orgId +
				", token='" + token + '\'' +
				", teamId=" + teamId +
				", rolelevel=" + rolelevel +
				", teamName='" + teamName + '\'' +
				'}';
	}
}