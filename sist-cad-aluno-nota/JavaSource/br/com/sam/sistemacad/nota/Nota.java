package br.com.sam.sistemacad.nota;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

import br.com.sam.sistemacad.aluno.Aluno;
import br.com.sam.sistemacad.disciplina.Disciplina;


@Entity
@Table(name="nota")
public class Nota {

	@Id
	private float n1;
	private float n2;
	private float n3;
	private float n4;
	private float media;
	
	@ManyToOne
	@JoinColumn(name="mat_aluno", nullable=false)
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name="id_disciplina", nullable=false)
	private Disciplina disciplina;
	

	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float getN3() {
		return n3;
	}

	public void setN3(float n3) {
		this.n3 = n3;
	}

	public float getN4() {
		return n4;
	}

	public void setN4(float n4) {
		this.n4 = n4;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}
