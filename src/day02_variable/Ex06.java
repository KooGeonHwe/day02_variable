package day02_variable;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		int val;
		System.out.println("입력 : ");
		val = System.in.read();
		System.out.println("입력 data : "+(char)val);
		
		System.in.read();
		System.in.read();
		
		System.out.println("2번째 입력 : ");
		val = System.in.read();
		System.out.println("입력 data : "+ (char)val);
		}
}
