package t10_abstract3;

public class Samsung extends Phone {

	public Samsung(String name) {
		super(name + "(삼성)");
	}

	@Override
	public void function() {
		System.out.println(getName()+"폰은 삼성페이 기능이 우수합니다.");
	}

	@Override
	public void sound() {
		System.out.println(getName()+"폰의 전화벨소리는 따르릉~ 따르릉입니다.");
	}
	
	public void functionSamsung() {
		System.out.println("이번에 새로 추가된 기능은 'AI번역'이 있습니다");
	}

}
