package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io. PrintWriter;

@WebServlet(name="Usuario", urlPatterns= {"/Usuario"})
public class ControllerLogin extends HttpServlet{
	@Override
	public void doPost(	HttpServletRequest req,
						HttpServletResponse res){
		try{
			String id = req.getParameter("id");
			String senha = req.getParameter("senha");
			
			if(id.equals("eleitor") && senha.equals("eleitor"))
				res.sendRedirect("votacao.html");
			else if(id.equals("mesario") && senha.equals("mesario"))
				res.sendRedirect("menuMesario.html");
			else if(id.equals("chefe") && senha.equals("chefe"))
				res.sendRedirect("chefeSessao.html");
			else
				res.sendRedirect("index.html");
			
		} catch(Exception e){
			System.out.println("Tente Novamente");
		}
	}
}