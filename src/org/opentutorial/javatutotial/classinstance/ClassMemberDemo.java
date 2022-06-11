package org.opentutorial.javatutotial.classinstance;

class C1{
    static int static_variable = 1; // 클래스 변수 
    int instance_variable = 2; // 인스턴스 변수 
    
    static void static_static(){ // 클래스 메소드 -> 클래스 변수 o
        System.out.println(static_variable);
    }
    static void static_instance(){ //클래스 메소드 -> 인스턴스 변수 x
        // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다. 
        //System.out.println(instance_variable);
    }
    void instance_static(){ //인스턴스 메소드 -> 클래스 변수 o
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
        System.out.println(static_variable);
    }
    void instance_instance(){ // 인스턴스 메소드 -> 인스턴스 변수 o  
        System.out.println(instance_variable);
    }
}

public class ClassMemberDemo {

	public static void main(String[] args) {
		// 인스턴스 생성 후  -> 인스턴스 메소드, 정적 메소드 접근가능 
		// 클래스로 -> 인스턴스 메소드 접근 x, 정적 메소드 접근 o
		 C1 c = new C1(); 
	        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
	        // 인스턴스 메소드가 정적 변수에 접근 -> 성공
	        c.static_static();
	        
	        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
	        // 정적 메소드가 인스턴스 변수에 접근 -> 실패
	        c.static_instance();
	        
	        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
	        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
	        c.instance_static();
	        
	        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공 
	        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
	        c.instance_instance();
	        
	        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
	        // 클래스 메소드가 클래스 변수에 접근 -> 성공
	        C1.static_static();
	        
	        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
	        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
	        C1.static_instance();
	        
	        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
	        //C1.instance_static();
	        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
	        //C1.instance_instance();

	}

}
