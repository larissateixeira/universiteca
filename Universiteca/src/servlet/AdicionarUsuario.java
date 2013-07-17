package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import dao.BancoUsuarios;

public class AdicionarUsuario extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		Usuario usuario = new Usuario();
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String senha = request.getParameter("senha");
		
		usuario.setNome(nome);
		usuario.setCpf(cpf);
		usuario.setSenha(senha);
		BancoUsuarios.add(usuario);
		
		request.setAttribute("usuarios", BancoUsuarios.list());
		RequestDispatcher rd = request.getRequestDispatcher("/listadeusuarios.jsp");
		rd.forward(request, response);
		
		
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
		service(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
		service(req, res);
	}
}
