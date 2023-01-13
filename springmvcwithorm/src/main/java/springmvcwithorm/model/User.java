package springmvcwithorm.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
public String userEmail; 

public String userName;
public String userPassword;
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
@Override
public String toString() {
	return "User [userEmail=" + userEmail + ", userName=" + userName + ", userPassword=" + userPassword + "]";
}

}
