package upei.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sprint {
	private int Key;
	private String Nome;
	private String Estado;
	private LocalDate DataDeInicio;
	private LocalDate DataDeFim;
	private List<Task> Tasks;
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	public Sprint(int key, String nome, String estado, LocalDate dataDeInicio, LocalDate dataDeFim) {
		this.Key = key;
		this.Nome = nome;
		this.Estado = estado;
		this.setDataDeInicio(dataDeInicio);
		this.setDataDeFim(dataDeFim);
		
		this.Tasks = new ArrayList<Task>();
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

	public List<Task> getTasks() {
		return Tasks;
	}

	public void addTasks(Task task) {
		this.Tasks.add(task);
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public int getKey() {
		return Key;
	}

	public void setKey(int key) {
		Key = key;
	}
}
