package entities;

import java.util.UUID;

public class FolhaDePagamento {

	private UUID id;
	private Double descValeTransporte;
	private Double descINSS;
	private Double salarioLiquido;

	public FolhaDePagamento() {
		// TODO Auto-generated constructor stub
	}

	public FolhaDePagamento(UUID id, Double descValeTransporte, Double descINSS, Double salarioLiquido) {
		super();
		this.id = id;
		this.descValeTransporte = descValeTransporte;
		this.descINSS = descINSS;
		this.salarioLiquido = salarioLiquido;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Double getDescValeTransporte() {
		return descValeTransporte;
	}

	public void setDescValeTransporte(Double descValeTransporte) {
		this.descValeTransporte = descValeTransporte;
	}

	public Double getDescINSS() {
		return descINSS;
	}

	public void setDescINSS(Double descINSS) {
		this.descINSS = descINSS;
	}

	public Double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(Double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	@Override
	public String toString() {
		return "FolhaDePagamento [id=" + id + ", descValeTransporte=" + descValeTransporte + ", descINSS=" + descINSS
				+ ", salarioLiquido=" + salarioLiquido + "]";
	}

}
