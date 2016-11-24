package br.com.sam.sistemacad.test;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import br.com.sam.sistemacad.HibernateUtil;
import br.com.sam.sistemacad.aluno.Aluno;

public class AlunoTest {

	private Session sessao;
	private Transaction transacao;
	
	
	public void abreConexao(){
		this.sessao = HibernateUtil.getSession().getCurrentSession();
		this.transacao = this.sessao.beginTransaction();
	}
	
	public void fechaConexao(){
		this.transacao.commit();
		
		try {
			if (this.sessao.isOpen()){
				this.sessao.close();
			}
		} catch (Exception e) {
			System.out.println("Problema no fechamento da conexao: " + e.getMessage());
		}
	}
	
	@Test
	public void salvarAlunoTest(){
		Aluno a1 = new Aluno();
		a1.setNome_aluno("Nome Aluno");
		
		abreConexao();
		this.sessao.save(a1);
		fechaConexao();
		
		assertNull(null);
	}
	
	
	
}
