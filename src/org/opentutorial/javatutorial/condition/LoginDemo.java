package org.opentutorial.javatutorial.condition;

public class LoginDemo {

	public static void main(String[] args) {
		// terminal에서 /java_tutorial/bin
		// java org.opentutorial.condition.LoginDemo egoing
		String id = args[0];
		if(id.equals("egoing")){
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
	}

}
