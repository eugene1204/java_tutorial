package org.opentutorial.javatutorial.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        // 현재 i값 출력, 다음행에서 i++한 값 출력 
        System.out.println(i); // 7 출력
        i++;
        System.out.println(++i); //9
        

	}

}
