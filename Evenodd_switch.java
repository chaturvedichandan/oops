package guru;

import java.util.Scanner;

public class Evenodd_switch {
public static void main(String[] args) {
	System.out.println("enter the no ");
	Scanner cc=new Scanner(System.in);
	int n=cc.nextInt();
	switch(n%2) {
	case 0:
		System.out.println("even");
		break;
		default:
			System.out.println("odd");
	}
}
}
