package com.keyfalcon.coffeeshopapp.service;

import org.appfuse.service.GenericManager;

import com.keyfalcon.coffeeshopapp.model.User;

public interface IUserService extends GenericManager<User,Long>{
	
	public User getUserByEmailIdAndPassword(String emailId,String password);

}
