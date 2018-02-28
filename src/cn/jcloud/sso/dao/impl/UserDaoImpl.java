package cn.jcloud.sso.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AbstractBaseDao;
import cn.jcloud.sso.dao.UserDao;
import cn.jcloud.sso.entity.User;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月23日 下午5:03:04
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class UserDaoImpl extends AbstractBaseDao<User> implements UserDao {

	@Override
	public int save(User user) {
		Object[] objects = new Object[38];
		objects[0] = user.getUserId();
		objects[1] = user.getLoginName();
		objects[2] = user.getUserName();
		objects[3] = user.getUserLevel();
		objects[4] = user.getPassword();
		objects[5] = new Date(user.getExpiredDate().getTime());
		objects[6] = user.getExpired();
		objects[7] = user.getAdminId();
		objects[8] = user.getOrgId();
		objects[9] = user.getIsLeader();
		objects[10] = user.getSkin();
		objects[11] = user.getLangCode();
		objects[12] = user.getIpConfig();
		objects[13] = user.getUserType();
		objects[14] = user.getPostId();
		objects[15] = user.getSex();
		objects[16] = new Date(user.getBirthday().getTime());
		objects[17] = user.getIdCard();
		objects[18] = user.getPhotoFile();
		objects[19] = user.getSchool();
		objects[20] = user.getGraduation();
		objects[21] = user.getDegree();
		objects[22] = user.getMajor();
		objects[23] = user.getCountry();
		objects[24] = user.getProvince();
		objects[25] = user.getCity();
		objects[26] = user.getAddress();
		objects[27] = user.getPostcode();
		objects[28] = user.getPhone();
		objects[29] = user.getFax();
		objects[30] = user.getMobile();
		objects[31] = user.getEmail();
		objects[32] = user.getRemark();
		objects[33] = user.getCreator();
		objects[34] = new Date(user.getCreateTime().getTime());
		objects[35] = user.getModifier();
		objects[36] = new Date(user.getModifyTime().getTime());
		objects[37] = user.getO();
		String sql = "INSERT INTO SSO_USER(USERID,LOGINNAME,USERNAME,USERLEVEL,PASSWORD,EXPIREDDATE,EXPIRED,ADMINID,ORGID,ISLEADER,SKIN,LANGCODE,IPCONFIG,USERTYPE,POSTID,SEX,BIRTHDAY,IDCARD,PHOTO_FILE,SCHOOL,GRADUATION,DEGREE,MAJOR,COUNTRY,PROVINCE,CITY,ADDRESS,POSTCODE,PHONE,FAX,MOBILE,EMAIL,REMARK,CREATOR,CREATETIME,MODIFIER,MODIFYTIME,O) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return DBUtils.executeUpdate(sql, objects);
	}

	@Override
	public int update(User user) {
		Object[] objects = new Object[38];
		objects[0] = user.getLoginName();
		objects[1] = user.getUserName();
		objects[2] = user.getUserLevel();
		objects[3] = user.getPassword();
		objects[4] = new Date(user.getExpiredDate().getTime());
		objects[5] = user.getExpired();
		objects[6] = user.getAdminId();
		objects[7] = user.getOrgId();
		objects[8] = user.getIsLeader();
		objects[9] = user.getSkin();
		objects[10] = user.getLangCode();
		objects[11] = user.getIpConfig();
		objects[12] = user.getUserType();
		objects[13] = user.getPostId();
		objects[14] = user.getSex();
		objects[15] = new Date(user.getBirthday().getTime());
		objects[16] = user.getIdCard();
		objects[17] = user.getPhotoFile();
		objects[18] = user.getSchool();
		objects[19] = user.getGraduation();
		objects[20] = user.getDegree();
		objects[21] = user.getMajor();
		objects[22] = user.getCountry();
		objects[23] = user.getProvince();
		objects[24] = user.getCity();
		objects[25] = user.getAddress();
		objects[26] = user.getPostcode();
		objects[27] = user.getPhone();
		objects[28] = user.getFax();
		objects[29] = user.getMobile();
		objects[30] = user.getEmail();
		objects[31] = user.getRemark();
		objects[32] = user.getCreator();
		objects[33] = new Date(user.getCreateTime().getTime());
		objects[34] = user.getModifier();
		objects[35] = new Date(user.getModifyTime().getTime());
		objects[36] = user.getO();
		objects[37] = user.getUserId();
		String sql = "UPDATE SSO_USER SET loginname=?,username=?,userlevel=?,password=?,expireddate=?,expired=?,"
				+ "adminid=?,orgid=?,isleader=?,skin=?,langcode=?,ipconfig=?,usertype=?,postid=?,sex=?,birthday=?,"
				+ "idcard=?,photo_file=?,school=?,graduation=?,degree=?,major=?,country=?,province=?,city=?,address=?,"
				+ "postcode=?,phone=?,fax=?,mobile=?,email=?,remark=?,creator=?,createtime=?,modifier=?,modifytime=?,o=?"
				+ " WHERE userid=?";
		return DBUtils.executeUpdate(sql, objects);
	}

	@Override
	public int delete(User user) {
		return delete(user.getUserId());
	}

	@Override
	public User findById(String id) {
		String sql = "select * from sso_user where userid =?";
		return DBUtils.executeQuery(this, sql, id).get(0);
	}

	@Override
	public int delete(String id) {
		String sql = "delete from sso_user where userid = ?";
		return DBUtils.executeUpdate(sql, id);
	}

	@Override
	public User fingByUserName(String userName) {
		String sql = "select * from sso_user where username = ?";
		return DBUtils.executeQuery(this, sql, userName).get(0);
	}

	@Override
	public User convert(ResultSet rs) {
		User user = new User();
		try {
			user.setUserId(rs.getString("userid"));
			user.setLoginName(rs.getString("loginname"));
			user.setUserName(rs.getString("username"));
			user.setUserLevel(rs.getInt("userlevel"));
			user.setPassword(rs.getString("password"));
			user.setExpiredDate(new java.util.Date(rs.getDate("expireddate").getTime()));
			user.setExpired(rs.getInt("expired"));
			user.setAdminId(rs.getString("adminid"));
			user.setOrgId(rs.getString("orgid"));
			user.setIsLeader(rs.getInt("isleader"));
			user.setSkin(rs.getString("skin"));
			user.setLangCode(rs.getString("langcode"));
			user.setIpConfig(rs.getString("ipconfig"));
			user.setUserType(rs.getString("usertype"));
			user.setPostId(rs.getInt("postid"));
			user.setSex(rs.getInt("sex"));
			user.setBirthday(new java.util.Date(rs.getDate("birthday").getTime()));
			user.setIdCard(rs.getString("idcard"));
			user.setPhotoFile(rs.getInt("photo_file"));
			user.setSchool(rs.getString("school"));
			user.setGraduation(rs.getInt("graduation"));
			user.setDegree(rs.getInt("degree"));
			user.setMajor(rs.getString("major"));
			user.setCountry(rs.getString("country"));
			user.setProvince(rs.getString("province"));
			user.setCity(rs.getString("city"));
			user.setAddress(rs.getString("address"));
			user.setPostcode(rs.getString("postcode"));
			user.setPhone(rs.getString("phone"));
			user.setFax(rs.getString("fax"));
			user.setMobile(rs.getString("mobile"));
			user.setEmail(rs.getString("email"));
			user.setRemark(rs.getString("remark"));
			user.setCreator(rs.getString("creator"));
			user.setCreateTime(new java.util.Date(rs.getDate("createtime").getTime()));
			user.setModifier(rs.getString("modifier"));
			user.setModifyTime(new java.util.Date(rs.getDate("modifytime").getTime()));
			user.setO(rs.getInt("o"));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return user;
	}

	@Override
	protected String getTableName() {
		return "sso_user";
	}

	@Override
	protected String getSort() {
		return "o";
	}

}
