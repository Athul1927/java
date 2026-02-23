import java.util.*;

public class symmetricmatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int r = sc.nextInt();

        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int a[][] = new int[r][c];


        System.out.println("Enter matrix elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }

         System.out.println("The Matrix is:");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }

        if(r != c)
        {
            System.out.println("Matrix is not Symmetric (Not a square matrix)");
            return;
        }
        
        else{
            boolean flag = true;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(a[i][j] != a[j][i]){
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }

            if(flag){
                System.out.println("Matrix is Symmetric");
            }else{
                System.out.println("Matrix is not Symmetric");
            }
        }
    }
}