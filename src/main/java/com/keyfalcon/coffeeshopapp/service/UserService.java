package com.keyfalcon.coffeeshopapp.service;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Service;

import com.keyfalcon.coffeeshopapp.dao.IUserDao;
import com.keyfalcon.coffeeshopapp.model.User;

public class UserService extends GenericManagerImpl<User,Long> implements IUserService{
	
	private IUserDao userDao;

	public UserService( IUserDao userDao ) {

		super( userDao );
		this.userDao = userDao;

	}

	public User getUserByEmailIdAndPassword(String emailId, String password) {
		
		return userDao.getUserByEmailIdAndPassword(emailId, password);
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
