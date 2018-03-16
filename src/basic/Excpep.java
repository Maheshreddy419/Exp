package basic;

import java.io.IOException;

public class Excpep {
	void m1() throws IOException{
		throw new IOException("handled");
		
	}
	public static void main(String[] args) throws IOException {
		Excpep ep=new Excpep();
		ep.m1();
		
	}

}
