package org.opentutorial.javatutorial.overloading.example;

public class OverloadingDemo2 extends OverloadingDemo1{
	// 오버로딩 
	// 부모 클래스에 이름이 같은 다른 클래스가 존재함
	// OverloadingDemo2클래스에서 매개변수만 달리해서 사용함 
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
   
    // 오버라이딩 
    // 부모 클래스에 같은 메소드가 존재함 
    // 상속 받아서 메소드 내용을 달리해서 사용함 
    void A (){System.out.println("sub class : void A ()");}
    
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A(); 	// OverloadingDemo2
        od.A(1); 	// OverloadingDemo1
        od.A("coding everybody");		// OverloadingDemo1
        od.A("coding everybody", "coding everybody");	// OverloadingDemo2
         
    }
}
