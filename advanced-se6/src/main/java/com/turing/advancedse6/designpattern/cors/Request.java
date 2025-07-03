package com.turing.advancedse6.designpattern.cors;

public class Request extends HttpMessage{
	String url= "";

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
