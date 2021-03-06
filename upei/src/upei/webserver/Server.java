package upei.webserver;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import org.simpleframework.http.core.Container;
import org.simpleframework.http.core.ContainerSocketProcessor;
import org.simpleframework.transport.connect.Connection;
import org.simpleframework.transport.connect.SocketConnection;

public class Server {
	private Container routeConfig;
	private Connection connection;
	private ContainerSocketProcessor socket;
	
	public Server(Container routeConfig)	{
		this.routeConfig = routeConfig;
	}
	
	public void openConnection(int port) throws Exception {
		this.socket = new ContainerSocketProcessor(this.routeConfig);
		this.connection = new SocketConnection(socket);
		SocketAddress socketAddres = new InetSocketAddress(port);
		
		this.connection.connect(socketAddres);
	}
	
	public void closeConnection() throws Exception {
		this.connection.close();
		this.socket.stop();
	}
	
}
