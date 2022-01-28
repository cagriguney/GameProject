package gameArea.business.concretes;

import gameArea.business.abstracts.UserService;
import gameArea.core.abstracts.MernisService;
import gameArea.dataAccess.abstracts.UserDao;
import gameArea.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao gamer;
	private MernisService mernis;
	public UserManager(UserDao gamer, MernisService mernis) {
		super();
		this.gamer = gamer;
		this.mernis = mernis;
	}
	@Override
	public void add(User user) {
		if(mernis.checkPersonOrNot(user)) {
			this.gamer.add(user);
		}
		else {
			System.out.println("Kisi bilgileriniz yanlis,kontrol ediniz.");
		}
	}

	@Override
	public void delete(User user) {
		this.gamer.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.gamer.update(user);
		
	}

}
