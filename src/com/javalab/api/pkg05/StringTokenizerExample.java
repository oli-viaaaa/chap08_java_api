package com.javalab.api.pkg05;

import java.util.StringTokenizer;
/*
 * 문자열 분리해주는 클래스
 */

public class StringTokenizerExample {
	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수;채리나";
		String[] arr = data1.split("&|,|;"); // 여러개의 구분자로 분리(자름) // 배열로 받아야함
		for (String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		// StringTokeniZer 클래스로 문자열 분리(자름)
		String data2 = "홍길동/이수홍/박연수/채리나";
		StringTokenizer st = new StringTokenizer(data2, "/"); // st : StringTokenizer 객체
		// 더이상 가져올 값이 없으면 예외 발생하기 때문에 hasMoreTokens로 확인
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
