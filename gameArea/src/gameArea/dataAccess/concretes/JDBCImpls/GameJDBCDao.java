package gameArea.dataAccess.concretes.JDBCImpls;

import gameArea.dataAccess.abstracts.GameDao;
import gameArea.entities.concretes.Game;

public class GameJDBCDao implements GameDao{
	
	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" added to JDBC");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" deleted from JDBC");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" updated in JDBC");
		
	}
}
