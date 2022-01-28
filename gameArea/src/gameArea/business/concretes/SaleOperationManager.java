package gameArea.business.concretes;

import gameArea.business.abstracts.SaleOperationService;
import gameArea.core.abstracts.MernisService;
import gameArea.dataAccess.abstracts.SaleOperationDao;
import gameArea.entities.concretes.Campaign;
import gameArea.entities.concretes.Game;
import gameArea.entities.concretes.SaleOperation;
import gameArea.entities.concretes.User;

public class SaleOperationManager implements SaleOperationService{

	private SaleOperationDao saleDao;
	private MernisService mernis;
	public SaleOperationManager(SaleOperationDao saleDao) {
		super();
		this.saleDao = saleDao;
	}

	public void purchase(SaleOperation sale) {
		 
		double newPrice=sale.getGame().getPrice()-sale.getCampaign().getDiscountRate();
		
			if(sale.getUser().getWallet()>=newPrice) {
			System.out.println(sale.getUser().getFirstName()+" adli kullanici "+sale.getGame().getName()+" adli oyunu "+newPrice+" odeyerek "
				+ "satin almistir.");
			sale.getUser().setWallet(sale.getUser().getWallet()-newPrice);
			System.out.println("Kalan bakiyeniz:"+sale.getUser().getWallet());
			
			}
			else {
			System.out.println("Bakiyeniz: "+sale.getUser().getWallet()+" Yetersiz Bakiye");
			}
	
	}
	
	@Override
	public void add(SaleOperation sale) {
		
		this.saleDao.add(sale);
		
	}

	@Override
	public void delete(SaleOperation sale) {
		this.saleDao.delete(sale);
		
	}

	@Override
	public void update(SaleOperation sale) {
		this.saleDao.update(sale);
		
	}

}
