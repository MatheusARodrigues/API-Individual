package org.serratec.individual.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Livros")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	
	@Column
	@NotBlank(message = "Preencha o título do livro")
	@Size(max = 50)
	private String titulo;
	
	@Embedded
	private InformacaoPublicacao informacaoPublicacao;


	public InformacaoPublicacao getInformacaoPublicacao() {
		return informacaoPublicacao;
	}


	public void setInformacaoPublicacao(InformacaoPublicacao informacaoPublicacao) {
		this.informacaoPublicacao = informacaoPublicacao;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	

}
