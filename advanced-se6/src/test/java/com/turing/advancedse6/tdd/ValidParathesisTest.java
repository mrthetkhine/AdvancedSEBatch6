package com.turing.advancedse6.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 	s=""=>true
 	s = "("=>false
  	s = "()"=>true
    s = "()[]{}"= true
    s = "(]"=>false
    s = "([])"=>true
    s = "([)]"=>false
 * */
public class ValidParathesisTest {
	ParanthesisValidator validator = new ParanthesisValidator();
	
	@Test
	public void testEmpty()
	{	
		assertEquals(true, validator.test(""));
		assertEquals(true, validator.test(null));
	}
	@Test
	public void testLeftParanthesis()
	{
		assertEquals(false, validator.test("("));
	}
	//()
	@Test
	public void testCaseOne()
	{
		assertEquals(true, validator.test("()"));
	}
	//(() = false
	@Test
	public void testCaseTwo()
	{
		assertEquals(false, validator.test("(()"));
	}
	//()) = false
	@Test
	public void testCaseThree()
	{
		assertEquals(false, validator.test("())"));
	}
	@Test
	public void testCaseFour()
	{
		assertEquals(false, validator.test("(abc))"));
	}
	//s = "(]"=>false
	@Test
	public void testCaseFive()
	{
		assertEquals(false, validator.test("(]"));
	}
	//s = "[]"=>true
	@Test
	public void testCaseSix()
	{
		assertEquals(true, validator.test("[]"));
	}
	//s = "]"=>false
	@Test
	public void testCaseSeven()
	{
		assertEquals(false, validator.test("]"));
	}
	//s = "([])"=>true
	@Test
	public void testCaseEight()
	{
		assertEquals(true, validator.test("([])"));
	}
	//s = "([)]"=>false
	@Test
	public void testCaseNine()
	{
		assertEquals(false, validator.test("([)]"));
	}
	//s = "()[]{}"= true
	@Test
	public void testCaseTen()
	{
		assertEquals(true, validator.test("()[]{}"));
	}
	//"()[]{"
	@Test
	public void testCaseEleven()
	{
		assertEquals(false, validator.test("()[]{"));
	}
}
