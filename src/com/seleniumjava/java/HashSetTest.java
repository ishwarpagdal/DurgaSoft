package com.seleniumjava.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) 
	{
	//	HashSet<String> h=new HashSet();
		
		Set<String> h=new HashSet();
		
		h.add("Selenium");
		
		h.add("Training");
		
		h.add("Vasudeva");
		
		h.add("Vasudeva");
		
		System.out.println(h.size());
		
		Iterator<String> it=h.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
