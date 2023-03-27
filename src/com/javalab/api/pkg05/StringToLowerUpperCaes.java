package com.javalab.api.pkg05;

/*
 * 영문(대소문자) 변환
 * String toLowerCase : 대상 문자열을 모두 소문자로 변환
 * equals(); : 대소문자 구분
 * equalsIgnoreCase(); : 대소문자 구분없이 문자열 자체만으로 비교
 * 
 */

public class StringToLowerUpperCaes {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str1.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
//		equalsIgnoreCase 대소문자 구분 없이 비교
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
