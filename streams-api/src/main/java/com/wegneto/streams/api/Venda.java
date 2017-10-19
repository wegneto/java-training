package com.wegneto.streams.api;

public class Venda {

	private double total;
	private FormaPagamento formaPagamento;
	
	public Venda(double total, FormaPagamento formaPagamento) {
		this.total = total;
		this.formaPagamento = formaPagamento;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
}