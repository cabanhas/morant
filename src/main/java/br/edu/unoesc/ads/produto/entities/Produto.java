package br.edu.unoesc.ads.produto.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private BigDecimal idade;
	private String time;
	
	public Produto() { }

	public Produto(Long id, String nome, BigDecimal idade, String time) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.time = time;
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public BigDecimal getidade() { return idade; }
	public void setIdade(BigDecimal idade) { this.idade = idade; }

	public String getTime() { return time; }
	public void setTime(String time) { this.time = time; }
}
