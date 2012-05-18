package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Favorito {
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Restaurante rest;
	
	public Favorito() {}

	public Favorito(User user, Restaurante rest) {
		super();
		this.user = user;
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "Favorito [user=" + user + ", rest=" + rest + "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Restaurante getRest() {
		return rest;
	}

	public void setRest(Restaurante rest) {
		this.rest = rest;
	}
	
}
