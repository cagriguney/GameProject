package gameArea.dataAccess.concretes.HibernateImpls;

import gameArea.dataAccess.abstracts.GameDao;
import gameArea.entities.concretes.Game;

public class GameHibernateDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" added to Hibernate");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" deleted from Hibernate");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" updated in Hibernate");
		
	}

	
	
}
