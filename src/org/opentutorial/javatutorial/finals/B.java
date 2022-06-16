package org.opentutorial.javatutorial.finals;
// final 메소드는 final 변수 만큼 사용 빈도가 높지는 않다. 
class A {final void b() {} }
class B extends A{
	// void b() {}
	// final 메소드 b를 상속하려고 했기에 오류 발생함 
}
