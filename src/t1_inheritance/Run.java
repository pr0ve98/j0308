package t1_inheritance;

public class Run {
	public static void main(String[] args) {
		A a = new A();
		System.out.print("1.");
		a.areaRec(10, 20);
		
		B b = new B();
		System.out.print("2.");
		b.areaRec(20, 30);
		
		C c = new C();
		System.out.print("3.");
		c.areaRec(30, 40);
		
		D d = new D();
		System.out.print("4.");
		d.areaRec(40, 50);
		
		E e = new E();
		System.out.print("5.");
		e.areaRec(50, 60);
		System.out.println();
		
		b.areaPoly(10, 20, 5);
		d.areaPoly(10, 20, 5);
		d.areaRec(10, 20);
	}
}
