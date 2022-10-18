package joaovictor.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class NovoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, Integer> pessoas = new HashMap<String, Integer>();
	int id = 1;
       
    public NovoServlet() {
        super();
    }

	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setAttribute("pessoas", pessoas);
	    request.getRequestDispatcher("/WEB-INF/agenda.jsp").forward(request, response);
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n = request.getParameter("projeto");
		pessoas.put(n, id);
		id++;
	}

}
