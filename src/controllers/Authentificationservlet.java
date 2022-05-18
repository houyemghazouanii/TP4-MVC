package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.AuthentificationBean;

/**
 * Servlet implementation class Authentificationservlet
 */
@WebServlet("/Authentificationservlet")
public class Authentificationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authentificationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session= request.getSession();
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		if(session.getAttribute("auth") == null){
			AuthentificationBean auth = new AuthentificationBean();
			auth.setNom(nom); 
			auth.setPrenom(prenom);
			session.setAttribute("auth", auth);
		}
	        RequestDispatcher dispInf= request.getRequestDispatcher("Authentification.jsp");
			dispInf.forward(request, response);
	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
