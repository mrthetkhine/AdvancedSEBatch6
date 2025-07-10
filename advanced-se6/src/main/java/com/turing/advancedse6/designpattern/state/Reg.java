package com.turing.advancedse6.designpattern.state;

public class Reg {
	
	public static int INITIAL_STATE =0;
	public static int FINAL_STATE = 1;
	public static int INVALID_STATE = 2;
	
	static boolean isValid(String str)
	{
		int state = INITIAL_STATE;
		for(int i=0;i< str.length();i++)
		{
			char ch = str.charAt(i);
			switch(state)
			{
				case 0:
					if(ch=='1')
					{
						state =1;
					}
					else if(ch == '0')
					{
						state = 0;
					}
					else
					{
						state = INVALID_STATE;
					}
				break;
				case 1:
					if(ch=='1')
					{
						state = 1;
					}
					else
					{
						state = INVALID_STATE;
					}
				break;
				case 2:
					state = INITIAL_STATE;
					break;
			}
		}
		return state == FINAL_STATE;
	}
	public static void main(String[]args)
	{
		System.out.println("Test 001 "+Reg.isValid("001"));
		System.out.println("Test 01 "+Reg.isValid("01"));
		System.out.println("Test 00 "+Reg.isValid("00"));
		System.out.println("Test 100 "+Reg.isValid("100"));
		System.out.println("Test 001111 "+Reg.isValid("001111"));
	}
}
