package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("cadastrando nova empresa");//mostra no terminal a ação realizada
		String nomeEmpresa = request.getParameter("nome");//captura o parametro nome da empresa na string nomeEmpresa
		String dataAbertuda = request.getParameter("data");
		
		Empresa empresa = new Empresa();//chama a classe empresa
		empresa.setNome(nomeEmpresa);//insere o nome da empresa no banco/lista
		empresa.setDataAbertura(dataAbertuda);;
		
		Banco banco = new Banco();//chama a classe banco
		banco.adiciona(empresa);//adiciona a empresa no banco de dados/lista
		
		//Chamando JSP
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
		rd.forward(request, response);
	}

}
