package org.opentutorial.javatutorial.scope;

public class ScopeDemo6 {

	static int i = 5;
	 
    static void a() {
        int i = 10;
        b(); // 정적 스코프 or 렉시컬 스코프 
    }
 
    static void b() {
        System.out.println(i); // static int i 값을 이용함, 전역변수를 사용 
    }
 
    public static void main(String[] args) {
        a(); // 5
    }

}
