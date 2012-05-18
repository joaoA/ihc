package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Historico {
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Restaurante rest;

	public Historico() {}

	public Historico(User user, Restaurante rest) {
		super();
		this.user = user;
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "Historico [user=" + user + ", rest=" + rest + "]";
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
