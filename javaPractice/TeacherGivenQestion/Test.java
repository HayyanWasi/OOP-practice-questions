class CollegeCourse{
    private String department;
    private int courseNumber;
    private int credits;
    private double fee;

    CollegeCourse(String depatment, int courseNumber, double fee){
        this.department=depatment;
        this.courseNumber=courseNumber;
        this.fee=fee;
    }
 
    public String getDepartment() {
        return department;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public int getCredits() {
        return credits;
    }

    public double getFee() {
        return fee;
    }

    public void calcFee(){

    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCredits(int credits) {
        this.credits = credits;
        calculateFee();
    }

    private void calculateFee() {
        this.fee = this.credits * 4000;
    }

     public void display() {
        System.out.println("Department: " + department);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Credits: " + credits);
        System.out.println("Fee: Rs." + fee);
    }

}

class LabCourse extends CollegeCourse{
    LabCourse(String department, int courseNumber, int credits){
        super(department, courseNumber, credits);
        setLabFee();
    }
     public void setLabFee(double totalFee) {
         totalFee = getFee() + 3000;
         setTotalFee(totalFee);


    }
    private void setTotalFee(double fee) {
        try {
            java.lang.reflect.Field feeField = CollegeCourse.class.getDeclaredField("fee");
            feeField.setAccessible(true);
            feeField.set(this, fee);
        } catch (Exception e) {
            System.out.println("Error setting fee: " + e.getMessage());
        }
    }
}


public class Test {
    public static void main(String[] args) {
        
    }
}
