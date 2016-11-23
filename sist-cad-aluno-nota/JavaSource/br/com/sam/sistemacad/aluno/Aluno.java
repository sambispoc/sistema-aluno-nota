package br.com.sam.sistemacad.aluno;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {
	
	@Id
	@GeneratedValue
	private Integer mat_aluno;
	private String nome_aluno;
	
	public Integer getMat_aluno() {
		return mat_aluno;
	}
	public void setMat_aluno(Integer mat_aluno) {
		this.mat_aluno = mat_aluno;
	}
	public String getNome_aluno() {
		return nome_aluno;
	}
	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

}
