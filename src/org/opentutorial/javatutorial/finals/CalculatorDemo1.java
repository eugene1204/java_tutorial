package org.opentutorial.javatutorial.finals;

class Calculator {
    static final double PI = 3.14; // 값이 정해진 이후에는 변수 내의 값이 바꾸지 않도록 하는 규제이다. 
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;
 
 
    }
 
}