package gameArea;

import gameArea.business.concretes.CampaignManager;
import gameArea.business.concretes.GameManager;
import gameArea.business.concretes.SaleOperationManager;
import gameArea.business.concretes.UserManager;
import gameArea.core.concrete.MernisManager;
import gameArea.dataAccess.concretes.HibernateImpls.CampaignHibernateDao;
import gameArea.dataAccess.concretes.HibernateImpls.GameHibernateDao;
import gameArea.dataAccess.concretes.HibernateImpls.UserHibernateDao;
import gameArea.dataAccess.concretes.JDBCImpls.SaleOperationJDBCDao;
import gameArea.entities.concretes.Campaign;
import gameArea.entities.concretes.Game;
import gameArea.entities.concretes.SaleOperation;
import gameArea.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
			UserManager userManager=new UserManager(new UserHibernateDao(), new MernisManager());
			User user1=new User(1,"Çağrı","Güney",1998,"2333333333",150);
			User user2=new User(2,"Naci","Güney",1971,"2444444444",200);
			userManager.add(user1);
			userManager.add(user2);
			
			
			CampaignManager campaignManager=new CampaignManager(new CampaignHibernateDao());
			Campaign camp1=new Campaign(1,"Genc Kampanyasi",30,"Genclere yönelik kampanya");
			campaignManager.add(camp1);
			Campaign camp2=new Campaign();
			campaignManager.add(camp2);
			
			GameManager gameManager=new GameManager(new GameHibernateDao());
			Game game1=new Game(1,"Counter Strike",125,"Bir FPS Oyunu");
			gameManager.add(game1);
			Game game2=new Game(2,"FIFA 22",200,"Futbol oyunu");
			gameManager.add(game2);
			
			SaleOperationManager saleManager=new SaleOperationManager(new SaleOperationJDBCDao());
			SaleOperation sale=new SaleOperation(1,camp2,user1,game1);
			saleManager.purchase(sale);
			SaleOperation sale2=new SaleOperation(1,camp1,user2,game2);
			saleManager.purchase(sale2);
			SaleOperation sale3=new SaleOperation(3, camp2, user1, game1);
			saleManager.purchase(sale3);
			
			
		}
	
}
