package entities;

import java.util.UUID;

import enums.TipoFuncionario;

public class Funcionario {

	private UUID id;
	private String nome;
	private String cpf;
	private String matricula;
	private Double salario;
	private TipoFuncionario tipo;
	private FolhaDePagamento folhaDePagamento;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(UUID id, String nome, String cpf, String matricula, Double salario, TipoFuncionario tipo,
			FolhaDePagamento folhaDePagamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
		this.tipo = tipo;
		this.folhaDePagamento = folhaDePagamento;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public TipoFuncionario getTipo() {
		return tipo;
	}

	public void setTipo(TipoFuncionario tipo) {
		this.tipo = tipo;
	}

	public FolhaDePagamento getFolhaDePagamento() {
		return folhaDePagamento;
	}

	public void setFolhaDePagamento(FolhaDePagamento folhaDePagamento) {
		this.folhaDePagamento = folhaDePagamento;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", matricula=" + matricula + ", salario="
				+ salario + ", tipo=" + tipo + ", folhaDePagamento=" + folhaDePagamento + "]";
	}

}
