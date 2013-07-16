import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;

public class ClientServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static List<Client> listapessoa = new ArrayList<Client>();

	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String nome = req.getParameter("nome");
		String sobreNome = req.getParameter("sobreNome");
		listapessoa.add(new Client(nome, sobreNome));
		//res.sendRedirect("cliente/CadastroOk.html");
		try {
		//	req.setAttribute("nome", nome);
			req.getRequestDispatcher("cliente/CadastroComSucesso.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
