package ws.service;

import javax.jws.WebService;

@WebService(endpointInterface="ws.service.HelloMyService")
public class HelloMyServiceImpl implements HelloMyService {

	@Override
	public String getWelcomeMessage(String name, String surname) {
		return "Welcome !!! "+name+" "+surname+"!!!This is first example";
	}

}
