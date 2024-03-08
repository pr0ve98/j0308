package t2_inheritance;

public class Run {
	public static void main(String[] args) {
		System.out.println("1.이곳은 Run클래스입니다.");
		System.out.println();
		
		System.out.println("==bb1==");
		Bb bb1 = new Bb();
		// 기본생성자만 실행됐음
		// 부모 먼저 생성되고 자식 클래스가 생성됨
		System.out.println();
		
		System.out.println("==bb2==");
		Bb bb2 = new Bb(10);
		bb2.areaPoly(2, 3, 4);
		System.out.println();
		
		System.out.println("==bb3==");
		Bb bb3 = new Bb(10, 20, 30);
		System.out.println();
		
		System.out.println("==직접 호출==");
		bb1.areaRec(10, 20);
		bb1.areaPoly(1, 2, 3);
		System.out.println();
		
		System.out.println("2.이곳은 Run클래스입니다.");
	}
}
