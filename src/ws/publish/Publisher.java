package ws.publish;

import javax.xml.ws.Endpoint;

import ws.service.HelloMyServiceImpl;

public class Publisher {

	public static void main(String[] args) {
		String address ="http://localhost:8888/abc/helloworld";
        Endpoint.publish(address, new HelloMyServiceImpl());
        
        System.out.println("web service is running...");
	}

}
