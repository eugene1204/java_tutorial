package org.opentutorial.javatutorial.overloading.example;

public class OverloadingDemo1 {
	
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    // 매개변수는 같지만 리턴타입이 다르면 오류가 발생한다. 
    //int A (){System.out.println("void A()");}
    
    public static void main(String[] args) {
        OverloadingDemo1 od = new OverloadingDemo1();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}