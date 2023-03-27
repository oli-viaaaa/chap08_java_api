package com.javalab.api.pkg06;

/*
 *  박싱과 언박싱
 */

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// Boxing(int 타입 -> Integer 타입 객체로 변신)
		Integer obj = 102;
		// 객체 내부의 int 값 반환
		System.out.println("Boxing value : " + obj.intValue());
		
		// UnBoxing(Integer type 객체의 값을 꺼내어 int 타입 변수에 저장)
		int value = obj;
		System.out.println("UnBoxing value : "+value);
		
		// 연산 시 UnBoxing
		int result = obj + 13; //obj는 언박싱 후 100과 더해짐
		System.out.println("result : "+result);
		
		System.out.println(obj);

	}

}
