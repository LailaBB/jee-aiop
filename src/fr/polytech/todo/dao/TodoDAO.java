package fr.polytech.todo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.polytech.todo.ToDo;

@Stateless
public class TodoDAO {

	@PersistenceContext(name="MyPU")
	private EntityManager em;
	
	public void create(ToDo todo){
		em.persist(todo);
	}
	
	public List<ToDo> all(){
		return new ArrayList<ToDo>();
	}
}
