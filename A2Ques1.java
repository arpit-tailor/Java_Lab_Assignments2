//Problem 1: Student Result Management using Class and Object
//Problem Statement
//Create a Java program to manage the academic details of a student. Create a class Student with the
//        following data members:
//         rollNo
// name
// marks1
// marks2
// marks3
//Create methods to:
//        1. Accept student details.
//2. Calculate total marks.
//3. Calculate percentage.
//        4. Display the student's result.
//        5. Determine the grade using the following criteria:
//Percentage Grade
//90 and above A+
//        80–89 A
//70–79 B
//60–69 C
//50–59 D
//Below 50 F
//Create at least two Student objects and display their results.
//Concepts Practiced
// Class
// Object
// Data members
// Member methods
// Object creation
// if-else


class Student{
    int rollNo;
    String name;
    int marks1;
    int marks2;
    int marks3;

    public void setDetails(int r,String n,int m1,int m2,int m3){
        this.rollNo=r;
        this.name=n;
        this.marks1=m1;
        this.marks2=m2;
        this.marks3=m3;
    }

    public int CalculateMarks(){
        return marks1+marks2+marks3;
    }

    public float CalculatePercent(){
        float percent = (marks1+marks2+marks3)/3f;
        return percent;
    }

    public String grade(){

        float percent = CalculatePercent();
        String grade = "A+";
        if(percent >= 90){
            grade = "A+";
        }
        else if(percent < 90 && percent >= 80){
            grade = "A";
        }

        else if(percent < 80 && percent >= 70){
            grade = "B";
        }

        else if(percent < 70 && percent >= 60){
            grade = "C";
        }

        else if(percent < 60 && percent >= 50){
            grade = "D";
        }

        else if(percent < 50){
            grade = "F";
        }

        return grade;
    }

    public void DisplayResult(){
        System.out.println("Roll No.: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Marks 1: "+marks1);
        System.out.println("Marks 2: "+marks2);
        System.out.println("Marks 3: "+marks3);
        System.out.println("Total Marks : "+CalculateMarks());
        System.out.println("Percent: "+CalculatePercent());
        System.out.println("Final Grade: "+grade());
    }
}
public class A2Ques1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails(11,"Milan",67,90,94);
        s1.DisplayResult();

        Student s2 = new Student();
        s2.setDetails(11,"Tailor",23,51,58);
        s2.DisplayResult();
    }
}
