interface Employe {

    void display();

    void calculateSalary();

    default void work() {
        System.out.println("working...");
    }

    static void companyPolicy() {
        System.out.println("Company Policy...");
    };

}

abstract class AbstractEmploye implements Employe {

    String name;
    int id;
    double BaseSalary;
    double Bonus = 20000;

    AbstractEmploye(String name, int id, double Bonus, double BaseSalary) {
        this.name = name;
        this.id = id;
        this.BaseSalary = BaseSalary;
        this.Bonus = Bonus;

    }

    @Override
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Manager extends AbstractEmploye {
    Manager(String name, int id, double Bonus, double BaseSalary) {
        super(name, id, Bonus, BaseSalary);
    }

    @Override
    public void calculateSalary() {
        double totalSalary = super.BaseSalary + super.Bonus;
        System.out.println("Manager Salary is: " + totalSalary);

    }

}

class Developer extends AbstractEmploye {
    int perHour;
    int numOfHours;
    double calculatedSalary;

    Developer(String name, int id, int perHour, int numOfHours) {
        super(name, id, 0, 0);
        this.perHour = perHour;
        this.numOfHours = numOfHours;
    }

    @Override
    public void calculateSalary() {
        calculatedSalary = perHour * numOfHours;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Developer Salary is: " + calculatedSalary);
    }
}

public class Test {
    public static void main(String[] args) {
        Employe manager = new Manager("Hayyan", 30, 3000, 40000);
        manager.calculateSalary();
        manager.display();
        manager.work();
        Employe.companyPolicy();

        System.out.println('\n');

        Employe developer = new Developer("Sara", 102, 200, 5);
        developer.calculateSalary();
        developer.display();
        developer.work();
        Employe.companyPolicy();
    }
}
