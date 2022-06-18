package org.opentutorial.javatutorial.generic2;


class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info;
        this.id = id;
    }
    
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);
        // 제네릭은 참조 데이터 타입에 대해서만 사용할 수 있다. 기본 데이터 타입에서는사용못해 
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
        System.out.println(p1.id.intValue());
        p1.<EmployeeInfo>printInfo(e);
        p1.printInfo(e);
        p1.<EmployeeInfo>printInfo(e);
        p1.printInfo(e);
    }
}

