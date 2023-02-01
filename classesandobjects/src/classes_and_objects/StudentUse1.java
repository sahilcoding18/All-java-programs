package classes_and_objects;
class Student1{
    String name;
    int rollNo;
    Student1(int num){
    rollNo = num;
    }   
    public void print(){
    System.out.print(name +" " + rollNo+" ");
    }
}

public class StudentUse1 {
    public static void main(String[] args) {
    Student1 s = new Student1(12);
    s.print();
    }
}   