package com.turing.advancedse6.proxy;

public class ProxyDemo {
	  public static void main(String[] args) throws Exception {
	        CommandExecutor command = new CommandExecutorProxy("admin", "admin");
	        command.runCommand("notepad.exe");
	        command.runCommand("rm");
	        
	        command = new CommandExecutorProxy("admin", "admin1");
	        command.runCommand("rm");
	        
	    }
}
