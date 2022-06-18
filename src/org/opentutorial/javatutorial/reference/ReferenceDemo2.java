package org.opentutorial.javatutorial.reference;

class A{
    public int id;
    A(int id){
        this.id = id;
    }
}

public class ReferenceDemo2 {
 
    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, "+a); 
    }
     
    public static void runReference(){
        A a = new A(1);
        A b = a;
        b.id = 2;
        /*
         * 변수 b에 담긴 인스턴스의 id 값을 2로 변경 했을뿐인데 a.id 값도 2가 되었음 
         * 변수 b와 변수 a에 담긴 인스턴스가 서로 같다 
         * */
        System.out.println("runReference, "+a.id);      
    }
 
    public static void main(String[] args) {
        runValue();
        runReference(); 
    }
 
}