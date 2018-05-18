package com.yczd.hp.web.sample.springmvc;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int id) {
		return this.userDao.selectByPrimaryKey(id);

	}

}
