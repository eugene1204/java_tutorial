package org.opentutorial.javatutorial.method;

public class MethodDemo4 {
	
	public static void numbering(int limit) { // numbering()인수를 limit으로 받아 
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
	public static void main(String[] args) {
		numbering(5);
	}

}
