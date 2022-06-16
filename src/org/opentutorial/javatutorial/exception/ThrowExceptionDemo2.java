package org.opentutorial.javatutorial.exception;

import java.io.*;
class B2{ //B.run이 예외 처리를 직접 하지 않고 다음 사용자 C.run에게 넘긴다 
    void run() throws IOException, FileNotFoundException{ // 예외 발생 시 B.run의 사용자에게 예외처리위임 
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C2{
    void run(){
        B2 b = new B2();
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class ThrowExceptionDemo2 {
    public static void main(String[] args) {
         C2 c = new C2();
         c.run();
    }   
}
