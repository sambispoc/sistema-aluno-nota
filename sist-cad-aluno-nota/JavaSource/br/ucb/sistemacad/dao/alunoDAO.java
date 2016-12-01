package br.ucb.sistemacad.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class alunoDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("sistemacad");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(p1);
	em.getTransaction().commit();		
	em.close();
	emf.close();
	System.out.println("Aluno Cadastrado!");
	
	

}
