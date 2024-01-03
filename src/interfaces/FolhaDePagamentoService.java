package interfaces;

public interface FolhaDePagamentoService {

	Double calcularDescValeTransporte(Double salario);

	Double calcularDescINSS(Double salario);

	Double calcularSalarioLiquido(Double salario, Double valeTransporte, Double inss);
}
