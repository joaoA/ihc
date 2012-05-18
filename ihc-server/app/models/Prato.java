package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Prato {
	private String nome;
	private double preco;
	
	@ManyToOne
	private Restaurante rest;

	public Prato() {}

	public Prato(String nome, double preco, Restaurante rest) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "Prato [nome=" + nome + ", preco=" + preco + ", rest=" + rest
				+ "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Restaurante getRest() {
		return rest;
	}

	public void setRest(Restaurante rest) {
		this.rest = rest;
	}
	
}
