package services;

import interfaces.FolhaDePagamentoService;

public class FolhaDePagamentoEstagioService implements FolhaDePagamentoService {

	@Override
	public Double calcularDescValeTransporte(Double salario) {

		Double descValeTransporte = salario * 0.06;
		Double valorMaximoDesconto = 100.0;
		
		if (descValeTransporte < valorMaximoDesconto)
			return descValeTransporte;
		else
			return valorMaximoDesconto;

	}

	@Override
	public Double calcularDescINSS(Double salario) {
		
		return salario * 0.02;
	}

	@Override
	public Double calcularSalarioLiquido(Double salario, Double valeTransporte, Double inss) {
		
		return salario - (valeTransporte + inss);
	}

}
