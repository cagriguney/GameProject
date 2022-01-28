package gameArea.business.abstracts;

import gameArea.entities.concretes.SaleOperation;

public interface SaleOperationService {

	void add(SaleOperation sale);
	void delete(SaleOperation sale);
	void update(SaleOperation sale);
}
