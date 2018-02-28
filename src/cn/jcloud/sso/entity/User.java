package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * �û�
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��23�� ����3:17:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class User{

	private String userId;//�û����
	private String loginName;//��¼��
	private String userName;//����
	private int userLevel;//�û�����
	private String password;//����
	private Date expiredDate;//��������
	private int expired;//����״̬
	private String adminId;//����Ա���
	private String orgId;//�������
	private int isLeader;//�Ƿ��������
	private String skin;//Ƥ��
	private String langCode;//����
	private String ipConfig;//��½IP����
	private String userType;//�û����
	private int postId;//ְλ
	private int sex;//�Ա�
	private Date birthday;//����
	private String idCard;//���֤����
	private int photoFile;//��Ƭ
	private String school;//ѧУ
	private int graduation;//��ҵ���
	private int degree;//ѧ��
	private String major;//רҵ
	private String country;//����
	private String province;//ʡ
	private String city;//��
	private String address;//��ַ
	private String postcode;//��������
	private String phone;//�̶��绰
	private String fax;//����
	private String mobile;//�ֻ�
	private String email;//����
	private String remark;//��ע
	private String creator;//������
	private Date createTime;//����ʱ��
	private String modifier;//�޸���
	private Date modifyTime;//�޸�ʱ��
	private int o;//����
	
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
