package org.opentutorial.javatutorial.generic3;

abstract class Info{
    public abstract int getLevel();
}
class EmployeeInfo extends Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
// Person의 T는 info 클래스나 그 자식 외에는 올 수 없다. 
class Person<T extends Info>{
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person p1 = new Person(new EmployeeInfo(1));
//        Person<String> p2 = new Person<String>("부장");
    }
}