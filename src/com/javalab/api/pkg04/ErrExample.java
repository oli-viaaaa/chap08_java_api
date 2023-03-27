package com.javalab.api.pkg04;

/*
 * System 클래스의 필드인 err을 이용하여 운영체제 영역인 콘솔창에 출력
 * 	- err : PrintStream 클래스
 * 	- Println() : PrinStream 클래스의 메소드
 */

public class ErrExample {

	public static void main(String[] args) {
	
		try {
			int value = Integer.parseInt("1oo");
		} catch (NumberFormatException e) {
			System.out.println("[에러내용]"); // System 클래스의 필드인 err
			System.out.println(e.getMessage());
		}

	}

}
