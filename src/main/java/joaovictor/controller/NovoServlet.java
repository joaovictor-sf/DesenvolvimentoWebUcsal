package joaovictor.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class NovoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<String> pessoas = new ArrayList<>();
	List<String> emails = new ArrayList<>();
	List<String> matriculas = new ArrayList<>();
	List<String> list = new ArrayList<>();

	public NovoServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String n = request.getParameter("pessoas");
		String a = request.getParameter("email");
		String b = request.getParameter("matricula");
		pessoas.add(n);
		emails.add(a);
		matriculas.add(b);
		request.setAttribute("nome", pessoas);
		request.setAttribute("email", emails);
		request.setAttribute("matriculas", matriculas);
		request.setAttribute("name", list);
		list.add(n);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("./professores.jsp");
		requestDispatcher.forward(request, response);
		list.clear();

	}
}
