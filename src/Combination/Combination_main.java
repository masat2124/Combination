package Combination;

import java.util.Scanner;

public class Combination_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Number s > ");
		int s = Integer.parseInt(scan.next());
		System.out.print("Input Number r > ");
		int r = Integer.parseInt(scan.next());
		
		Combination_lib clib = new Combination_lib(s,r);
		System.out.println("sCr = "+clib.getFactorial());
	}

}
