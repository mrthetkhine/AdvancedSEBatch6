package com.turing.advancedse6.designpattern.meditator;

public interface Meditator {
	void addToGroup(User user);
	void sendMessage(User user,String message);
}
