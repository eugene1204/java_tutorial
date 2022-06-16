package org.opentutorial.javatutorial.exception;
import java.io.*;

class B{ // B.run이 예외에 대한 책임 
    void run(){
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }       
        
        System.out.println(input); 
    }
}
class C{
    void run(){
        B b = new B();
        b.run();
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();
         c.run();
    }   
}
