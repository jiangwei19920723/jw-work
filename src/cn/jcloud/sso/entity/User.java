package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * 用户
 * @author  蒋维 
 * @date 创建时间：2017年8月23日 下午3:17:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class User{

	private String userId;//用户编号
	private String loginName;//登录名
	private String userName;//姓名
	private int userLevel;//用户级别
	private String password;//密码
	private Date expiredDate;//过期日期
	private int expired;//过期状态
	private String adminId;//管理员编号
	private String orgId;//机构编号
	private int isLeader;//是否机构主管
	private String skin;//皮肤
	private String langCode;//语言
	private String ipConfig;//登陆IP设置
	private String userType;//用户类别
	private int postId;//职位
	private int sex;//性别
	private Date birthday;//生日
	private String idCard;//身份证号码
	private int photoFile;//照片
	private String school;//学校
	private int graduation;//毕业年份
	private int degree;//学历
	private String major;//专业
	private String country;//国家
	private String province;//省
	private String city;//市
	private String address;//地址
	private String postcode;//邮政编码
	private String phone;//固定电话
	private String fax;//传真
	private String mobile;//手机
	private String email;//邮箱
	private String remark;//备注
	private String creator;//创建人
	private Date createTime;//创建时间
	private String modifier;//修改人
	private Date modifyTime;//修改时间
	private int o;//数序
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginname) {
		this.loginName = loginname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	public int getExpired() {
		return expired;
	}
	public void setExpired(int expired) {
		this.expired = expired;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public int getIsLeader() {
		return isLeader;
	}
	public void setIsLeader(int isLeader) {
		this.isLeader = isLeader;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public String getLangCode() {
		return langCode;
	}
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}
	public String getIpConfig() {
		return ipConfig;
	}
	public void setIpConfig(String ipConfig) {
		this.ipConfig = ipConfig;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public int getPhotoFile() {
		return photoFile;
	}
	public void setPhotoFile(int photoFile) {
		this.photoFile = photoFile;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGraduation() {
		return graduation;
	}
	public void setGraduation(int graduation) {
		this.graduation = graduation;
	}
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public int getO() {
		return o;
	}
	public void setO(int o) {
		this.o = o;
	}	
	
}
