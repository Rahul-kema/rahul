package com.tnsif.multithread;

public class example {
void display() 
{
Thread g= Thread.currentThread();
for(int i=0;i<5;i++)
{
	try {
		Thread.sleep(1000);
		System.out.println(g.getName());
	}catch(Exception e) {
		
	}
}
}
	

}
