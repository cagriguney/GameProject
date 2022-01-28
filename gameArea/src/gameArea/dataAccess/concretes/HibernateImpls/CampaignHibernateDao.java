package gameArea.dataAccess.concretes.HibernateImpls;

import gameArea.dataAccess.abstracts.CampaignDao;
import gameArea.entities.concretes.Campaign;

public class CampaignHibernateDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" added to Hibernate");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" updated in Hibernate");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" deleted from Hibernate");
		
	}

}
