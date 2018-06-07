package com.yczd.hp.web.sample.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import com.yczd.hp.web.sample.daodata.User;

@Repository
@Scope("prototype")
public class UserDao implements IUserDao {

	@Resource
	NamedParameterJdbcOperations jdbcTemplate;

	//譬ｹ謐ｮid闔ｷ蜿勃ser蟇ｹ雎｡
	private static final String QUERY_SQL = "SELECT ID AS ID,USERNAME AS USERNAME,EMAIL AS EMAIL,PASSWORD AS PASSWORD FROM USER WHERE ID =:id";

	@Override
	public User selectByPrimaryKey(int id) {
		Map<String, Integer> paramMap = new HashMap<>();
		paramMap.put("id", id);

		return jdbcTemplate.queryForObject(QUERY_SQL, paramMap, this::mapSpitter);

	}

	private User mapSpitter(ResultSet rs, int row) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setUserName(rs.getString("USERNAME"));
		return user;

	}
}
