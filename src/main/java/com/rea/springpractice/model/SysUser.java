package com.rea.springpractice.model;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
  private String id;

  private String username;

  private String realname;

  private String password;

  private String salt;

  private String avatar;

  private Date birthday;

  private Boolean sex;

  private String email;

  private String phone;

  private String orgCode;

  private Boolean status;

  private Boolean delFlag;

  private String thirdId;

  private String thirdType;

  private Boolean activitiSync;

  private String workNo;

  private String post;

  private String telephone;

  private String createBy;

  private Date createTime;

  private String updateBy;

  private Date updateTime;

  private Boolean userIdentity;

  private String relTenantIds;

  private String clientId;

  private String departIds;

  private static final long serialVersionUID = 1L;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Boolean getSex() {
    return sex;
  }

  public void setSex(Boolean sex) {
    this.sex = sex;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getOrgCode() {
    return orgCode;
  }

  public void setOrgCode(String orgCode) {
    this.orgCode = orgCode;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Boolean getDelFlag() {
    return delFlag;
  }

  public void setDelFlag(Boolean delFlag) {
    this.delFlag = delFlag;
  }

  public String getThirdId() {
    return thirdId;
  }

  public void setThirdId(String thirdId) {
    this.thirdId = thirdId;
  }

  public String getThirdType() {
    return thirdType;
  }

  public void setThirdType(String thirdType) {
    this.thirdType = thirdType;
  }

  public Boolean getActivitiSync() {
    return activitiSync;
  }

  public void setActivitiSync(Boolean activitiSync) {
    this.activitiSync = activitiSync;
  }

  public String getWorkNo() {
    return workNo;
  }

  public void setWorkNo(String workNo) {
    this.workNo = workNo;
  }

  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public Boolean getUserIdentity() {
    return userIdentity;
  }

  public void setUserIdentity(Boolean userIdentity) {
    this.userIdentity = userIdentity;
  }

  public String getRelTenantIds() {
    return relTenantIds;
  }

  public void setRelTenantIds(String relTenantIds) {
    this.relTenantIds = relTenantIds;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getDepartIds() {
    return departIds;
  }

  public void setDepartIds(String departIds) {
    this.departIds = departIds;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", id=").append(id);
    sb.append(", username=").append(username);
    sb.append(", realname=").append(realname);
    sb.append(", password=").append(password);
    sb.append(", salt=").append(salt);
    sb.append(", avatar=").append(avatar);
    sb.append(", birthday=").append(birthday);
    sb.append(", sex=").append(sex);
    sb.append(", email=").append(email);
    sb.append(", phone=").append(phone);
    sb.append(", orgCode=").append(orgCode);
    sb.append(", status=").append(status);
    sb.append(", delFlag=").append(delFlag);
    sb.append(", thirdId=").append(thirdId);
    sb.append(", thirdType=").append(thirdType);
    sb.append(", activitiSync=").append(activitiSync);
    sb.append(", workNo=").append(workNo);
    sb.append(", post=").append(post);
    sb.append(", telephone=").append(telephone);
    sb.append(", createBy=").append(createBy);
    sb.append(", createTime=").append(createTime);
    sb.append(", updateBy=").append(updateBy);
    sb.append(", updateTime=").append(updateTime);
    sb.append(", userIdentity=").append(userIdentity);
    sb.append(", relTenantIds=").append(relTenantIds);
    sb.append(", clientId=").append(clientId);
    sb.append(", departIds=").append(departIds);
    sb.append(", serialVersionUID=").append(serialVersionUID);
    sb.append("]");
    return sb.toString();
  }
}
