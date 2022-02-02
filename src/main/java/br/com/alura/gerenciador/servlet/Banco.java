package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	//só guarda objetos do tipo Empresa simulando um banco
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("EE");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	public List<Empresa> getEmpresas(){
		return Banco.lista;//coloca o nome da classe ao inves de um this, pq ele é um objeto e não um atributo
	}

}
