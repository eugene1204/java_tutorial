package org.opentutorial.javatutorial.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true
        
        // == 은 두개의 데이터 타입이 동일한 객체인지 비교 
        // .equals 서로 다른  객체들간에 값이 같은지 비교 

	}

}
