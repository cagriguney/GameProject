package gameArea.dataAccess.abstracts;

import gameArea.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void delete(User user);
	void update(User user);
	
}
