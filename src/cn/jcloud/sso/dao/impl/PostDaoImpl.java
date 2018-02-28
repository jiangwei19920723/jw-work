package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AbstractBaseDao;
import cn.jcloud.sso.dao.PostDao;
import cn.jcloud.sso.entity.Post;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午1:42:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class PostDaoImpl extends AbstractBaseDao<Post> implements PostDao {

	@Override
	public int save(Post post) {
		String sql = "insert into sso_post(postid,postname) values(?,?)";
		return DBUtils.executeUpdate(sql, post.getPostId(),post.getPostName());
	}

	@Override
	public int update(Post post) {
		String sql = "update sso_post set postname=? where postid=?";
		return DBUtils.executeUpdate(sql, post.getPostName(),post.getPostId());
	}

	@Override
	public int delete(Post post) {
		return delete(post.getPostId());
	}

	@Override
	public Post convert(ResultSet rs) {
		Post post = new Post();
		try {
			post.setPostId(rs.getInt("postid"));
			post.setPostName(rs.getString("postname"));
			return post;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int delete(int id) {
		String sql = "delete from sso_post where postid=?";
		return DBUtils.executeUpdate(sql, id);
	}

	@Override
	public Post findById(int id) {
		String sql = "select * from sso_post where postid=?";
		return DBUtils.executeQuery(this, sql, id).get(0);
	}

	@Override
	protected String getTableName() {
		return "sso_post";
	}

	@Override
	protected String getSort() {
		return "postid";
	}

}
