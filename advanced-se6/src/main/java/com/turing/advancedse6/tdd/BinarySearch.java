package com.turing.advancedse6.tdd;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearch {
	//int[] arr;
	
	int search(int arr[],int key)
	{
		if(arr.length==0)
		{
			return -1;
		}
		else
		{
			int start =0;
			int end = arr.length-1;
			int middle ;
			
			//log.info("Array "+Arrays.toString(arr));
			while(start <= end)
			{
				middle = (start+end)/2;
				//log.info("Middle "+middle);
				if(arr[middle]==key)
				{
					return middle;
				}
				else if( key > arr[middle])
				{
					start = middle+1;
				}
				else if(key < arr[middle])
				{
					end = middle-1;
				}
			}
			return -1;
		}
		
	}
}
