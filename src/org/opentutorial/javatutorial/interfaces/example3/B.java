package org.opentutorial.javatutorial.interfaces.example3;

interface I3{
    public void x();
}
// 인터페이스 상속 가능 
interface I4 extends I3{
    public void z();
}
 
class B implements I4{
    public void x(){}
    public void z(){}   
}

interface I5{
	// 인터페이스 멤버는 반드시 public
//    private void x();
}

/*
 * abstract vs interface 
 * interface : 클래스 x, 고유한 형태를 가짐, 구체적인 로직이나 상태를 가질수 없어 
 * abstract : 일반적인 클래스, 구체적인 클래스 가지고 있을수 있어  
 */