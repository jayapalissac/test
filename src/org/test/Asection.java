package org.test;

public class Asection {
	
	public void os() {
		
		System.out.println("OS name is : Windows");
	}

public void os(double version) {
		
		System.out.println("OS name is : "+version);
	}


public void os(String make) {
	
	System.out.println("OS make is : "+make);
}


public void os(long id) {
	
	System.out.println("OS id is : "+id);
}


public static void main (String[]args) {
	
	Asection a = new Asection();
	a.os();
	a.os(1.8);
	a.os("Microsoft");
	a.os(9865245l);
	
	
	
}
}
