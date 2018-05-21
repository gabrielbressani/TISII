package upei.webserver;

import org.simpleframework.http.Query;

public interface IHTTPController {
	void post(Query query);
	void get();
}
