package hackathon;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Scanner;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/*
 * Simple RESTful service
 */
public class Service {
	
	private static final int PORT = 8000;
	
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
        server.createContext("/rest", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
        
        System.out.println("Started server at http://localhost:" + PORT);
    }

    static class MyHandler implements HttpHandler {
    	
    	private String json;
    	
    	public MyHandler() {
    		InputStream is = MyHandler.class.getResourceAsStream("packages.json");
			json = new Scanner(is).useDelimiter("\\Z").next();
    	}
    	
        public void handle(HttpExchange t) throws IOException {
            String response = json; //"This is the response";
            
            t.getResponseHeaders().add("Content-Type", "application/json");
            
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

}