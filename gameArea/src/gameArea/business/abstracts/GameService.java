package gameArea.business.abstracts;

import gameArea.entities.concretes.Game;

public interface GameService {

	void add(Game game);
	void delete(Game game);
	void update(Game game);
	
}
