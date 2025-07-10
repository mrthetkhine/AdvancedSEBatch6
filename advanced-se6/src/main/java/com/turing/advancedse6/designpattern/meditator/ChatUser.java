package com.turing.advancedse6.designpattern.meditator;

public class ChatUser implements User{
	String username;
	Meditator meditator;
	ChatUser(String username,Meditator meditator)
	{
		this.username = username;
		this.meditator = meditator;
		this.meditator.addToGroup(this);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("User "+this.username+" Send "+message);
		this.meditator.sendMessage(this, message);
		
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("User " +this.username+" got "+message);
		
	}

}
