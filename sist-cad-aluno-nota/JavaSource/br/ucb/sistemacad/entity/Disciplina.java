package br.ucb.sistemacad.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")
public class Disciplina {
	
	@Id
	@GeneratedValue
	private Integer id_disciplina;
	private String desc_disciplina;
	
	
	public Integer getId_disciplina() {
		return id_disciplina;
	}
	public void setId_disciplina(Integer id_disciplina) {
		this.id_disciplina = id_disciplina;
	}
	public String getDesc_disciplina() {
		return desc_disciplina;
	}
	public void setDesc_disciplina(String desc_disciplina) {
		this.desc_disciplina = desc_disciplina;
	}
	
}