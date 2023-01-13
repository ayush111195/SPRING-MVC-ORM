package springmvcwithorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvcwithorm.dao.UserDao;
import springmvcwithorm.model.User;

@Service
public class UserService {
    @Autowired
	private UserDao userDao;
	public int creatUser(User user) {
		return this.userDao.save(user);
		
	}
}
