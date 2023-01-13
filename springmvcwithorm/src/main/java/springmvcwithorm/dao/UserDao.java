package springmvcwithorm.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvcwithorm.model.User;

@Repository
public class UserDao {
	@Autowired
HibernateTemplate hibernateTemplate;
	@Transactional
	public int save(User user) {
		Integer i= (Integer) this.hibernateTemplate.save(user);
		 return i;
	}

}
