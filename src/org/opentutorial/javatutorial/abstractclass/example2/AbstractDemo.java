package org.opentutorial.javatutorial.abstractclass.example2;

abstract class A{
	/*
	 * 추상 클래스는 상속을 강제하기 위한 것이다. 
	 * 부모클래스에는 메소드의 시그니처만 정의해놓고 메소드의 실제 동작방법은 이 메소드를 상속 받은 하위 클래스의 책임으로 위임하고 있다. 
	 * */
    public abstract int b();
    public void d(){
        System.out.println("world");
    }
}
class B extends A{
    public int b(){return 1;}
}
public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.b());
    }
}
