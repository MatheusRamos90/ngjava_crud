package br.com.matheusramos.NgJavaBackend.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.matheusramos.NgJavaBackend.entity.UserEntity;
import br.com.matheusramos.NgJavaBackend.http.User;
import br.com.matheusramos.NgJavaBackend.repository.UserRepository;

/**
 * Created by: Matheus Ramos - https://matheusramos.com/
 * */

@Path("/admin")
public class UserController {
	
	private final UserRepository userRepository = new UserRepository();
	
	/**
	 * User's Create
	 * */
	@POST
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public Object create(User user) {
		
		UserEntity entity = new UserEntity();
		
		try {
			
			entity.setName(user.getName());
			entity.setEmail(user.getEmail());
			entity.setGender(user.getGender());
			entity.setDate_created(user.getDate_created());
	
			userRepository.create(entity);
			
			return true;
			
		} catch (Exception e) {
			
			return e.getMessage();
			
		}
		
	}
	
	/**
	 * User's List
	 * */
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAll(){
		
		List<User> users = new ArrayList<User>();
		
		List<UserEntity> listUserEntity = userRepository.getAll();
		
		for(UserEntity entity : listUserEntity) {
			users.add(new User(entity.getId(),entity.getName(),entity.getEmail(),entity.getGender(),entity.getDate_created(),entity.getDate_updated()));
		}
		
		return users;
	}
	
	/**
	 * GetView User
	 * */
	@GET
	@Path("/users/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getViewUpdate(@PathParam("id") Integer id) {
		
		UserEntity entity = userRepository.getById(id);
		
		if(entity != null) {
			return new User(entity.getId(),entity.getName(),entity.getEmail(),entity.getGender(),entity.getDate_created(),entity.getDate_updated());
		}
		
		return null;	
		
	}	

	/**
	 * Update User
	 * */
	@PUT
	@Path("/users/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Object updateUser(@PathParam("id") Integer id, User user) {
		
		UserEntity entity = new UserEntity();
		
		try {
			entity.setId(id);
			entity.setName(user.getName());
			entity.setEmail(user.getEmail());
			entity.setGender(user.getGender());
			entity.setDate_created(user.getDate_created());
			entity.setDate_updated(user.getDate_updated());
			
			userRepository.updateUser(entity);
			
			return true;
			
		} catch (Exception e) {
			
			return e.getMessage();
			
		}
		
	}
	
	/**
	 * Delete User
	 * */
	@DELETE
	@Path("/users/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Object delete(@PathParam("id") Integer id) {
		try {
			
			userRepository.delete(id);
			
			return true;
			
		} catch (Exception e) {
			
			return e.getMessage();
		}
	}	
	
}
