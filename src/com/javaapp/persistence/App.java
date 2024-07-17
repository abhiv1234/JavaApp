package com.javaapp.persistence;

public class App {

	public static void main(String[] args) {
		BaseRepository baseRepo = new Test1();
//		baseRepo.process();
		baseRepo.connect();
	}
}
