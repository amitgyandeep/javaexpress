package com.keyfalcon.coffeeshopapp.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.keyfalcon.coffeeshopapp.model.User;
import com.keyfalcon.coffeeshopapp.response.Status;
import com.keyfalcon.coffeeshopapp.service.UserService;

@Component
@Path("/loginservice")
public class LoginWebService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginWebService.class);

	@Autowired
	private UserService userService;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/login")
	public Response signIn( User user ) {
		
		LOGGER.info("Inside signIn method of User Controller");
		
		Status status = new Status();
		try
		{
			if(user != null && user.getEmailId() != null && user.getPassword() != null)
			{
				User userFromDB = userService.getUserByEmailIdAndPassword(user.getEmailId().trim(), user.getPassword().trim());
				if(userFromDB != null)
				{
					status.setCode(200);
					status.setMessage("Logged in Successfully!");
				}else{
					status.setCode(403);
					status.setMessage("Invalid User");
				}
			}else{
				status.setCode(400);
				status.setMessage("Invalid Parameters");
			}
		}catch(Exception e)
		{
			LOGGER.error("Error Occured in signIn Method of User Controller "+e.getMessage());
		}
		
		return Response.status( 200 ).entity( status ).build();

	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}