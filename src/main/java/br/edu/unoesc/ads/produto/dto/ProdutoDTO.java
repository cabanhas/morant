package br.edu.unoesc.ads.produto.dto;

import java.math.BigDecimal;
import br.edu.unoesc.ads.produto.entities.Produto;

public class ProdutoDTO {
	private Long id;
	private String nome;
	private BigDecimal idade;
	private String time;
	
	public ProdutoDTO() { }

	public ProdutoDTO(Produto produto) {
		this.id = produto.getId();
		this.nome = produto.getNome();
		this.idade = produto.getidade();
		this.time = produto.getTime();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public BigDecimal getIdade() { return idade; }
	public void setIdade(BigDecimal idade) { this.idade= idade; }

	public String getTime() { return time; }
	public void setTime(String time) { this.time = time; }
}
