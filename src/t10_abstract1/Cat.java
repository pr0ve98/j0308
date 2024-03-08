package t10_abstract1;

public class Cat extends Animal {
	public String talk = "야옹";
	
	@Override
	public void sori() {
		System.out.println("고양이 울음소리 : "+talk);
	}
}
