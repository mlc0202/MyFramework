/*
 * 版权声明 .
 * 此文档的版权归通联支付网络服务有限公司所有
 * Powered By [Allinpay-Boss-framework]
 */

package com.allinpay.its.boss.system.permission.model;

import javax.persistence.Table;

import com.allinpay.its.boss.framework.annotation.Description;
import com.allinpay.its.boss.framework.repository.mybatis.model.MyBatisBaseModel;

import org.apache.ibatis.type.Alias;

@Table(name="FRAMEWORK_SYS_ROLE")
@Alias(value="FrameworkSysRole")
public class FrameworkSysRole extends  MyBatisBaseModel {
	private static final long serialVersionUID = 670791035L;
	
	/** 变量 CREATE_TIME . */
	@Description(value="创建时间开始")
	private String createTimeBegin;
	@Description(value="创建时间结束")
	private String createTimeEnd;
	/** 变量 MODIFY_TIME . */
	@Description(value="修改时间开始")
	private String modifyTimeBegin;
	@Description(value="修改时间结束")
	private String modifyTimeEnd;
	
	//columns START
	/** 变量 id . */
	@Description(value="ID")
	private Long id;
	/** 变量 sysRoleCode . */
	@Description(value="系统角色编码")
	private java.lang.String sysRoleCode;
	/** 变量 sysRoleName . */
	@Description(value="系统角色名")
	private java.lang.String sysRoleName;
	/** 变量 sysRoleDescription . */
	@Description(value="系统角色描述")
	private java.lang.String sysRoleDescription;
	/** 变量 state . */
	@Description(value="状态")
	private java.lang.String state;
	/** 变量 remark . */
	@Description(value="备注")
	private java.lang.String remark;
	/** 变量 createUserId . */
	@Description(value="创建人ID")
	private Long createUserId;
	/** 变量 createTime . */
	@Description(value="创建时间")
	private java.util.Date createTime;
	/** 变量 modifyUserId . */
	@Description(value="修改人ID")
	private Long modifyUserId;
	/** 变量 modifyTime . */
	@Description(value="修改时间")
	private java.util.Date modifyTime;
	/** 变量 version . */
	@Description(value="版本号")
	private Long version;
	
	private String pmcheckStrs;
	//columns END

	/**
	* FrameworkSysRole 的构造函数
	*/
	public FrameworkSysRole() {
	}
	/**
	* FrameworkSysRole 的构造函数
	*/
	public FrameworkSysRole(
		Long id
	) {
		this.id = id;
	}


	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public Long getPk() {
		return this.id;
	}

	public void setSysRoleCode(java.lang.String value) {
		this.sysRoleCode = value;
	}
	
	public java.lang.String getSysRoleCode() {
		return this.sysRoleCode;
	}
	

	public void setSysRoleName(java.lang.String value) {
		this.sysRoleName = value;
	}
	
	public java.lang.String getSysRoleName() {
		return this.sysRoleName;
	}
	

	public void setSysRoleDescription(java.lang.String value) {
		this.sysRoleDescription = value;
	}
	
	public java.lang.String getSysRoleDescription() {
		return this.sysRoleDescription;
	}
	

	public void setState(java.lang.String value) {
		this.state = value;
	}
	
	public java.lang.String getState() {
		return this.state;
	}
	

	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	

	public void setCreateUserId(Long value) {
		this.createUserId = value;
	}
	
	public Long getCreateUserId() {
		return this.createUserId;
	}
	
		public void setCreateTimeBegin(String value) {
			this.createTimeBegin = value;
		}
		
		public String getCreateTimeBegin() {
			return this.createTimeBegin;
		}
		public void setCreateTimeEnd(String value) {
			this.createTimeEnd = value;
		}
		
		public String getCreateTimeEnd() {
			return this.createTimeEnd;
		}

	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	

	public void setModifyUserId(Long value) {
		this.modifyUserId = value;
	}
	
	public Long getModifyUserId() {
		return this.modifyUserId;
	}
	
		public void setModifyTimeBegin(String value) {
			this.modifyTimeBegin = value;
		}
		
		public String getModifyTimeBegin() {
			return this.modifyTimeBegin;
		}
		public void setModifyTimeEnd(String value) {
			this.modifyTimeEnd = value;
		}
		
		public String getModifyTimeEnd() {
			return this.modifyTimeEnd;
		}

	public void setModifyTime(java.util.Date value) {
		this.modifyTime = value;
	}
	
	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}
	

	public void setVersion(Long value) {
		this.version = value;
	}
	
	public Long getVersion() {
		return this.version;
	}
	public String getPmcheckStrs() {
		return pmcheckStrs;
	}
	public void setPmcheckStrs(String pmcheckStrs) {
		this.pmcheckStrs = pmcheckStrs;
	}

	

}

