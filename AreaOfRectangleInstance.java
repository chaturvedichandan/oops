package guru;

public class AreaOfRectangleInstance {
int length=13;
int width=11;
public static void main(String[] args) {
	AreaOfRectangleInstance obj= new AreaOfRectangleInstance();
	int area=obj.length*obj.width;
	System.out.println("Area="+area);
}
}
