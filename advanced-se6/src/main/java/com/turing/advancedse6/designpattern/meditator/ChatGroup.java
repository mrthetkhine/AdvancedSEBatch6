package com.turing.advancedse6.designpattern.meditator;

import java.util.ArrayList;
import java.util.List;

public class ChatGroup implements Meditator{

	List<User> chatUsers = new ArrayList<>();
	@Override
	public void addToGroup(User user) {
		this.chatUsers.add(user);
		
	}

	@Override
	public void sendMessage(User user, String message) {
		for(User chatUser : this.chatUsers)
		{
			if(chatUser != user)
			{
				chatUser.receiveMessage(message);
			}
		}
		
	}

}
