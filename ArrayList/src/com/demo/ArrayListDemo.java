package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arrayList= new ArrayList<String>();
		arrayList.add("PRIYA");
		arrayList.add("Aditya");
		
		
		 Iterator<String> itr = arrayList.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
		 }

	}

}
