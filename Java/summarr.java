import java.util.*;
class summarr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter the number of rows and columns of the matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        int A[][]=new int[m][n];
        int B[][]=new int[m][n];
        int S[][]=new int[m][n];
        System.out.println("The matrix elements are :");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                B[i][j]=sc.nextInt();
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                S[i][j]=A[i][j]+B[i][j];
                System.out.print(S[i][j]+"\t");
            }
            System.out.println();
        }
    }
}