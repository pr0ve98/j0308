package t1_inheritance;

public class B extends A {
	// 사다리꼴 면적
	public void areaPoly(int x, int y, int z) {
		int area = (x+y)*z/2;
		System.out.println("사다리꼴의 면적(윗변:"+x+", 아랫변:"+y+", 높이:"+z+") : "+area);
	}
}
