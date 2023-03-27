package com.javalab.api.pkg04;

public class InExamplee {
	public static void main(String[] args) throws Exception {
		int speed = 0;
		int keyCode = 0;
		
		while (true) {
			// Enter키를 읽지 않았으 경우에만 실행
			if(keyCode != 13 && keyCode != 10) {
				if (keyCode == 49) {	// 숫자 1키를 읽었을 경우
					speed++;
				}else if (keyCode == 50) {// 숫자 2키를 읽었을 경우
					speed--;
				}else if (keyCode == 51) {// 숫자 3키를 읽었을 경우
					break;
				}
				System.out.println("------------------------");
				System.out.println("1. 증속  | 2. 감속  | 3. 중지 ");
				System.out.println("------------------------");
				System.out.println("현재속도 = " + speed);
				System.out.print("선택 : ");
			}
			// 키를하나씩 읽음(메뉴 구성할때 사용)
			keyCode = System.in.read();
		}
		System.out.println("프로그램 종료");
	}
}
