package Task;

import java.util.Scanner;

public class Task11_2 {
	
	public static void EqMC (int a){
		int d, h, m, s;
		m=a/60; s=a-60*m; h = m/60; m = m - 60*h; d = h/24; h = h - 24*d;
	    System.out.print("In "+d+" days "+h+" hours "+m+" minuts "+s+" seconds ");
	}
	public static void main(String[] args) {
		System.out.print("Write seconds before MCh.:\t");
		Scanner hmMC = new Scanner(System.in);
		int a = hmMC.nextInt();
		hmMC.close();
		EqMC(a);
		System.out.println(" Merry Christmas!");
	}
}
