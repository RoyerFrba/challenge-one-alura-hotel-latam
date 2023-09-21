package conection.controller;

import conection.dao.HuespedDao;
import conection.dao.UserDao;
import conection.factory.ConnectionFactory;
import conection.modelos.Huesped;
import conection.modelos.User;

public class UserController {

	UserDao userDao;
	public UserController() {	
		this.userDao=new UserDao(new ConnectionFactory().conectar());
	}
	
	public Boolean login(User user) {
		return userDao.login(user)!= null;
		
	}

}
