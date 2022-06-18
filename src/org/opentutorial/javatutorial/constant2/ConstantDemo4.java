package org.opentutorial.javatutorial.constant2;

enum Fruit4 {
	// 상수를 선언하면서 동시에 생성자를 호출 
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    
    // 생성자의 매개변수로 전달된 값은 this.color를 통해서 5행의 인스턴스 변수의 값으로 할당된다. 
    Fruit4(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    
    String getColor() {
    	return this.color;
    }
}
 
enum Company4{
    GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo4 {

	public static void main(String[] args) {
		/*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit4 type = Fruit4.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, "+Fruit4.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34+" kcal"+Fruit4.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93+" kcal"+Fruit4.BANANA.getColor());
                break;
        }

	}

}
