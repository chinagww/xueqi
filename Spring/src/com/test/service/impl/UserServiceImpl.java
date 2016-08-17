package com.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.test.service.UserService;


public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper mapper;
	
	public void save(User user) {
		// TODO Auto-generated method stub

	}

	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll() {
		List<User> findAllList = mapper.findAll();
		return findAllList;
	}

}
