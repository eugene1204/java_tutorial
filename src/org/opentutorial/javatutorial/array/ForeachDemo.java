package org.opentutorial.javatutorial.array;

public class ForeachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = { "최진혁", "최유빈", "한이람" };
        for (String e : members) { // 배열 members의 값을 변수 e에 담아서 중괄호 구간 안으로 전달해준다 
            System.out.println(e + "이 상담을 받았습니다");
        }
	}

}
