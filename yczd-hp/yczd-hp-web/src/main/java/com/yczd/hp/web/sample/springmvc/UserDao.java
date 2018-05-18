package com.yczd.hp.web.sample.springmvc;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class UserDao implements IUserDao {

	@Autowired
	protected SqlSession sql_session;

	@Override
	public User selectByPrimaryKey(int id) {
		return sql_session.selectOne("com.yczd.hp.web.sample.springmvc.selectByPrimaryKey", id);

	}
}
