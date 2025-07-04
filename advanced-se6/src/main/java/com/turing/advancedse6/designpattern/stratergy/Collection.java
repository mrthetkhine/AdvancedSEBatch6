package com.turing.advancedse6.designpattern.stratergy;

import java.util.ArrayList;
import java.util.List;

interface Comparator<T>
{
	int compare(T a, T b);

}
public class Collection<T> {

	List<T> items = new ArrayList<T>();
	
	public void add(T item)
	{
		items.add(item);
	}
	void sort(Comparator<T> comp)
	{
		for(int i=0;i< items.size()-1;i++)
		{
			for(int j=i+1;j < items.size();j++)
			{
				if(comp.compare(this.items.get(i), this.items.get(j)) >0)//i>j
				{
					T temp = this.items.get(j);
					this.items.set(j, this.items.get(i));
					this.items.set(i, temp);
				}
			}
		}
	}
}
