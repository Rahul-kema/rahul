package com.tnsif.multithread;

public class Tea extends Thread{
	example ex;
	Tea(example ex){
		this.ex=ex;
	}

	
	public void run()
	{
		ex.display();
	}

}
