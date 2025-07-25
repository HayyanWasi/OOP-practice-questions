class Person{
    String name;
    int age;


    //constructor
    Person(){
    }

    //parameterized constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void personInfo(){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
    }
}

class Student extends Person{
    String rollNo;
    String course;

    Student(){
        super.name =name; 
        super.age = age;
    }

    Student(String name, int age, String rollNo, String course){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.course = course;
    }
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
        this.rollNo = s1.rollNo;
        this.course = s1.course;

    }

    public void personInfo(){
        System.out.println("Student's information");
        System.out.println("student name is "+name);
        System.out.println("student age is "+age);
        System.out.println("student roll Number is "+rollNo);
        System.out.println("student course is "+course);
        System.out.println("\n");


    }
}

class Teacher extends Person{
    String field;
    String salary;

    Teacher(){
        super.name = name;
        super.age = age;
    }
    Teacher(String name, int age, String field, String salary ){
        this.name = name;
        this.age = age;
        this.field = field;
        this.salary = salary;
    }

    public void personInfo(){
        System.out.println("Teachers information");
        System.out.println("Teacher name is "+name);
        System.out.println("Teacher age is "+age);
        System.out.println("Teacher field is "+field);
        System.out.println("Teacher salary is "+salary);
        System.out.println("\n");
    }
}

public class Test{
    public static void main(String[] args) {
        
    Student s1 = new Student("Hayyan" , 19, "265", "OOP");
    System.out.println("unchange details");
    s1.personInfo();
    Student s2 = new Student(s1);

    System.out.println("changed roll number");
    s1.rollNo = "264";
    s2.personInfo();




    Teacher t1 = new Teacher("Ali", 60, "English", "10000");
    t1.personInfo();
    }
}