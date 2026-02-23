import java.util.*;
public class martixadd 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrix : ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println("Enter the number of rows and columns of the second matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[p][q];
        int b[][] = new int[m][n];
        int c[][] = new int[p][q];
        if(p==m && q==n)
        {

           
            System.out.println("Enter the elements of first matrix: ");
            for(int i=0;i<p;i++)
            {
                 for(int j=0;j<q;j++)
                {
                    a[i][j]= sc.nextInt();
                }
                

            }
            System.out.println("Enter the elements of second matrix:  ");
             for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    b[i][j]= sc.nextInt();
                }
               
            }
            /*displaying first martix */
            System.out.println("The first matrix is: ");
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
            
                {

                    System.out.print(a[i][j]+ " ");
                }
                    System.out.println();
            }



            System.out.println("The second matrix is: ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
            
                {
                    System.out.print(b[i][j]+ "");   
                }    
                System.out.println();
            }
            

            System.out.println("sum of two martix is: ");
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];

                }
            }


            System.out.println("The resultent matrix: ");
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
            
                {
                    System.out.print(c[i][j]+ "\t");   
                }    
                System.out.println();
            }









        } 
        else 
        {
            System.out.println("Matrix order is not correct: ");
        }

    }
    
}
