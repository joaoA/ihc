package models;

import java.util.List;

import javax.persistence.*;

@Entity
public class Restaurante {
	private String nome;
	private int rating;
	private String descricao;
	private String horario;
	
	@OneToMany
	(mappedBy="restaurante", cascade=CascadeType.ALL)
	private List<Prato> pratos;
	
	@OneToMany
	(mappedBy="restaurante", cascade=CascadeType.ALL)
	private List<Favorito> favoritos;
	
	@OneToMany
	(mappedBy="restaurante", cascade=CascadeType.ALL)
	private List<Historico> historico;
	
	public Restaurante() {}

	public Restaurante(String nome, int rating, String descricao,
			String horario, List<Prato> pratos, List<Favorito> favoritos,
			List<Historico> historico) {
		super();
		this.nome = nome;
		this.rating = rating;
		this.descricao = descricao;
		this.horario = horario;
		this.pratos = pratos;
		this.favoritos = favoritos;
		this.historico = historico;
	}
	
	@Override
	public String toString() {
		return "Restaurante [nome=" + nome + ", rating=" + rating
				+ ", descricao=" + descricao + ", horario=" + horario
				+ ", pratos=" + pratos + ", favoritos=" + favoritos
				+ ", historico=" + historico + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public List<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(List<Prato> pratos) {
		this.pratos = pratos;
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
