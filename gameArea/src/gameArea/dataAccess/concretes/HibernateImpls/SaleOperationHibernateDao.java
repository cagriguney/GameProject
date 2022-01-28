package gameArea.dataAccess.concretes.HibernateImpls;

import gameArea.dataAccess.abstracts.SaleOperationDao;
import gameArea.entities.concretes.SaleOperation;

public class SaleOperationHibernateDao implements SaleOperationDao{

	@Override
	public void add(SaleOperation sale) {
		System.out.println("The sale operation that has id "+sale.getId()+" is added to Hibernate");
		
	}

	@Override
	public void delete(SaleOperation sale) {
		System.out.println("The sale operation that has id "+sale.getId()+" is deleted from Hibernate");
		
	}

	@Override
	public void update(SaleOperation sale) {
		// TODO Auto-generated method stub
		
	}

}
