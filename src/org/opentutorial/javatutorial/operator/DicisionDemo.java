package org.opentutorial.javatutorial.operator;

public class DicisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
        int b = 3;
          
        float c = 10.0F;
        float d = 3.0F;
          
        System.out.println(a/b); // 3
        System.out.println(c/d); // 3.3333333
        System.out.println(a/d); // 3.3333333
        
        // 정수/정수 = 정수
        // 실수/실수 = 실수
        // 정수/실수 = 실수  암시적으로 형변환
	}

}
