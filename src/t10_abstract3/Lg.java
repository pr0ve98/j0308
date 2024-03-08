package t10_abstract3;

public class Lg extends Phone {

	public Lg(String name) {
		super(name + "(LG)");
	}

	@Override
	public void function() {
		System.out.println(getName()+"폰은 화질이 우수합니다.");
	}

	@Override
	public void sound() {
		System.out.println(getName()+"폰의 전화벨소리는 띠리리리~~ 입니다.");
	}
	
	public void functionLg() {
		System.out.println("이번에 새로 추가된 기능은 '만보기'가 있습니다");
	}

}
