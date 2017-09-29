package br.com.fiap.model;

public enum Fermentacao {
	
	ALTA("Alta"),BAIXA("Baixa"),NATURAL("Natural");
	
	private final String label;

	private Fermentacao(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getLabel();
	}
}
