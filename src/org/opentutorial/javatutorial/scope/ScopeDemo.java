package org.opentutorial.javatutorial.scope;

public class ScopeDemo {
	
	static void a() {
        int i = 0;
    }
 
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a(); // a()가 실행될때, 메소드 내부의 변수 i값이 반복문 변수 i 값을 덮어 쓴다면?
            System.out.println(i);
        }
    }

}
