package br.com.fiap.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@SequenceGenerator(name="seqCerveja",sequenceName="SQ_CERVEJA",allocationSize=1)
public class Cerveja {

	@Id
	@GeneratedValue(generator="seqCerveja",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@NotBlank
	@Size(max=100)
	private String nome;
	
	@DecimalMin("0")
	private float preco;
	
	@ManyToOne
	private Tipo tipo;
	
	
	private Fermentacao fermentacao;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar fabricacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Calendar fabricacao) {
		this.fabricacao = fabricacao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Fermentacao getFermentacao() {
		return fermentacao;
	}

	public void setFermentacao(Fermentacao fermentacao) {
		this.fermentacao = fermentacao;
	}
	
}
