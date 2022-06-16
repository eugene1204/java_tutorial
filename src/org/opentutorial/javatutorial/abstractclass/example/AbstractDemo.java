package org.opentutorial.javatutorial.abstractclass.example;

abstract class A{
	// 메소드 b는 시그니처만 정의 -> 구체적인 구현은 하위 클래스에서 오버라이딩 해야한다. 
	// 추상메소드 : b -> 추상클래스 : A 
    public abstract int b();
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    public void d(){
        System.out.println("world");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        //A obj = new A();
    }
}
