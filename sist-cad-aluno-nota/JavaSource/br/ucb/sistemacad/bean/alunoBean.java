package br.ucb.sistemacad.bean;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.hibernate.service.spi.InjectService;


@ManagedBean(name="alunoBean")
@RequestScoped
public class alunoBean implements Serializable {
	
	@InjectService
	private Aluno aluno;
	
	

}
