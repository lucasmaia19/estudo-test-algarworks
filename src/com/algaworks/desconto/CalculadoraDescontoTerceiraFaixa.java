package com.algaworks.desconto;

public class CalculadoraDescontoTerceiraFaixa extends CalculadoraFaixaDesconto {

	public CalculadoraDescontoTerceiraFaixa(CalculadoraFaixaDesconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcular(double valorTotal) {
		if (valorTotal > 1000) 
			return valorTotal * 0.08;
		
		return -1;
	}

}
