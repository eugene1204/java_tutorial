package or.opentutorial.javatutorial.numberstring;

public class CharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("생활코딩 ");
//		System.out.println('생활코딩 '); // 에러발생 - 문자열이라서
		System.out.println("생"); // 에러발생x -> 문자열일 수도 있기 때문
		System.out.println("생활코딩 "+"입니다.");
		System.out.println("1"+"2"); // 숫자아니고 문자열 1,2 
		
//		문자인 "을 사용하고 싶을 때 
//		System.out.println("egoing said "Welcome programming world""); // 에러 
		System.out.println("egoing said \"Welcome programming world\"");
		System.out.println("egoing said \n \"Welcome programming world\""); // 줄바꿈 
		
	}

}
