package upei.database.mock;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import upei.domain.*;

public class SprintsMock {
	private List<Sprint> sprints;
	
	public SprintsMock() {
		sprints = new LinkedList<Sprint>();
		
		sprints.add(new Sprint("Sprint 05/01", LocalDate.now(), LocalDate.now().plusDays(5)));
		sprints.add(new Sprint("Sprint 05/02", LocalDate.now(), LocalDate.now().plusDays(10)));
		sprints.add(new Sprint("Sprint 05/03", LocalDate.now(), LocalDate.now().plusDays(45)));
	}
	
	public List<Sprint> obterSprints(){
		return this.sprints;
	}
}
