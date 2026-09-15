class Student{
    int studentId = 100;
    String studentName = "Kumar";
    double StudentFee = 10000.0;
    boolean isPass = true;
    
    public void displayStudent(){
        System.out.println("Student ID : "+ studentId);
        System.out.println("Student Name : "+ studentName);
        System.out.println("Student Fee : " + StudentFee);
        System.out.println("Student Result : " + isPass);
    }
}

public class ClassAndObjectExample{
    public static void main(String[] args){
        Student st = new Student();
        
        st.displayStudent();
    }
}