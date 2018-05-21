package upei.api;
import  upei.database.mock.*;

import org.simpleframework.http.Query;
import org.simpleframework.http.Response;

public class SprintsAPI extends BaseAPI{
	private SprintsMock mock;
	
	public SprintsAPI(Response response) {
		super(response);
		this.mock = new SprintsMock();
	}

	public void get() {
		this.returnSuccessJson(this.mock.obterSprints());
	}
	
	public void post(Query query) {
		this.returnSuccessJson(query);
	}
}