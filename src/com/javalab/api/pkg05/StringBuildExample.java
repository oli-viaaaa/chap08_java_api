package com.javalab.api.pkg05;

public class StringBuildExample {

	public static void main(String[] args) {
		//StringBuilder(내부적으로 버퍼를 가지고 있으며 메모리를 변경하는 것이 아니라 효율적으로 사용 가능)
		StringBuilder sb = new StringBuilder("Hello"); // 객체 생성
		sb.append(" World");
		sb.append(" Ha ha");
		System.out.println(sb); // prints "Hello World Ha ha"
		System.out.println();
		
		// String 차이점(메모리 번지수는 동일 객체 내부에서 메모리 변경)
		String data = "ABC";
		data += "def";
		System.out.println(data);	//ABCdef
	}

}
