package t4_override;

//public final class Aa : 클래스에 final을 붙였을 시 생성은 가능하지만 상속은 불가능하다.
public class Aa {
	private int item1 = 500;
	int item2 = 600;
	
	// 사각형의 면적
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적(가로:"+x+", 세로:"+y+") : "+area);
	}
	
	// 원넓이
	//public final void areaCircle(int r) // 부모가 final 사용시 재정의 할 수 없음
	public void areaCircle(int r) {
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이는? "+area);
	}
}
