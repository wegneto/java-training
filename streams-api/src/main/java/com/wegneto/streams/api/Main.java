package com.wegneto.streams.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Venda> vendas = new ArrayList<Venda>() {
			{
				add(new Venda(234, FormaPagamento.CARTAO));
				add(new Venda(99.5, FormaPagamento.CARTAO));
				add(new Venda(101.2, FormaPagamento.DINHEIRO));
				add(new Venda(43.89, FormaPagamento.CARTAO));
			}
		};

		vendas.stream()
				.filter(v -> v.getFormaPagamento() == FormaPagamento.CARTAO)
				.sorted(Comparator.comparing(Venda::getTotal))
				.map(Venda::getTotal)
				.forEach(System.out::println);
	}

}
