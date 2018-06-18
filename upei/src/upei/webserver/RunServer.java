package upei.webserver;

public class RunServer {

	public static void main(String[] args) throws Exception {
		RouteConfig routeConfig = new RouteConfig();
		Server server = new Server(routeConfig);

		try {
			server.openConnection(8000);
			
			System.out.println("Tecle enter para interromper o servidor!");
			System.in.read();
		} catch(Exception e){ 
			e.printStackTrace();
		} finally {
			server.closeConnection();
			System.out.println("O servidor foi interrompido!");
		}
	}

}
