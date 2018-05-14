package upei.api;

import org.simpleframework.http.Request;
import org.simpleframework.http.Response;

public class SprintsAPI extends BaseAPI {
	
	public SprintsAPI(Request request, Response response) {
		super(request, response);
	}

	public void obterUltimaSprintAtiva() {	
		this.returnJson(new XPTO());
	}
}

class XPTO {
	public String nome;
	public int idade;
	
	public XPTO(){
		this.nome = "Diego";
		this.idade = 30;
	}
}
