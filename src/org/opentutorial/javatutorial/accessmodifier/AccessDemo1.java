package org.opentutorial.javatutorial.accessmodifier;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){ // A 클래스 밖에서는 접근 할 수 없다는 의미 
        return "public void z()";
    }
    public String x(){
        return z();
    }
}

public class AccessDemo1 {

	public static void main(String[] args) {
		A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());
        System.out.println(a.x());


	}

}
