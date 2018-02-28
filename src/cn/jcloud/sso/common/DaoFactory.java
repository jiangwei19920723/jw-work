package cn.jcloud.sso.common;

import cn.jcloud.sso.dao.AdminDao;
import cn.jcloud.sso.dao.AdminGroupDao;
import cn.jcloud.sso.dao.AdminOrgDao;
import cn.jcloud.sso.dao.AdminRoleDao;
import cn.jcloud.sso.dao.DegreeDao;
import cn.jcloud.sso.dao.GroupDao;
import cn.jcloud.sso.dao.GroupRoleDao;
import cn.jcloud.sso.dao.OrgRoleDao;
import cn.jcloud.sso.dao.OrgTypeDao;
import cn.jcloud.sso.dao.OrgleaderDao;
import cn.jcloud.sso.dao.PostDao;
import cn.jcloud.sso.dao.RoleDao;
import cn.jcloud.sso.dao.RolePrivilegeDao;
import cn.jcloud.sso.dao.SoftwareDao;
import cn.jcloud.sso.dao.UserDao;
import cn.jcloud.sso.dao.UserGroupDao;
import cn.jcloud.sso.dao.UserRoleDao;
import cn.jcloud.sso.dao.UserSoftwareDao;
import cn.jcloud.sso.dao.UserStampDao;
import cn.jcloud.sso.dao.UserTypeDao;
import cn.jcloud.sso.dao.impl.AdminDaoImpl;
import cn.jcloud.sso.dao.impl.AdminGroupDaoImpl;
import cn.jcloud.sso.dao.impl.AdminOrgDaoImpl;
import cn.jcloud.sso.dao.impl.AdminRoleDaoImpl;
import cn.jcloud.sso.dao.impl.DegreeDaoImpl;
import cn.jcloud.sso.dao.impl.GroupDaoImpl;
import cn.jcloud.sso.dao.impl.GroupRoleDaoImpl;
import cn.jcloud.sso.dao.impl.OrgRoleDaoImpl;
import cn.jcloud.sso.dao.impl.OrgTypeDaoImpl;
import cn.jcloud.sso.dao.impl.OrgleaderDaoImpl;
import cn.jcloud.sso.dao.impl.PostDaoImpl;
import cn.jcloud.sso.dao.impl.RoleDaoImpl;
import cn.jcloud.sso.dao.impl.RolePrivilegeDaoImpl;
import cn.jcloud.sso.dao.impl.SoftwareDaoImpl;
import cn.jcloud.sso.dao.impl.UserDaoImpl;
import cn.jcloud.sso.dao.impl.UserGroupDaoImpl;
import cn.jcloud.sso.dao.impl.UserRoleDaoImpl;
import cn.jcloud.sso.dao.impl.UserSoftwareDaoImpl;
import cn.jcloud.sso.dao.impl.UserStampDaoImpl;
import cn.jcloud.sso.dao.impl.UserTypeDaoImpl;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月28日 下午1:55:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class DaoFactory {
	public static AdminDao createAdminDao(){
		return new AdminDaoImpl();
	}
	public static AdminGroupDao createAdminGroupDao(){
		return new AdminGroupDaoImpl();
	}
	public static AdminOrgDao createAdminOrgDao(){
		return new AdminOrgDaoImpl();
	}
	public static AdminRoleDao createAdminRoleDao(){
		return new AdminRoleDaoImpl();
	}
	public static DegreeDao createDegreeDao(){
		return new DegreeDaoImpl();
	}
	public static GroupRoleDao createGroupRoleDao(){
		return new GroupRoleDaoImpl();
	}
	public static OrgleaderDao createOrgleaderDao(){
		return new OrgleaderDaoImpl();
	}
	public static OrgRoleDao createOrgRoleDao(){
		return new OrgRoleDaoImpl();
	}
	public static OrgTypeDao createOrgTypeDao(){
		return new OrgTypeDaoImpl();
	}
	public static PostDao createPostDao(){
		return new PostDaoImpl();
	}
	public static RoleDao createRoleDao(){
		return new RoleDaoImpl();
	}
	public static RolePrivilegeDao createRolePrivilegeDao(){
		return new RolePrivilegeDaoImpl();
	}
	public static SoftwareDao createSoftwareDao(){
		return new SoftwareDaoImpl();
	}
	public static UserDao createUserDao(){
		return new UserDaoImpl();
	}
	public static UserGroupDao createUserGroupDao(){
		return new UserGroupDaoImpl();
	}
	public static UserRoleDao createUserRoleDao(){
		return new UserRoleDaoImpl();
	}
	public static UserStampDao createUserStampDao(){
		return new UserStampDaoImpl();
	}
	public static UserTypeDao createUserTypeDao(){
		return new UserTypeDaoImpl();
	}
	public static GroupDao createGroupDao(){
		return new GroupDaoImpl();
	}
	public static UserSoftwareDao createUserSoftwareDao(){
		return new UserSoftwareDaoImpl();
	}
}
