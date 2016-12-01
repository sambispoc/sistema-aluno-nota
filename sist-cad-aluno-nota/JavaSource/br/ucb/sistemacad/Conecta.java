package br.ucb.sistemacad;

import org.hibernate.Session;


public class Conecta {
	public static void main(String[] args) {
		Session sessao = null;
		try {
			sessao = HibernateUtil.getSession().openSession();
			System.out.println("Conectou!");
		} finally {
			sessao.close();
			System.out.println("Fechou a conexão!");
		}
	}
}