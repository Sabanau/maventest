package polymorphism;

public class PolyChild extends PolyParent {

	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.cal(50, 40);
		obj.cal(100);

	}
	public void cal(int a, int b) {
		int c = a-b;
		System.out.println(c);
	}
	
	public void cal(int a) {
	
		System.out.println(a);
	}

}
