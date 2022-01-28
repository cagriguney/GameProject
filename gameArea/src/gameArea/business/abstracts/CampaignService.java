package gameArea.business.abstracts;

import gameArea.entities.concretes.Campaign;

public interface CampaignService {

	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	
}
