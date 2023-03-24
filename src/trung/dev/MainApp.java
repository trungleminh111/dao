package trung.dev;

import trung.dev.dao.UserDao;
import trung.dev.dao.impl.UserDaoImpl;
import trung.dev.dao.model.User;

public class MainApp {
	public static void main(String[] args) {
		
		UserDao userDao = new UserDaoImpl();
		User user = new User("phongBao@gmail.com", "123456", "nhot");
		userDao.insert(user);
	}

}
