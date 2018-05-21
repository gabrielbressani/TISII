package upei.domain;

import java.time.LocalDate;

public class Sprint {
	private String Nome;
	private LocalDate DataDeInicio;
	private LocalDate DataDeFim;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	public Sprint(String nome, LocalDate dataDeInicio, LocalDate dataDeFim) {
		this.Nome = nome;
		this.setDataDeInicio(dataDeInicio);
		this.setDataDeFim(dataDeFim);
	}

	public LocalDate getDataDeInicio() {
		return DataDeInicio;
	}

	public void setDataDeInicio(LocalDate dataDeInicio) {
		DataDeInicio = dataDeInicio;
	}

	public LocalDate getDataDeFim() {
		return DataDeFim;
	}

	public void setDataDeFim(LocalDate dataDeFim) {
		DataDeFim = dataDeFim;
	}
}
