package gameArea.core.concrete;
import gameArea.core.abstracts.MernisService;
import gameArea.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements MernisService{

	@Override
	public boolean checkPersonOrNot(User user) {
		
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
		
		try {
			
			return proxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getBirthYear());
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
