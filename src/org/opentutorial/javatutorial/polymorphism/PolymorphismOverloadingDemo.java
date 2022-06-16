package org.opentutorial.javatutorial.polymorphism;

class O{
	// 오버로딩은 다형성의 한가지 예 
    public void a(int param){
        System.out.println("숫자출력");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("문자출력");
        System.out.println(param);
    }
}
public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);
        o.a("one");
    }
}

