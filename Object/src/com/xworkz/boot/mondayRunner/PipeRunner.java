package com.xworkz.boot.mondayRunner;

import com.xworkz.things.monday.Pipe;

public class PipeRunner {

	public static void main(String[] args) {

		Pipe pipe = new Pipe();
		pipe.setBrand("Finolex");
		pipe.setCost(100.0d);
		pipe.setDiameter(2.0d);
		pipe.setLength(10);
		System.out.println(pipe);

		Pipe pipe2 = new Pipe();
		pipe2.setBrand("Ashirvad");
		pipe2.setCost(90);
		pipe2.setDiameter(3.0d);
		pipe2.setLength(12);
		System.out.println(pipe2);

		System.out.println("HashCode of Pipe is:" + pipe.hashCode() + " Original HashCode of Pipe is:"
				+ System.identityHashCode(pipe));

		System.out.println(pipe.equals(pipe2));

	}

}
