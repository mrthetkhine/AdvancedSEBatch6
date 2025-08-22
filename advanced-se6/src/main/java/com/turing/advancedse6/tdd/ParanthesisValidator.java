package com.turing.advancedse6.tdd;
import java.util.ArrayList;
import java.util.Stack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParanthesisValidator {

	Stack<Character> stack = new Stack<>();
	ArrayList<Character> opening = new ArrayList<>();
	ArrayList<Character> closing = new ArrayList<>();
	
	public ParanthesisValidator()
	{
		opening.add('(');
		closing.add(')');
		
		opening.add('[');
		closing.add(']');
		
		
		opening.add('{');
		closing.add('}');
		
	}
	boolean isOpening(char ch)
	{
		return opening.contains(ch);
	}
	boolean isClosing(char ch)
	{
		return this.closing.contains(ch);
	}
	boolean isMatch(char openingChar, char closingChar)
	{
		int openingIndex = this.opening.indexOf(openingChar);
		int closingIndex = this.closing.indexOf(closingChar);
		return openingIndex == closingIndex;
	}
	public boolean test(String input) {
		
		log.info("Input "+input);
		if("".equals(input) || input == null)
		{
			return true;
		}
		else
		{
			for(int i=0;i< input.length();i++)
			{
				char currentCh = input.charAt(i);
				
				if(this.isOpening(currentCh))//opening
				{
					stack.push(currentCh);
				}
				else if(this.isClosing(currentCh))//closing
				{
					if(stack.isEmpty())
					{
						return false;
					}
					char openingCh = stack.pop();
					if(!this.isMatch(openingCh, currentCh)) //check balance
					{
						return false;
					}
					
				}
			}
			//log.info("This case ");
			return stack.isEmpty();
		}
		
	}

}
