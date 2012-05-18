package models;

import java.util.List;

import javax.persistence.*;

@Entity
public class User {
	private String nome;
	private String email;
	private String password;
	
	@OneToMany
	(mappedBy="user", cascade=CascadeType.ALL)
	private List<Favorito> favoritos;
	
	@OneToMany
	(mappedBy="user", cascade=CascadeType.ALL)
	private List<Historico> historico;
	
	public User() {}

	public User(String nome, String email, String password,
			List<Favorito> favoritos, List<Historico> historico) {
		super();
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.favoritos = favoritos;
		this.historico = historico;
	}

	@Override
	public String toString() {
		return "User [nome=" + nome + ", email=" + email + ", password="
				+ password + ", favoritos=" + favoritos + ", historico="
				+ historico + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Favorito> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(List<Favorito> favoritos) {
		this.favoritos = favoritos;
	}

	public List<Historico> getHistorico() {
		return historico;
	}

	public void setHistorico(List<Historico> historico) {
		this.historico = historico;
	}
	
}
