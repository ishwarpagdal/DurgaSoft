package com.seleniumjava.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args)
	{
		
		//ArrayList<String> l=new ArrayList();
		
		/*
		 * List<String> l=new ArrayList();
		 * 
		 * l.add("Vasudeva");
		 * 
		 * l.add("Selenium");
		 * 
		 * l.add("Training");
		 * 
		 * l.add("Vasudeva");
		 * 
		 * System.out.println(l.size());
		 */
		
		/*
		 * for (int i = 0; i < l.size(); i++) { System.out.println(l.get(i)); }
		 */

		//for each loop:  it is introduced in java 1.5 version, specially designed for accessing elements form arrays(collection)
		
		//synatax:
		
		/*
		 * for(declaration:arrayName) { stmets; }
		 */
		
		/*
		 * for (String item : l) { System.out.println(item); }
		 */
		
		/*
		 * List<Integer> l=new ArrayList();
		 * 
		 * l.add(12);
		 * 
		 * l.add(14);
		 * 
		 * l.add(15);
		 * 
		 * l.add(16);
		 * 
		 * System.out.println(l.size());
		 * 
		 * for (Integer x : l) { System.out.println(x); }
		 */
		
		List<Object> l=new ArrayList();
		
		l.add(12);
		
		l.add(12.34);
		
		l.add('V');
		
		l.add("Vasudeva");
		
		System.out.println(l.size());
		
		for (Object item : l) 
		{
			System.out.println(item);
		}
		
	}

}
