package gameArea.dataAccess.abstracts;

import gameArea.entities.concretes.Game;

public interface GameDao {

	void add(Game game);
	void delete(Game game);
	void update(Game game);
	
}
