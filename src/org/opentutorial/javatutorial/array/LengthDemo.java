package org.opentutorial.javatutorial.array;

public class LengthDemo {

	public static void main(String[] args) {
		// length는 배열을 처음 생성할때 지정한 배열의 크기 
		
		String[] classGroup = new String[4];
        classGroup[0] = "최진혁"; //배열에 담긴 데이터는 원소(element),classGroup[0]의 원소는 최진혁 
        System.out.println(classGroup.length);
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한이람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";
        System.out.println(classGroup.length);
	}

}
