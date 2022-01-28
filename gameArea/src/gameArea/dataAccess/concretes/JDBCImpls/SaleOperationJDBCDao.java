package gameArea.dataAccess.concretes.JDBCImpls;

import gameArea.dataAccess.abstracts.SaleOperationDao;
import gameArea.entities.concretes.SaleOperation;

public class SaleOperationJDBCDao implements SaleOperationDao{

	@Override
	public void add(SaleOperation sale) {
		System.out.println("The sale operation that has id "+sale.getId()+" is added to JDBC");
		
	}

	@Override
	public void delete(SaleOperation sale) {
		System.out.println("The sale operation that has id "+sale.getId()+" is deleted from JDBC");
		
	}

	@Override
	public void update(SaleOperation sale) {
		// TODO Auto-generated method stub
		
	}
	
}
