package org.opentutorial.javatutorial.loop;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* while(조건){
		    반복 실행 영역
		} */
		
		int i = 0;
		// i의 값이 10보다 작다면 true, 크다면 false가 된다. 현재 i의 값은 0이기 때문에 이 반복문은 실행된다. 
		while(i<10){    // i가 10되면 while문을 빠져나     
		    System.out.println("Coding Everybody"+i);
		    // i의 값에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면 반복문은 반복문을 재호출한다. 이때 i<10의 값을 검사하게 된다.
		    i++;
		}
	}

}
