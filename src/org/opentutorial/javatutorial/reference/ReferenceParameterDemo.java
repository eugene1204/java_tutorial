package org.opentutorial.javatutorial.reference;

public class ReferenceParameterDemo {
	static void _value(int b){
        b = 2;
    }
     
    public static void runValue(){
        int a = 1;
        _value(a); 
        // _value에서 a값은 변경되지 않았음 
        System.out.println("runValue, "+a); 
    }
     
    static void _reference1(A b){
        b = new A(2);
    }
     
    public static void runReference1(){
        A a = new A(1);
        _reference1(a);
        // _reference1 a 값은 변경되지 않았음 
        System.out.println("runReference1, "+a.id);     
    }
     
    static void _reference2(A b){
    	// 매개변수 b는 인자 a와 참조 관계로 연결되어있음 
    	// a,b는 모두 같은 객체를 참조하고 있음 
        b.id = 2;
    }
 
    public static void runReference2(){
        A a = new A(1);
        _reference2(a);
        System.out.println("runReference2, "+a.id);     
    }
     
    public static void main(String[] args) {
        runValue(); // runValue, 1
        runReference1(); // runReference1, 1
        runReference2(); // runReference2, 2
    }
}
