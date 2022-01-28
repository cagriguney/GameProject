package gameArea.business.concretes;

import gameArea.business.abstracts.GameService;
import gameArea.dataAccess.abstracts.GameDao;
import gameArea.entities.concretes.Game;

public class GameManager implements GameService{

	private GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		this.gameDao.add(game);
		
	}

	@Override
	public void delete(Game game) {
		this.gameDao.delete(game);
		
	}

	@Override
	public void update(Game game) {
		this.gameDao.update(game);
		
	}

}
