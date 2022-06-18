package org.opentutorial.javatutorial.generic;

class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
// StudentPerson, EmployeePerson 사실상 같은 구조 
/*
class StudentPerson{
    public StudentInfo info;
    StudentPerson(StudentInfo info){ this.info = info; }
}

class EmployeePerson{
    public EmployeeInfo info;
    EmployeePerson(EmployeeInfo info){ this.info = info; }
}
*/
/*
class Person{
    public Object info;
    // 생성자의 매개 변수 info의 데이터 타입이 Object. 모든객체가 될수 있음 
    // but, 안전하지 않을 수 있음 
    Person(Object info){ this.info = info; }
}
*/ 

class Person2<T>{
    public T info;
    Person2(T info){ this.info = info; }
}

public class GenericDemo2 {
	public static void main(String[] args) {
		/*
        StudentInfo si = new StudentInfo(2);
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade); // 2
        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank); // 1
        */
		
		/*
		Person p1 = new Person("부장");
        EmployeeInfo ei = (EmployeeInfo)p1.info;
        System.out.println(ei.rank);
        */
		
		Person2<EmployeeInfo> p1 = new Person2<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = p1.info;
        System.out.println(ei1.rank); // 성공
         
        Person2<String> p2 = new Person2<String>("부장");
        String ei2 = p2.info;
//        System.out.println(ei2.rank); // 컴파일 실패, String은 rank 필드 없어 
        
        /*
         * 제네릭 특징 
         * - 컴파일 단계에서 오류가 검출 
         * - 중복의 제거와 타입 안전성을 동시에 추구 가능 
         * */
		
    }

}
