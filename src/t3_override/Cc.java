package t3_override;

public class Cc extends Aa {
	
//	// 원넓이
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? "+area);
//	}
	// 부모 메소드를 가져와 자식 메소드가 재정의해서 사용하는 것을 오버라이드라고 한다.
	
	// 원넓이
//	public void areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이는? "+area);
//	}
	// 가져와서 하나도 안 고쳤어도 무조건 오버라이드
	// 나중에 고칠 수도 있으니까
	// 오버라이드는 리턴타입도 관계가 있다 (오버로딩은 없었음)
	// 오버로딩 위반
	
//	public double areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이는? "+area);
//		return area;
//	}
	// 오버라이딩 위반
	
	public void areaCircle2(int r) {
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이는? "+area);
	}
	// 오버라이드 아님 (부모와 선언부가 다름)
}
