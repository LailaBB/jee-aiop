package fr.polytech.todo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.polytech.todo.ToDo;
import fr.polytech.todo.dao.TodoDAO;

/**
 * Servlet implementation class TodoServlet
 */
@WebServlet("/TodoServlet")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private TodoDAO dao;
	
	static private int i = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setAttribute("task", dao.all());
		request.getRequestDispatcher("Todo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		ToDo task = new ToDo(i,request.getParameter("Name"),request.getParameter("Description"));
//		todos.add(i, task);
//		i++;
		ToDo todo = new ToDo();
		todo.setName(request.getParameter("Name"));
		todo.setDescription(request.getParameter("Description"));
		dao.create(todo);
		this.doGet(request, response);
		
	}

}
