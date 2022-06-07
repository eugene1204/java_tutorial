package org.opentutorial.javatutorial.method;

public class ReturnDemo2 {
	public static String num(int i) {
        if(i==0){
            return "zero";
        } else if(i==1){
            return "one";
        } else if(i==2){
            return "two";
        }
        return "none"; //return이 중복적으로 실행될 가능성이 없다. 
    }
 
    public static void main(String[] args) {
        System.out.println(num(1));
    }
}
