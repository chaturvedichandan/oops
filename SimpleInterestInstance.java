		package guru;

public class SimpleInterestInstance {
float principal=12;
float rate=5;
float time=3;
public static void main(String[] args) {
	SimpleInterestInstance obj=new SimpleInterestInstance();
	float si=(obj.principal*obj.time*obj.rate)/100;
	System.out.println("Simple Interest="+si);
}
}
