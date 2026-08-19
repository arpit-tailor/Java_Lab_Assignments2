/*Problem 4: Employee Salary System using Abstract Class
Problem Statement
Develop a Java program for calculating the salary of different types of employees. Create an abstract
class Employee containing:
         employeeId
 employeeName
 basicSalary
and the following abstract method:
abstract double calculateSalary();
Create two subclasses:
        1. PermanentEmployee
Salary calculation:
HRA = 20% of Basic Salary
        DA = 40% of Basic Salary
PF = 12% of Basic Salary
Gross Salary = Basic + HRA + DA
Net Salary = Gross Salary - PF
2. ContractEmployee
Salary calculation:
Gross Salary = Basic Salary + 10% Allowance
The program should:
        1. Accept employee details.
2. Calculate salary according to employee type.
        3. Display employee information and calculated salary.
Concepts Practiced
 Abstract class
 Abstract methods
 Inheritance
 Method overriding

 Constructors
 Runtime polymorphism
Challenge
Use an Employee reference:
Employee e;
e = new PermanentEmployee(...);
System.out.println(e.calculateSalary());
e = new ContractEmployee(...);
System.out.println(e.calculateSalary());*/


import java.io.*;
abstract class Employee{
    int employeeId;
    String employeeName;
    double basicSalary;

    Employee(int id, String name , double salary){
        employeeId = id;
        employeeName = name;
        basicSalary = salary;
    }

    abstract double calculateSalary();
}



class PermanentEmployee extends Employee{
    PermanentEmployee(int id, String name , double salary){
        super(id,name,salary);
    }

    public double calculateSalary(){
        double HRA = 0.2*basicSalary;
        double DA = 0.4*basicSalary;
        double PF = 0.12*basicSalary;
        double Gross_Salary = basicSalary+HRA+DA;
        double netSalary = Gross_Salary-PF;

        return netSalary;
    }

    public void displayDetails(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Salary: "+basicSalary);

        System.out.println("Net Salary:"+calculateSalary());
    }
}

class contractEmployee extends Employee{

    contractEmployee(int id, String name , double salary){
        super(id,name,salary);
    }

    public double calculateSalary(){
        double allowance = 0.1*basicSalary;
        double grossSalary = basicSalary+allowance;

        return grossSalary;
    }

    public void displayDetails2(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Salary: "+basicSalary);

        System.out.println("Gross Salary:"+calculateSalary());
    }
}
public class A2Ques4 {
    public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("For Permanent Employee:");
        System.out.println("Enter Employee ID:");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter Employee Name:");
        String name = br.readLine();

        System.out.println("Enter Employee Basic Salary:");
        double basicSalary = Double.parseDouble(br.readLine());

        PermanentEmployee obj = new PermanentEmployee(id,name,basicSalary);

        obj.displayDetails();



        System.out.println("For temporary Employee:");
        System.out.println("Enter Employee ID:");
        int id1 = Integer.parseInt(br.readLine());

        System.out.println("Enter Employee Name:");
        String name1 = br.readLine();

        System.out.println("Enter Employee Basic Salary:");
        double basicSalary1 = Double.parseDouble(br.readLine());

        contractEmployee obj2 = new contractEmployee(id1,name1,basicSalary1);

        obj2.displayDetails2();


        // Challenge --->
//        Employee e = new PermanentEmployee(10,"Milan",9000);
//        System.out.println(e.calculateSalary());
//
//        Employee e2 = new contractEmployee(11,"Dinesh",1000);
//        System.out.println(e2.calculateSalary());

    }
}
