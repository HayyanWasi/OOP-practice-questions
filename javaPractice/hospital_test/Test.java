class Patient{
    String name;
    int age;
    String disease;
    int RoomNumber;

    
    //non parameterzied constructor
    Patient(){

    }

    //parameterized constructor
    Patient(String name, int age, String disease, int RoomNumber ){
        System.out.println("cons 2 called");
        this.name  = name;
        this.age = age;
        this.disease = disease;
        this.RoomNumber = RoomNumber;

    }
    public void printPatientInfo(){
        System.out.println(this.RoomNumber);
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.disease);
    }

    //copy constructor
    Patient(Patient p3){
        System.out.println("cons 3 called");
        this.name = p3.name;
        this.age = p3.age;
        this.RoomNumber = p3.RoomNumber;
        this.disease = p3.disease;
    }
}
public class Test{
    public static void main(String[] args) {
        
        //assigning default values
        Patient p1 = new Patient();
        p1.name = "Aftab";
        p1.age = 12;
        p1.disease = "fever";
        p1.RoomNumber = 1;

        Patient p2 = new Patient("John", 19, "cough", 190);
        Patient p3 = new Patient(p2);
        
        
        p2.disease = "cancer";
        System.out.println("p2 changed disease"+p2.disease);
        p2.printPatientInfo();
        
        
        System.out.println("p3 should be coughing ");
        p3.printPatientInfo();

    }

}