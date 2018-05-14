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
		
		makeUrlRouter();
	}
	
	private void makeUrlRouter() {
		String urlPath = request.getPath().toString();
		
		if(urlPath.contains("/api/sprint")) {
			routerForSprintAPI(urlPath);
		}
	}
	
	private void  routerForSprintAPI(String urlPath) {
		SprintsAPI sprintAPI = new SprintsAPI(request, response);
		
		switch(urlPath) {
			case "/api/sprint/ultimaSprint":
				sprintAPI.obterUltimaSprintAtiva();
				break;
		}
		
	}

}
