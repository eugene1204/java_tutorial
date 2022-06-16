package org.opentutorial.javatutorial.exception;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	/*
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
        */
    	
    	try { // 예외의 발생이 예상되는 로직 
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){ // 예외가 발생 했을때 실행되는 로직 
//            System.out.println("오류가 발생했습니다 : "+e.getMessage());
        	System.out.println("\n\ne.getMessage()\n"+e.getMessage()); // 오류에 대한 기본적인 내용 출력, 상세 x
            System.out.println("\n\ne.toString()\n"+e.toString()); // 자세한 예외정보 
            System.out.println("\n\ne.printStackTrace()"); // 메소드가 내부적으로 예외 결과를 화면출력, 가장자세한 예외 정보 제공 
            e.printStackTrace();
        }
    	
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}