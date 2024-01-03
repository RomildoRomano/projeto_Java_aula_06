package services;

import interfaces.FolhaDePagamentoService;

public class FolhaDePagamentoCLTService implements FolhaDePagamentoService {

	@Override
	public Double calcularDescValeTransporte(Double salario) {

		return salario * 0.06;
	}

	@Override
	public Double calcularDescINSS(Double salario) {

		if (salario < 3000)
			return salario * 0.09;
		else if (salario >= 3000 && salario <= 6000)
			return salario * 0.10;
		else
			return salario * 0.11;

	}

	@Override
	public Double calcularSalarioLiquido(Double salario, Double valeTransporte, Double inss) {
		
		return salario - (valeTransporte + inss);
	
	}

}
