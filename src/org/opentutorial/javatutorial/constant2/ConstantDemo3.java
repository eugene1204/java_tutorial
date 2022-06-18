package org.opentutorial.javatutorial.constant2;

/*
 * enum을 사용하는 이유
 * - 코드가 단순해진다. 
 * - 인스턴스 생성과 상속을 방지한다. 
 * - 키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼수 있다. 
 * - 열거형으로 연관된 값을 저장한다, 값들이 변경되지 않도록 보장한다. 
 * - 열거형 자체가 클래스이기 때문에 열거형 내부에 생성자, 필드, 메소드를 가질 수 있어 단순한 상수가 아니라 더 많은 역할을 할수있다. 
 * 
 * */
enum Fruit3{ // 사실상 class
    APPLE, PEACH, BANANA;
	Fruit3(){
		System.out.println("Call Constructor" + this);
	}
	
	/*
	 * 에러, enum의 생성자가 접근 제어자 private만을 허용하기 때문이다. 
	 * public Fruit3(){
		System.out.println("Call Constructor" + this);
		}
	 * */
}

/*
 * 생성자의 접근제어자가 private -> Fruit를 인스턴스로 만들수 없다, 다른용도로 사용하는것을 금한다. 
 * class Fruit{
    public static final Fruit APPLE  = new Fruit();
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
    private Fruit(){}
	}
 * */
enum Company3{
    GOOGLE, APPLE, ORACLE;
}
 
public class ConstantDemo3 {
     
    public static void main(String[] args) {
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit3 type = Fruit3.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}