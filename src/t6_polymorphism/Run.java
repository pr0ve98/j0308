package t6_polymorphism;

public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		System.out.println();
		
		// Up Casting (자식이 부모로 자동타입변환)
		
		Bb bb= new Bb();
		Aa ba = bb; // 타입변환 b->a #1
		Aa ba2 = new Bb(); // ba = ba2 #2
		System.out.println();
		
		Cc cc = new Cc();
		Aa ca = cc;
		Aa ca2 = new Cc();
		System.out.println();
		
		Dd dd = new Dd();
		Bb db = new Dd();
		Aa da = new Dd();
		System.out.println();
		
		Ee ee = new Ee();
		Cc ec = new Ee();
		Aa ea = new Ee();
		
	}
}
