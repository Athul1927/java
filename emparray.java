import java.util.*;
public class emparray
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
        int i,n=3;
        int No;
        emparray emp[] = new emparray[n];
        for(i=0;i<n;i++){
            emp[i] = new emparray();
            emp[i].get(); 
        }
        System.out.println("Search");
        while (true) {
            Scanner sc= new Scanner (System.in);
            System.out.print("Enter ID :");
            No = Integer.parseInt(sc.nextLine());
            for(i=0;i<n;i++){
                if(emp[i].id == No){
                    emp[i].display();
                    break;
                }
            }
        }


    }
}
    