package t4_override;

public class Cc extends Aa {
	
	// 원넓이
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? "+area);
//	}
	
	@Override
	public void areaCircle(int r) {
		double area = r * r * Math.PI;
		System.out.println("반지름 "+r+"인 원넓이는? "+area);
	}
	
	public void areaCircle2(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? "+area);
		super.areaCircle(r);
	}
		
}
