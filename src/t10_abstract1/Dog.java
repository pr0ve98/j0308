package t10_abstract1;

public class Dog extends Animal {
	public String talk = "멍멍";
	
	@Override
	public void sound() {
		System.out.println("강아지 울음소리 : "+talk);
	}
}
