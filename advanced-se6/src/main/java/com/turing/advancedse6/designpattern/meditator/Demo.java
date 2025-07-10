package com.turing.advancedse6.designpattern.meditator;

public class Demo {
	public static void main(String[]args)
	{
		Meditator meditator = new ChatGroup();
		User user1 = new ChatUser("user1", meditator);
		User user2 = new ChatUser("user2", meditator);
		User user3 = new ChatUser("user3", meditator);
		
		user1.sendMessage("Hello");
		user2.sendMessage("hi");
	}
}
