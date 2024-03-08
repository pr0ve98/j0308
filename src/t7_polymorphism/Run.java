package t7_polymorphism;

public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		
//		Bb ab = (Bb)aa; 부모 객체를 자식 객체로 바로 Down Casting 할 수 없다.
		// 자식 객체가 부모 객체로 Up Casting 을 했을 때만 Down Casting 이 가능하다.
		
		// Down Casting (부모가 자식으로 강제타입변환)
		// B -> A -> B
		Aa ba = new Bb(); // Up Casting
		Bb bb = (Bb)ba;
		System.out.println();
		
		// D -> B -> D
		Bb db = new Dd();
		Dd dd = (Dd)db;
		System.out.println();
		
		// E -> C -> E
//		Cc ec = new Ee();
//		Ee ee = (Ee)ec;
//		System.out.println();
//		
		// E -> C -> A -> C
//		Aa eca = ec;
//		Cc ecac = (Cc)eca;
		
		// E -> A -> E
		Aa ea = new Ee();
		Ee eae = (Ee)ea;
		System.out.println();
		
		// E -> A -> C
		Cc eac = (Cc)ea;
		
	}
}
