package repositories;

import java.io.PrintWriter;

import entities.Funcionario;
import interfaces.GenericRepository;

public class FuncionarioRepository implements GenericRepository<Funcionario> {

	@Override
	public void exportar(Funcionario obj) throws Exception {

		PrintWriter printWriter = new PrintWriter("c:\\temp\\funcionario_" + obj.getId() + ".txt");
		printWriter.write("\nID DO FUNCIONÁRIO.......: " + obj.getId());
		printWriter.write("\nNOME....................: " + obj.getNome());
		printWriter.write("\nCPF.....................: " + obj.getCpf());
		printWriter.write("\nMATRICULA...............: " + obj.getMatricula());
		printWriter.write("\nTIPO....................: " + obj.getTipo());
		printWriter.write("\nSALARIO BASE............: " + obj.getSalario());
		printWriter.write("\nDESC DE VALE TRANSPORTE.: " + obj.getFolhaDePagamento().getDescValeTransporte());
		printWriter.write("\nDESC DE INSS............: " + obj.getFolhaDePagamento().getDescINSS());
		printWriter.write("\nSALÁRIO LIQUIDO.........: " + obj.getFolhaDePagamento().getSalarioLiquido());
		printWriter.flush();
		printWriter.close();
	}

}
