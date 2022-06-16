package org.opentutorial.javatutorial.polymorphism;

class A{
    public String x(){return "A.x";}
}
class B extends A{
	public String x() {return "B.x";}
    public String y(){return "y";}
}
class B2 extends A {
	public String x() {return "B2.x";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
    	// 클래스 B의 데이터 타입을 클래스 A로 인스턴스화 했을 때 
    	A obj = new B();
    	A obj2 = new B2();
        System.out.println(obj.x()); // 클래스 A의 메소드 x를 클래스 B에서 오버라이딩하고 있다. 
        System.out.println(obj2.x());
        // 서로 다른 클래스 B, B2가 동일한 데이터 타입 A로 인스턴스화 되었다. 
        /*
         * 클래스 B의 데이터 타입을 클래스 A로 인스턴스화 했을때 클래스 B의 메소드 y는 마치 존재하지 않는 것처럼 실행 x -> 클래스 B가 클래스 A화
         * 클래스 B의 데이터 타입을 클래스 A로 인스턴스화 했을때 클래스 B의 메소드 x를 실행하면 클래스 A에서 정의 된 메소드 x, B에서 정의된 메소드 실행 
         * -> 클래스 B의 기본적인 성질은 그대로 간직 
         * */
        //obj.y();
    }
}
