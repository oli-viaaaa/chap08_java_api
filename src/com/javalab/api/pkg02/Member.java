package com.javalab.api.pkg02;

public class Member extends Object{
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 최고 조상인 Object가 갖고 있는 equals 메소드 재정의함.
	// 동등비교 : 객체가 달라져도 내용이 같은지 비교함.
	@Override
	public boolean equals(Object obj) { //equals(Object) java에 있는 모든것들을 다 받을 수 있음.
		if (obj instanceof Member) {// instanceof : 왼쪽에 있는 객체가 오른쪽에 있는 멤버냐
			Member mem = (Member)obj; // Member타입으로 형변환
			if(this.id.equals(mem.id)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
