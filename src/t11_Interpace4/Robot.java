package t11_Interpace4;

public class Robot implements Toy {
	private int age = 4;

	@Override
	public void age() {
		System.out.println(age+"세이상 사용할 수 있습니다.");
	}

	@Override
	public void moving() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void fire() {}

	@Override
	public void misaile() {
		System.out.println("미사일 발사 기능이 있습니다.");
	}

	@Override
	public int possibleAge() {
		return age;
	}

}
