package upei.webserver;
import upei.api.*;

import org.simpleframework.http.Request;
import org.simpleframework.http.Response;
import org.simpleframework.http.core.Container;

public class RouteConfig  implements Container {

	private Request request;
	private Response response;
	
	@Override
	public void handle(Request request, Response response) {
		this.request = request;
		this.response = response;
		
		String path = request.getPath().getPath();

		if (path.startsWith("/api/sprint"))
			mapper(new SprintsAPI(this.response));	
	}
	
	public void mapper(IHTTPController controller) {
		String httpMethod = request.getMethod();
		
		if (httpMethod.equals("POST"))
			controller.post(request.getQuery());
		else
			controller.get();
	}
}
