package org.opentutorial.javatutorial.Inheritance.example3;

class Calculator {
    int left, right;
    public Calculator(){
        // 하위 클래스가호출될때 자동으로 상위 클래스의 기본 생성자를 호출 
    	// 상위 클래스에 매개 변수가 있는 생성자가 있다면 자바는 자동으로 상위 클래스의 기본생성자 만들지 않음 
    }
    public Calculator(int left, int right){ // 하위클래스에서 매개변수가 있는 생성자 호출하는 방법 
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
//    	super 사용하면 상위 클래스의 기본생성자를 만들지 않아도 된다 
//    	super을 먼저 사용하기, 부모가 초기화되기 전에 자식이 초기화 되는 일 방지 
//    	super(left, right);
        this.left = left;
        this.right = right;
        
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}