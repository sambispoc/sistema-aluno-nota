package br.ucb.sistemacad.test;

import static org.junit.Assert.*;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ucb.sistemacad.HibernateUtil;
import br.ucb.sistemacad.entity.Aluno;

public class AlunoTest {

	private Session sessao;
	private Transaction transacao;
	
	@BeforeClass
	public void abreConexao(){
		this.sessao = HibernateUtil.getSession().getCurrentSession();
		this.transacao = this.sessao.beginTransaction();
	}
	
	@AfterClass
	public void fechaConexao(){
		
		try {

			this.transacao.commit();
		} catch (Throwable e) {
			System.out.println("Problema no commit: " + e.getMessage());
		} finally {
			try {
				if (this.sessao.isOpen()){
					this.sessao.close();
				}
			} catch (Exception e2) {
				System.out.println("Deu erro no fechamento da sessão: " + e2.getMessage());
			}
			
		}
	}
	
	@Before
	public void setup(){
		Aluno a1 = new Aluno ("Lucas");
		Aluno a2 = new Aluno ("Marcos");
		Aluno a3 = new Aluno ("Mateus");
		Aluno a4 = new Aluno ("João");
		Aluno a5 = new Aluno ("Maria");
		
		sessao.save(a1);
		sessao.save(a2);
		sessao.save(a3);
		sessao.save(a4);
		sessao.save(a5);
	}
	
	
	
	
	
	
	@Test
	public void salvarAlunoTest(){
		
		/*String sql = "from Aluno a";
		Query consulta = sessao.createQuery(sql);*/
		
		Aluno a1 = new Aluno();
		a1.setNome_aluno("Nome Aluno");
		
		this.sessao.save(a1);
		
		assertNull(null);
		
	}
	
	
	
}
