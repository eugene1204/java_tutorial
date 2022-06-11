package org.opentutorial.javatutorial.scope;

class C3 {
    int v = 10;
 
    void m() {
        int v = 20;
        
        System.out.println(this.v); // 전역 변수 v를 출력 
        System.out.println(v); // 지역 변수 v를 출력 
    }
}
 
public class ScopeDemo9 {
 
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }
 
}