package com.javaapp.persistence;

public abstract interface BaseRepository {

	void connect();
	
	void close();
}

/* 
 * Rule 1: interfaces are abstract entity, hence object can not be created
 * BaseRepository baseRepo = new BaseRepository(); --> Compilation Failure
 * 
 * Rule 2: all methods in interfaces are abstract methods. so no implementation
 * void(){} --> Compilation failure
 * 
 * Rule 3: all methods and variables, are by default public
 * 
 * Rule 4: Any class that implements the interface.
 * In case where, you do not with to override any of the method, then mark your class as abstract
 * 
 */
