class Person{ //Base class
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(){}

    public void printInfo(){
        System.out.println("name is" +name);
        System.out.println("age is" +age);
    }

}

class Student extends Person{
    int rollNo;
    String course;

    Student(String course, int rollNo, int age, String name){
        super(name, age);
        this.course = course;
        this.rollNo = rollNo;

    }
    //mthd overloading
       public void printInfo(String title) {
        System.out.println(title);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
    
    //mthd overriding
    public void printInfo(String name, int age, int rollNo, String course){
        System.out.println("name is "+ super.name);
        System.out.println("age is "+ super.age);
        System.out.println("rollNo is "+ rollNo);
        System.out.println("course is "+ course);
        System.out.println("");
    }
    
}

class Teacher extends Person{
    String subject;
    double salary;

    Teacher(String subject, double salary, String name, int age){
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println("Teacher info");
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println("subject is "+subject);
        System.out.println("salary is "+salary);
    }

}

public class Test{
    public static void main(String[] args) {
        Student s1 = new Student("English", 265, 19, "Hayyan" );
        s1.printInfo();

        Teacher t1 = new Teacher("OOPS", 15000, "Ayesha", 50);
        t1.printInfo();

        Person p1 = new Student("Physics", 22, 102, "Hassan");
        p1.printInfo(); // Will call Student's printInfo() because of overriding

        Person p2 = new Teacher("Chemitry", 45, "Imran", 70000);
        p2.printInfo(); // Will call Teacher's printInfo()
    }
}
