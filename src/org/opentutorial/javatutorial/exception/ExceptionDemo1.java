package org.opentutorial.javatutorial.exception;

class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        } finally { // 예외여부와 관계없이 실행되는 로직 
        	// 예외와 상관없이 반드시 끝내줘야 하는 작업에 사용한다. 
        	// ex. 데이터베이스 서버에 접속한 상태, 데이터베이스에 예외 생겨도 접속은 끊기면 안된다 
            System.out.println("finally");
        }
         
    }
}
 
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
    }
}