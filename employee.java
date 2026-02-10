import java.util.*;
public class employee
{
    int id;
    String name;
    float salary;
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ID :");
        id = sc.nextInt();
        System.out.print("Enter Name :");
        name = sc.next();
        System.out.print("Enter monthly salary " );
        salary = sc.nextFloat();
    }
    public void display()
    {
        System.out.println("Employ id is " + id);
        System.out.println("Employ name " + name);
        System.out.println("Employ salary " + salary * 12);

    }
    public static void main(String args[])
    {
        employee e1 = new employee();
        e1.get();
        e1.display();

       employee e2 = new employee();
        e2.get();
        e2.display();

        employee e3 = new employee();
        e3.get();
        e3.display();

    }
}