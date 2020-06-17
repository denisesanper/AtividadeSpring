package com.biblioteca.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_livros")
public class Livros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_livro;
	
	@NotNull
	@Size(min=1,max=200)
	private String titulo;
	
	@NotNull
	private int paginas;
	
	@NotNull
	@Size(min=1,max=200)
	private String autor;

	public long getId_livro() {
		return id_livro;
	}

	public void setId_livro(long id_livro) {
		this.id_livro = id_livro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
