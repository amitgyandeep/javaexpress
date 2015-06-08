package com.keyfalcon.coffeeshopapp.dao;

import org.appfuse.dao.GenericDao;

import com.keyfalcon.coffeeshopapp.model.User;

public interface IUserDao extends GenericDao<User,Long> {
	
	public User getUserByEmailIdAndPassword(String emailId,String password);

}
