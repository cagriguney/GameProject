package gameArea.dataAccess.concretes.HibernateImpls;

import gameArea.dataAccess.abstracts.UserDao;
import gameArea.entities.concretes.User;

public class UserHibernateDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("The user who has id "+user.getId()+" is added to Hibernate");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("The user who has id "+user.getId()+" is deleted from Hibernate");
		
	}

	@Override
	public void update(User user) {
		System.out.println("The user who has id "+user.getId()+" is updated in Hibernate");
		
	}

}
