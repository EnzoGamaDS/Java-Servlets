package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	
	private Integer id ;
	private String nome;
	private String dataAbertura;
	
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
