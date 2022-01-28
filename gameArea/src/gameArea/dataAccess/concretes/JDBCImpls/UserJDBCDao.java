package gameArea.dataAccess.concretes.JDBCImpls;

import gameArea.dataAccess.abstracts.UserDao;
import gameArea.entities.concretes.User;

public class UserJDBCDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("The user who has id "+user.getId()+" is added to JDBC");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("The user who has id "+user.getId()+" is deleted from JDBC");
		
	}

	@Override
	public void update(User user) {
		System.out.println("The user who has id "+user.getId()+" is updated in JDBC");
		
	}
	
}
