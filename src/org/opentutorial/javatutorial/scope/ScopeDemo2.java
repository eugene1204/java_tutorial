package org.opentutorial.javatutorial.scope;

public class ScopeDemo2 {

	static int i;
    
    static void a() {
        i = 0; //static int i 
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) { // static int i 
            a(); // i가 0으로 덮어쓰여서 반복문이 안끝남
            System.out.println(i);
        }
    }

}
