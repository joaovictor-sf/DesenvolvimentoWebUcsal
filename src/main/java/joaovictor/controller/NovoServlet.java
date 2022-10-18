package joaovictor.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NovoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<Integer, String> pessoas = new HashMap<Integer, String>();
	Map<Integer, String> emails = new HashMap<Integer, String>();
	Map<Integer, String> matriculas = new HashMap<Integer, String>();
	int id = 1;

	public NovoServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String n = request.getParameter("pessoas");
		String a = request.getParameter("email");
		String b = request.getParameter("matricula");
		if (pessoas.containsValue(n)) {
			request.setAttribute("nome", pessoas);
			request.setAttribute("email", emails);
			request.setAttribute("matriculas", matriculas);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("./professores.jsp");
			requestDispatcher.forward(request, response);
		} else {
			pessoas.put(id," " + n);
			emails.put(id," " + a);
			matriculas.put(id," " + b);
			id++;
			System.out.println(pessoas);
			System.out.println(emails);
			System.out.println(matriculas);
			request.setAttribute("nome", pessoas);
			request.setAttribute("email", emails);
			request.setAttribute("matriculas", matriculas);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("./professores.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
