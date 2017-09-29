package br.com.fiap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@SequenceGenerator(sequenceName="SEQ_T_TIPO",name="seqTipo",allocationSize=1)
public class Tipo {

	@Id
	@GeneratedValue(generator="seqTipo",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@NotBlank
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDescricao();
	}
}
