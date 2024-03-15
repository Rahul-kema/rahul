package com.tnsif.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Emo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<laptop> e=new ArrayList<laptop>();
e.add(new laptop("dell",150000,7));
e.add(new laptop("asus",250000,8));
e.add(new laptop("hp",180000,3));
Collections.sort(e);
for(laptop l:e)
{
	System.out.println(l);
}

	}

}
