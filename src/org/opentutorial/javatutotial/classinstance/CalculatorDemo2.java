package org.opentutorial.javatutotial.classinstance;

class Calculator2 {
	// 클래스 변수의 용도 정리 
	/* 인스터스에 따라서 변하지 않는 값이 필요한 경우(PI)
	 * 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우 
	 * 값의 변경 사항을 모든 인스턴스가 공유해야하는 경우
	 * */
    static double PI = 3.14;
    // 클래스 변수인 base가 추가되었다.
    static int base = 0;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        // 더하기에 base의 값을 포함시킨다.
        System.out.println(this.left + this.right + base);
    }
 
    public void avg() {
        // 평균치에 base의 값을 포함시킨다.
        System.out.println((this.left + this.right + base) / 2);
    }
}
public class CalculatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20);
        // 30 출력
        c1.sum();
 
        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);
        // 60 출력
        c2.sum();
 
        // 클래스 변수 base의 값을 10으로 지정했다.
        Calculator2.base = 10;
 
        // 40 출력
        c1.sum();
 
        // 70 출력
        c2.sum();
	}

}
