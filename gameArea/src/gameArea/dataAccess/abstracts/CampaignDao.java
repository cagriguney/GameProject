package gameArea.dataAccess.abstracts;

import gameArea.entities.concretes.Campaign;

public interface CampaignDao {
	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	
}
