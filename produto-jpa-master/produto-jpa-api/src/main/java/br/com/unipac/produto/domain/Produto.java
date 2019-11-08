package br.com.unipac.produto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produto")
public class Produto extends IDEntity {
	private static final long serialVersionUID = -5770418217559219573L;

	@NotNull
	@NotEmpty(message = "você digitou o nome do produto errado.")
	@Column(name = "nm_nome")
	private String nomeProduto;

	@Column(name = "ix_descricao")
	private String descricao;

	public Produto(@NotNull @NotEmpty(message = "você digitou o nome do produto errado.") String nomeProduto, String descricao) {
		super();
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getdescricao() {
		return descricao;
	}

	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}

}
