package org.opentutorial.javatutorial.polymorphism;

interface I2{
    public String A();
}
interface I3{
    public String B();
}
class D implements I2, I3{
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}
public class PolymorphismDemo3 {
    public static void main(String[] args) {
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();
         
        obj.A();
        obj.B();
         
        objI2.A();
        //objI2 데이터 타입이 인터페이스I2ㅜ 인터페이스 I2는 메소드A만을 정의, I2를 데이터 타입으로 하는 인스턴스는 마치 메소드A만 가지고 있는거처럼 동
        //objI2.B();
         
        //objI3.A();
        objI3.B();
    }
}
