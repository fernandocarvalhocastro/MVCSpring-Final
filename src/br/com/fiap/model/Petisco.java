package br.com.fiap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@SequenceGenerator(name="seqPet",sequenceName="SQ_PETISCO",allocationSize=1)
public class Petisco {

	@Id
	@GeneratedValue(generator="seqPet",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@NotBlank
	@Size(min=2, max=150)
	private String nome;
	
	@DecimalMin("0")
	private float valor;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
