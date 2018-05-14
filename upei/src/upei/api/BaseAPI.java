package upei.api;

import java.io.PrintStream;

import org.simpleframework.http.Request;
import org.simpleframework.http.Response;

import com.google.gson.Gson;

public class BaseAPI {
	private Request request;
	private Response response;
		
	public BaseAPI(Request request, Response response) {
		this.request = request;
		this.response = response;
	}
	
	protected void returnJson(Object object){
		try {
			Gson gson = new Gson();
			String json = gson.toJson(object);

			PrintStream body = this.response.getPrintStream();
			this.response.setValue("Content-Type", "application/json");
			
			body.println(json);
			body.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
