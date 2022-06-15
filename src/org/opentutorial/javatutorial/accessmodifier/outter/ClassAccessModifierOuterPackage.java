package org.opentutorial.javatutorial.accessmodifier.outter;
import org.opentutorial.javatutorial.accessmodifier.inner.*;
public class ClassAccessModifierOuterPackage {
	
	PublicClass publicClass = new PublicClass();
	//DefaultClass는 다른패키지에서사용불가 
    //DefaultClass defaultClass = new DefaultClass();
}
