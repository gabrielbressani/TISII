package upei.database.mock;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import upei.domain.*;

public class SprintsMock {
	private static List<Sprint> sprints;
	private static SprintsMock instance;
	
	public static SprintsMock getInstance() {
		if (instance == null) {
			instance = new SprintsMock();
		}
		
		return instance;
	}
	
	private SprintsMock() {
		sprints = new LinkedList<Sprint>();
		
		Sprint sprint = this.criarSprintMock();
		
		sprints.add(sprint);
	}
	
	private Sprint criarSprintMock() {
		Sprint sprint = new Sprint(1,"Sprint 05/01", "Iniciado", LocalDate.now(), LocalDate.now().plusDays(5));
		Parents parents = new Parents("Amilton");
		Child child = new Child("Junior", 10);
		
		Task task1 = new Task(
			1, "Iniciada", "Arrumar o quarto", "Nao deixar toalha molhada em cima da cama", 3, parents, child
		);
		
		Task task2 = new Task(
			2, "Iniciada", "Escovar os dentes", "", 5, parents, child
		);
		
		Task task3 = new Task(
			3, "Iniciada", "Fazer exercicios de casa", "Lembrar de enviar uma foto", 5, parents, child
		);
	
		sprint.addTasks(task1);
		sprint.addTasks(task2);
		sprint.addTasks(task3);
			
		
		return sprint;
	}
	
	public List<Sprint> obterSprints(){
		return sprints;
	}
	
	public void addSprint(Sprint sprint) {
		sprints.add(sprint);
	}
	
	public static Sprint getByKey(int key) {
		return (Sprint) sprints.stream().filter(s -> s.getKey() == key);
	}
}
