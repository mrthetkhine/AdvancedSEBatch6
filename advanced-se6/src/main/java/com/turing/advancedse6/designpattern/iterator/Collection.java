package com.turing.advancedse6.designpattern.iterator;

public class Collection implements Iterable{
	String str;
	
	public Collection(String str)
	{
		this.str = str;
	}

	public Iterator createIterator()
	{
		return new CollectionIterator();
		
	}
	class CollectionIterator implements Iterator {

		int index = 0;
		@Override
		public boolean hasNext() {
			
			return index< str.length();
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			return str.charAt(index++)+"";
		}
	}
}
