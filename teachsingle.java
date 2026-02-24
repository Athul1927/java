import java.util.*;
class EmployeeT {
    int empid;
    float salary;
    String name,address;

    EmployeeT(){

    }
    EmployeeT(int empid,String name, float salary, String address){
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends EmployeeT{
    String dept,sub;
    Teacher( int empid,String name, float salary, String address, String dept, String sub){
        super(empid,name,salary,address);
        this.dept = dept;
        this.sub = sub;
    }
    public void display(){
        System.out.println("Teacher ID: " + empid);
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Salary: " + salary);
        System.out.println("Teacher Address: " + address);
        System.out.println("Teacher Department: " + dept);
        System.out.println("Teacher Subject: " + sub);
    }
}
public class teachsingle{
    public static void main(String args[]){
        
        System.out.println("Enter teacher details one by one");
        int tid;
        float tsal;
        String tnam,tadd,tdep,tsub;
        Scanner sc = new Scanner (System.in);
        
            System.out.println("Enter teacher id:");
            tid = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter teacher name:");
            tnam = sc.nextLine();
            System.out.println("Enter teacher salary:");
            tsal = sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter teacher address:");
            tadd = sc.nextLine();
            System.out.println("Enter teacher department:");
            tdep = sc.nextLine();
            System.out.println("Enter teacher subject:");
            tsub = sc.nextLine();
            Teacher t = new Teacher(tid,tnam,tsal,tadd,tdep,tsub);
        
        
        System.out.println("Teacher details:");

        
            t.display();

        
    }
}