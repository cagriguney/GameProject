package gameArea.dataAccess.abstracts;

import gameArea.entities.concretes.SaleOperation;

public interface SaleOperationDao {

	void add(SaleOperation sale);
	void delete(SaleOperation sale);
	void update(SaleOperation sale);
	
}
