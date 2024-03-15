package com.tnsif.collections;
import java.util.ArrayList;
import java.util.Iterator;
//to demonstrate arraylist using generics
public class arraylistgener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<String>();//List(interface):arraylist,linkedlist,vector,stack are implemented cls contains in List inerface
//List<string> list=new ArrayList<String>();//it is also accepted bcz from List interface we r getting arraylist cls
list.add("mango");
list.add("apple");
list.add("banana");
//list.add(32);//compile time error bcz string type is accepted
System.err.println(list);
//travelling list through iterator(iterator is a interface,it contains methods like hasnext,callnext....)
Iterator itr=list.iterator();
while(itr.hasNext())         //check if iterator has a element
{
	System.out.println(itr.next());  //printing the element and moving next
}
	}

}
