package javaLearning;

import java.util.Scanner;

//java.util.scanner.io.*;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("1");
		}
		else if(ch>='a' && ch<='z'){
			System.out.println("-1");
		}else {
			System.out.println(0);
		}

	}
}