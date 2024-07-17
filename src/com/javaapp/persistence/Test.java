package com.javaapp.persistence;

public abstract class Test implements BaseRepository {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

}
// 2 methods in this Test class --> connect() and close()

class Test1 extends Test{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	public void process() {
		System.out.println("Process....");
	}
}