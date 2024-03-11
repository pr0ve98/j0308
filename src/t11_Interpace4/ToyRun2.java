package t11_Interpace4;

import java.util.Scanner;

/*
 	기능 		곰돌이	로보트	비행기	탱크
 	움직임	 O		 O		 X  	 O
 	레이저	 X		 X 	 	 O		 O
 	미사일	 X		 O		 O		 O
	연령대	전연령	4~		8~		13이상
	
	장난감 목록을 표시해주고, 해당 장난감의 기능을 보여주세요.
	
	예)
	어떤 장난감 구매를 희망하십니까?
	1. 곰돌이 2. 로보트 3. 비행기 4. 탱크 0. 종료 ==> 1
	곰돌이는 팔다리를 움직일 수 있습니다.
	모든 연령대가 다 사용하실 수 있습니다.
	
	구매를 희망하십니까? (Y/N) ==>
	곰돌이가 구매 되었습니다. 감사합니다. Y
	감사합니다. 다음에 또 이용해주세요. N
 */
public class ToyRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Toy[] toys = {new Bear(), new Robot(), new AirPlane(), new Tank()};
		String[] titles = {"곰인형","로보트","비행기","탱크"};
		int choice;		
		
		// 입력 받기
		while(true) {
			System.out.println("--------------------------");
			System.out.print("어떤 장난감 구매를 희망하십니까?(1. 곰돌이, 2. 로보트, 3. 비행기, 4. 탱크, 0. 종료> ");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("\n감사합니다. 다음에 또 이용해주세요!");
				break;
			}
		
		// 선택한 장난감 기능 설명하기
			System.out.println("--------------------------");
			System.out.println("◆ "+titles[choice-1]+" 장난감의 기능 ◆");
			toys[choice-1].moving();
			toys[choice-1].fire();
			toys[choice-1].misaile();
			toys[choice-1].age();
			System.out.println("--------------------------");
			
		// 구매 의사 묻기
			System.out.print("구매를 희망하십니까?(Y/N) ==> ");
			String ans = sc.next().toUpperCase();
			
		// 구매 결과	
			if(ans.equals("Y")) {
				System.out.println(titles[choice-1]+"(이)가 구매되었습니다.");
			}
			else {
				System.out.println("전 단계로 돌아갑니다...");
			}
		}
		sc.close();
	}
}
