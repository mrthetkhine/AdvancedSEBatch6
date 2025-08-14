package com.turing.advancedse6.tdd.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.turing.advancedse6.oop.Account;
import com.turing.advancedse6.oop.TransferService;
import com.turing.advancedse6.oop.principle.Car;
import com.turing.advancedse6.oop.principle.DieselEngine;
import com.turing.advancedse6.oop.principle.Engine;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MockitoTest {

	ArrayList mockedList = mock(ArrayList.class);
	@Test
	public void testMockito()
	{
		ArrayList list = mock(ArrayList.class);
		Mockito.when(list.size()).thenReturn(3);
		
		log.info("Size "+list.size());
		assertEquals(3,list.size());
	}
	@Test
	public void testWhenCarStartEngineShouldStart()
	{
		Engine mockEngine = mock(Engine.class);
		Car car = new Car(mockEngine);
		
		car.start();
		verify(mockEngine).start();
	}
	@Test
	public void testMockitoVerify()
	{
		ArrayList list = mock(ArrayList.class);
		
		list.add("One");
		
		log.info("Size "+list.size());
		verify(list).add("One");
	}
	@Test
	public void testStubbing()
	{
		ArrayList list = mock(ArrayList.class);
		when(list.get(0)).thenReturn(100);
		when(list.get(1)).thenThrow(new RuntimeException("Access to index 1"));
		
		log.info("Get0 "+ list.get(0));
		assertEquals(100,list.get(0));
		
		assertThrows(RuntimeException.class,()->{
			list.get(1);
		});
		log.info("Get 2 "+list.get(2));
	}
	@Test
	public void testArgumentMatching()
	{
		ArrayList mockedList = mock(ArrayList.class);
		when(mockedList.get(anyInt())).thenReturn("element");
		
		//log.info("Get 100 " + mockedList.get(100));
		assertEquals("element",mockedList.get(1));
		
		verify(mockedList).get(anyInt());
	}
	@Test
	public void testArgumentMatching2()
	{
		
		mockedList.add("hello1");
		verify(mockedList).add(
				argThat((String someString) -> someString.length() > 5));
		
		
	}
	@Test
	public void testArgumentMatching3()
	{
		mockedList.add(0, "Apple");
		verify(mockedList).add(anyInt(),eq("Apple"));
		
		
	}
	@Test
	public void testVerifyTimes()
	{
		mockedList.add(1);
		mockedList.add(2);
		//mockedList.add(3);
		
		verify(mockedList,times(2)).add(anyInt());
		
		
	}
	@Test
	public void testVerifyAtLeast()
	{
		ArrayList mockedList = mock(ArrayList.class);
		mockedList.add(1);
		mockedList.add(2);
		mockedList.add(3);
		
		verify(mockedList,atLeast(2)).add(anyInt());
		
		
	}
	@Test
	public void testVerifyAtMost()
	{
		
		mockedList.add(1);
		//mockedList.add(2);
		
		verify(mockedList,atMost(2)).add(anyInt());
		
		
	}
	@Test
	public void testVerifyNever()
	{
		
		mockedList.add("");
		verify(mockedList,never()).add(anyInt());
		
		
	}
	@Test
	public void testDoThrow()
	{
		 doThrow(new RuntimeException()).when(mockedList).clear();
		 assertThrows(RuntimeException.class,()->{
			mockedList.clear(); 
		 });
	}
	@Test
	public void testMethodOrder()
	{
		Account fromAccountMock = mock(Account.class);
		Account toAccountMock = mock(Account.class);
		TransferService tranService = new TransferService(fromAccountMock,toAccountMock);
		
		tranService.transfer(100);
	
		InOrder inOrder = Mockito.inOrder(fromAccountMock,toAccountMock);
		
		inOrder.verify(fromAccountMock).debit(100);
		inOrder.verify(toAccountMock).credit(100);
	}
	@Test
	public void testVerifyNoMore()
	{
		mockedList.add("one");
		//mockedList.add("two");
		//mockedList.get(100);
		
		
		verify(mockedList).add("one");

		 //following verification will fail
		verifyNoMoreInteractions(mockedList);
		 
	}
	@Test
	public void testConsecutiveCall()
	{
		when(mockedList.get(0))
		   .thenThrow(new RuntimeException())
		   .thenReturn("foo");

		 //First call: throws runtime exception:
		assertThrows(RuntimeException.class,()->{
			mockedList.get(0);
		});
		assertEquals("foo",mockedList.get(0));
	}
	@Test
	public void testConsecutiveCall2()
	{
		when(mockedList.get(0))
		   .thenReturn("one","two","three");

		assertEquals("one",mockedList.get(0));
		assertEquals("two",mockedList.get(0));
		assertEquals("three",mockedList.get(0));
	}
	@Test
	public void testStubWithCallBack()
	{
		when(mockedList.get(anyInt())).thenAnswer(
			     new Answer() {
			        
					@Override
					public Object answer(InvocationOnMock invocation) throws Throwable {
						log.info("Answered");
						Object[] args = invocation.getArguments();
			            Object mock = invocation.getMock();
			            return "called with arguments: " + Arrays.toString(args);
					}
			 });
		String result= (String) mockedList.get(0);
		log.info("FromAnser "+result);
	}
	//@Test
	public void testDoFamily()
	{
		doReturn("hello").when(mockedList.get(0));
		assertEquals("hello",mockedList.get(0));
	}
	@Test
	public void testDoNothing()
	{
		 	doNothing()
		 	.doThrow(new RuntimeException())
		    .when(mockedList).clear();
		 	
		 	mockedList.clear();
		 	assertThrows(RuntimeException.class,()->{
		 		mockedList.clear();
		 	});
	}
	@Test
	public void testDoCallRealMethod()
	{
		 DieselEngine engine = mock(DieselEngine.class);
		 doCallRealMethod().when(engine).start();
		 Car car = new Car(engine);
		 
		 car.start();
		 
	}
	@Test
	public void testSpy()
	{
		List list = new LinkedList();
		List spy = Mockito.spy(list);

	    //optionally, you can stub out some methods:
	    when(spy.size()).thenReturn(100);
	    
	    spy.add("one");
	    spy.add("two");
	    
	    assertEquals("one",spy.get(0));
	    assertEquals("two",spy.get(1));
	    
	    assertEquals(100,spy.size());
	}
	
	@Test
	public void testCaptureArgument()
	{
		List mock = mock(ArrayList.class);
		ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
		mock.add("one");
		
		verify(mock).add(argument.capture());
		assertEquals("one", argument.getValue());
	}
}
