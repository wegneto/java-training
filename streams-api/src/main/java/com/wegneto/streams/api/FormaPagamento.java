package com.wegneto.streams.api;

public enum FormaPagamento {
	
	CARTAO("Cartão"),
	DINHEIRO("dinheiro");
	
	private String descricao;
	
	private FormaPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
