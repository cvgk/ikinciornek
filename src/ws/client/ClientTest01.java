package ws.client;
import java.net.*;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ws.service.HelloMyService;
public class ClientTest01 {

	public static void main(String[] args) throws MalformedURLException{
		String address ="http://localhost:8888/abc/helloworld";
        URL url = new URL(address);
        QName qname = new QName("http://service.ws/","HelloMyServiceImplService");
        Service service = Service.create(url, qname);
        
        HelloMyService hello = service.getPort(HelloMyService.class);
        String message = hello.getWelcomeMessage("Metin", "Aln");
        
        System.out.println(message);
        System.out.println(message);
	}

}
