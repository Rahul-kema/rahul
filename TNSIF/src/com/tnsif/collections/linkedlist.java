package com.tnsif.collections;

import java.util.LinkedList;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> lit=new LinkedList<Integer>();
lit.add(2);//these all indicates adding elements at random position
lit.add(3);
lit.add(9);
lit.add(6);
System.out.println(lit);
	
	//now adding elements at particular pos(we can add duplicate elements also)
LinkedList<Integer> s=new LinkedList<Integer>();
	s.add(12);
	s.add(56);
	lit.addAll(s);
	System.out.println(lit);
	s.addFirst(78);
	System.out.println(lit);
	System.out.println(s);
	s.addLast(88);
	System.out.println(lit);
	System.out.println(s);
	s.remove(2);//to remove we must give the index value,not the integer value
	System.out.println(s);
	s.add(3, 77);
	System.out.println(s);
	System.out.println(s.get(3));
	System.out.println(s.getClass());
	
	
	}

}
