package org.opentutorial.javatutorial.object;

class Calculator{ // 클래스는 사용자 정의 데이터 타입을 만든다는것 
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left; xs
        this.right = right;
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}

public class CalculatorDemo4 {

	public static void main(String[] args) {
		// Calculator의 인스턴스 생성 
		Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
          
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
	}

}
