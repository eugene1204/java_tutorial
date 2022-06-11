package org.opentutorial.javatutorial.scope;

public class ScopeDemo4 {

	static void a(){
        String title = "coding everybody";
        // title은 a 메소드 안에서만 유효함 
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title);
        
    }

}
