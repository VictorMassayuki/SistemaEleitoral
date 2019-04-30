package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;


@WebServlet(name = "Votar", urlPatterns = { "/Votar" })
public class ControllerVotacao extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.sendRedirect("index.html");
		} catch (Exception e) {
			System.out.println("Tente Novamente");
		}
	}
}