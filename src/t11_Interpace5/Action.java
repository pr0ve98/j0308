package t11_Interpace5;

public interface Action {
	
	// 경찰관(범인 잡기, 물건 찾기)
	void catching();
	void search();
	
	// 소방관(불 끄기, 인명구조)
	void fire();
	void save();
	
	// 요리사(피자, 스파게티를 만든다)
	void pizza();
	void spagetti();
	
	// 역할명
	default void action(String action) {
		System.out.println(action+" 역할? ");
	}
	
}
