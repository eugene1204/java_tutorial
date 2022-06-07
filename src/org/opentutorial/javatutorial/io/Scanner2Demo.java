package org.opentutorial.javatutorial.io;
import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) { // sc.hasNextInt()는 입력값이 생기기전까지 실행을 유보 
        	// 입력 값이 int인경우 실행 
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
	}

}
