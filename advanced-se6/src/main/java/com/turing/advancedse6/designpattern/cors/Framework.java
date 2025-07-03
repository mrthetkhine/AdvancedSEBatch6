package com.turing.advancedse6.designpattern.cors;

import java.util.ArrayList;
import java.util.List;

public class Framework {
	List<Handler> middleware = new ArrayList<Handler>();
	
	void use(Handler handler)
	{
		this.middleware.add(handler);
	}
	void handle(Request request, Response response)
	{
		
		for(Handler handler : this.middleware)
		{
			try
			{
				handler.doHandle(request, response);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return;
			}
		}
	}
	public static void main(String[]args)
	{
		Framework framework = new Framework();
		framework.use(new LoggingHandler());
		framework.use(new AuthHandler());
		framework.use(new Controller());
		
		Request req = new Request();
		req.setUrl("http://localhost:8080/hello");
		req.headers.put("Authorization", "Bearer Token");
		Response resp = new Response();
		
		framework.handle(req, resp);
		
		
	}
}
