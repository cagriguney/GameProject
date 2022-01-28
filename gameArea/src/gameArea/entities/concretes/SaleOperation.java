package gameArea.entities.concretes;

import gameArea.entities.abstracts.Entity;

public class SaleOperation implements Entity{

	private int id;
	private Campaign campaign;
	private User user;
	private Game game;
	
	public SaleOperation() {
		super();
	}
	public SaleOperation(int id, Campaign campaign, User user, Game game) {
		super();
		this.id = id;
		this.campaign = campaign;
		this.user = user;
		this.game = game;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	
	
	
}
