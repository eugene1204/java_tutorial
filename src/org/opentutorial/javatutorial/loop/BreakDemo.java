package org.opentutorial.javatutorial.loop;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                break; // i가 5일때,반복문을 빠져나간
            System.out.println("Coding Everybody " + i);
        }
	}

}
