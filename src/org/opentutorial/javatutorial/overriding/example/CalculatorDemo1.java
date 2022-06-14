package org.opentutorial.javatutorial.overriding.example;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
        
    }
    /*
     * overriding을 하기 위해서는 메소드의 리턴 형식이 같아야 한다. 
     * 오버라이딩을 하기 위한 조건 (메소드의서명) 
     * -> 메소드의 이름 
     * -> 메소드 매개변수의 숫자와 데이터타입 그리고 순서 
     * -> 메소드의 리턴 타입 
     * 
     * public void avg() 메소드를 쓰게 되면 상위 클래스와 하위 클래스의 서명이 달라져 발생 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
    
    */
    
    public int avg() {
        return ((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() { // 메소드 오버 라이딩 
//    	부모클래스로 부터 물려 받은 기본 동작 방법을 변경하는 효과 
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
    
    public int avg() {
    	return super.avg(); // 코드를 중복 제거 
//        return ((this.left + this.right)/2);
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}

