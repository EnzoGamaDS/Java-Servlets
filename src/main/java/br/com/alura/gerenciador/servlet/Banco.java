package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	//só guarda objetos do tipo Empresa simulando um banco
	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		lista.add(empresa);
	}
	public List<Empresa> getEmpresas(){
		return Banco.lista;//coloca o nome da classe ao inves de um this, pq ele é um objeto e não um atributo
	}
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> i = lista.iterator();
		
		while(i.hasNext()) {
			Empresa empresa = i.next();
			
			if (empresa.getId() == id) {
				i.remove();
			}
			
		}
		
	}

}
