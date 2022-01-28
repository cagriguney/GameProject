package gameArea.business.concretes;

import gameArea.business.abstracts.CampaignService;
import gameArea.dataAccess.abstracts.CampaignDao;
import gameArea.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	private CampaignDao cDao;
	
	//genel kampanya
	public CampaignManager(CampaignDao cDao) {
		super();
		this.cDao = cDao;
	}

	@Override
	public void add(Campaign campaign) {
		this.cDao.add(campaign);
	}

	@Override
	public void update(Campaign campaign) {
		this.cDao.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		this.cDao.delete(campaign);
		
	}

}
