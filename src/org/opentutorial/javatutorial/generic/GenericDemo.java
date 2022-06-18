package org.opentutorial.javatutorial.generic;

// 클래스를 정의 할때는 info의 데이터 타입을 확정하지 않고 인스턴스를 생성할 때 데이터 타입을 지정하는 기법 : 제네릭 
class Person<T>{
    public T info;
}
 
public class GenericDemo {
 
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();
        Person<StringBuilder> p2 = new Person<StringBuilder>();
        
        /*
         * p1.info : String 
         * p2.info : StringBuilder
         * */
    }
 
}
