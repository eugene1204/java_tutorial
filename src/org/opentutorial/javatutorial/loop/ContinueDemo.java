package org.opentutorial.javatutorial.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue; //i가 5일때, 반목문을 멈춘다. 이후 다시 실행 
            System.out.println("Coding Everybody " + i);
        }

	}

}
