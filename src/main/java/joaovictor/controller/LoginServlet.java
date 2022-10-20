package joaovictor.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");	
		String senha = request.getParameter("senha");
		
		if(usuario.equals("Mario") && senha.equals("mario10")){
			request.getSession().setAttribute("usuario", usuario);
			response.sendRedirect("./professores.jsp");
		}else{
			String mensagem = "usuario ou senha incorretos!";
			request.setAttribute("erro", mensagem);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("./index.jsp");			
			requestDispatcher.forward(request, response);
		}
	}

}
