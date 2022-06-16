package org.opentutorial.javatutorial.interfaces.example;

interface I{
	// z 메소드를 삭제 -> 클래스 A에 에러 발생 
	/*
	 * 인터페이스와 상속은 다르다 
	 * 상속이 상위클래스의 기능을 하위클래스가 물려 받는것
	 * 인터페이스는 하위클래스에 특정한 메소드가 반드시 존재하도록 강제한다. 
	 * */
	public void z();
}
class A implements I{
	public void z() {}
}
