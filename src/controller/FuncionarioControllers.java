package controller;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.FolhaDePagamento;
import entities.Funcionario;
import enums.TipoFuncionario;
import interfaces.FolhaDePagamentoService;
import repositories.FuncionarioRepository;
import services.FolhaDePagamentoCLTService;
import services.FolhaDePagamentoEstagioService;

public class FuncionarioControllers {

	public void cadastrarFuncionario() {

		try {

			Funcionario funcionario = new Funcionario();

			funcionario.setId(UUID.randomUUID());
			funcionario.setNome(JOptionPane.showInputDialog("DIGITE O NOME :"));
			funcionario.setCpf(JOptionPane.showInputDialog("DIGITE O CPF :"));
			funcionario.setMatricula(JOptionPane.showInputDialog("DIGITE A MATRICULA :"));
			funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("DIGITE O SALARIO :")));

			Integer tipo = Integer.parseInt(JOptionPane.showInputDialog("DIGITE [ 1 ] CLT OU [ 2 ] ESTAGIO :"));
			FolhaDePagamentoService folhaDePagamentoService = null;
			switch (tipo) {
			case 1:
				funcionario.setTipo(TipoFuncionario.CLT);
				folhaDePagamentoService = new FolhaDePagamentoCLTService();
				break;

			case 2:
				funcionario.setTipo(TipoFuncionario.ESTAGIO);
				folhaDePagamentoService = new FolhaDePagamentoEstagioService();
				break;

			default:
				throw new IllegalArgumentException("Tipo de funcionario invalido");
			}

			FolhaDePagamento folha = new FolhaDePagamento();
			folha.setId(UUID.randomUUID());
			folha.setDescValeTransporte(folhaDePagamentoService.calcularDescValeTransporte(funcionario.getSalario()));
			folha.setDescINSS(folhaDePagamentoService.calcularDescINSS(funcionario.getSalario()));
			folha.setSalarioLiquido(folhaDePagamentoService.calcularSalarioLiquido(funcionario.getSalario(),
					folha.getDescValeTransporte(), folha.getDescINSS()));
			funcionario.setFolhaDePagamento(folha);
		
			// exportar para txt
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportar(funcionario);

			System.out.println(" Funcionario Cadastrado com sucesso");
            System.out.println(funcionario.toString());
            
            
		} catch (IllegalArgumentException e) {
			System.out.println("Erro de validação");
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println(" Falha ao cadastrar funcionario");
			System.out.println(e.getMessage());

		}

	}

}
