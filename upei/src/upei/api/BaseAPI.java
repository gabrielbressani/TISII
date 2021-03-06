package upei.api;

import java.io.PrintStream;
import org.simpleframework.http.Response;
import org.simpleframework.http.Status;
import com.google.gson.Gson;
import upei.webserver.IHTTPController;

public abstract class BaseAPI implements IHTTPController {
	private Response response;
		
	public BaseAPI(Response response) {
		this.response = response;
	}

	protected void returnSuccessJson(Object object){
		Gson gson = new Gson();
		configureResponse(Status.OK, gson.toJson(object));
	}
	
	protected void returnFailJson(){
		configureResponse(Status.BAD_REQUEST, "{\"Fail\": true}");
	}
	
	private void configureResponse(Status status, String json) 
	{
		try {
			PrintStream body = this.response.getPrintStream();

			this.response.setValue("Content-Type", "application/json");
			this.response.setValue("Server", "TIS II");
			this.response.setDate("Date", System.currentTimeMillis());
			this.response.setDate("Last-Modified", System.currentTimeMillis());
			this.response.setStatus(status);
				
			body.println(json);
			body.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
