package joaovictor.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NovoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<Integer, String> pessoas = new HashMap<Integer, String>();
	Map<Integer, String> emails = new HashMap<Integer, String>();
	Map<Integer, String> matriculas = new HashMap<Integer, String>();
	List<String> list = new ArrayList<>();
	int id = 1;

	public NovoServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String n = request.getParameter("pessoas");
		String a = request.getParameter("email");
		String b = request.getParameter("matricula");
			pessoas.put(id," " + n);
			emails.put(id," " + a);
			matriculas.put(id," " + b);
			id++;
			request.setAttribute("nome", pessoas);
			request.setAttribute("email", emails);
			request.setAttribute("matriculas", matriculas);
			request.setAttribute("name",list);
			list.add(n);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("./professores.jsp");
			requestDispatcher.forward(request, response);
			list.clear();
		}
	}

