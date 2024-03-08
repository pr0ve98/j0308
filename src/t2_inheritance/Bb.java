package t2_inheritance;

public class Bb extends Aa {
	//item1 = 100; // 필드 영역이라 동작을 할 수 없음(정의만 할 수 있다)
	int su = item1; // 정의, 상속받아 가져와서 쓸 수는 있다
	
	public Bb() {
		System.out.println("이곳은 Bb클래스의 기본생성자");
	}
	
	public Bb(int su) {
		super(10); // super()는 생성자의 첫번째에만 와야 함
		// 부모의 생성자를 호출한다 ()안에 아무것도 없으면 부모의 기본생성자
		// 인자가 있으면 그 타입에 맞는 생성자를 호출
		System.out.println("이곳은 Bb클래스의 사용자 정의 생성자, su = "+su);
	}
	
	public Bb(int item1, int x, int y) {
		super(item1, x, y);
	}
	
		// 사다리꼴 면적
		public void areaPoly(int x, int y, int z) {
			int area = (x+y)*z/2;
			System.out.println("사다리꼴의 면적(윗변:"+x+", 아랫변:"+y+", 높이:"+z+") : "+area);
	}

}
