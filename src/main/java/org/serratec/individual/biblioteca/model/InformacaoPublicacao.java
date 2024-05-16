package org.serratec.individual.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class InformacaoPublicacao {
	
	@Column
	@NotBlank(message = "Preencha o nome do autor")
	@Size(max = 50)
	private String autor;
	
	
	@NotBlank(message = "Preencha a data da publicação")
	@Size(max = 50)
	@Column
	private String publicacao;
	
	@Column
	private String editora;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(String publicacao) {
		this.publicacao = publicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	

}
