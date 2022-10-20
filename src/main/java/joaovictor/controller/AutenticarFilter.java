package joaovictor.controller;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter({"/professores.jsp","/adicionar.jsp", "/sair.jsp", "/Novo"})
public class AutenticarFilter extends HttpFilter implements Filter {
    public AutenticarFilter() {
        super();
    }

	public void destroy() {

	}

   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       HttpServletRequest httpRequest = (HttpServletRequest) request; 
       HttpServletResponse httpResponse = (HttpServletResponse) response;
       Object usuario = httpRequest.getSession().getAttribute("usuario");
       if(usuario == null || !usuario.equals("Mario")) {
           httpResponse.sendRedirect("./index.jsp");
       }else {
           // passar a requisição adiante 
           chain.doFilter(request, response);
       }
   }

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
