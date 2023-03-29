package guru;

public class Evenodd2 {
	int n=98;
public static void main(String[] args) {
	
	Evenodd2 obj=new Evenodd2();
	switch(obj.n%2) {
	case 0:
	System.out.println("even");
	break;
	default:
		System.out.println("odd");
	}
}
}
