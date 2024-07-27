import java.util.*;
import java.io.*;
class MatrixMul_m2
{
    static int MAX=100;
    
    
    // Function to print matrix
    static void printMatrix(int M[][],int rowSize,int colSize)
    {
        for(int i=0;i<rowSize;i++)
        {
            for(int j=0;j<colSize;j++)
            {
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    } 
    
    
    // Function to multiply two matrices
    static void multiplyMatrix(int row1,int col1,int A[][],int row2,int col2,int B[][])
    {
        int i,j,k;
        
        // Matrix to store the result
        int C[][]=new int[MAX][MAX];
        
        // check if multiplication is possible
       // To multiply any 2 matrices [no.of columns of 1st matrix == no.of rows of 2nd matrix]
        if(col1 != row2)
        {
            System.out.println("Multiplication not possible");
            return;
        }
        
        // multiply the two matrices
        // Resultant matrix size [no.of rows of 1st matrix and no.of columns of 2nd matrix]
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col2;j++)
            {
                C[i][j]=0;
                // k value should be either no.of columns of 1st matrix (or) no.of rows of 2nd matrix
                for(k=0;k<=row2;k++)
                {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        // Print the result
        System.out.println();
        System.out.println("Resultant matrix:");
        printMatrix(C,row1,col2);
        
    }
    
    
    // Main function
    public static void main(String args[])
    {
        
        
        Scanner sc=new Scanner(System.in);    
        int m1rowsize,m1colsize,m2rowsize,m2colsize,i,j;
        int A[][]=new int[MAX][MAX];
        int B[][]=new int[MAX][MAX];
        
        // Read size of matrix A from user
        System.out.println("Enter the row size of 1st matrix:");
        m1rowsize=sc.nextInt();
        System.out.println("Enter the column size of 1st matrix:");
        m1colsize=sc.nextInt();
        
        // Read the elements of matrix A from user
        for(i=0;i<m1rowsize;i++)
        {
            for(j=0;j<m1colsize;j++)
            {
                System.out.println("A["+ i +"]["+ j +"]: ");
                A[i][j]=sc.nextInt();
            }
        }
        
        
         // Read size of matrix B from user
        System.out.println("Enter the row size of 2nd matrix:");
        m2rowsize=sc.nextInt();
        System.out.println("Enter the column size of 2nd matrix:");
        m2colsize=sc.nextInt();
        
        // Read the elements of matrix B from user
        for(i=0;i<m2rowsize;i++)
        {
            for(j=0;j<m2colsize;j++)
            {
                System.out.println("B["+ i +"]["+ j +"]: ");
                B[i][j]=sc.nextInt();
            }
        }
        
        // print the first matrix
        System.out.println();
        System.out.println("First Matrix:");
        printMatrix(A,m1rowsize,m1colsize);
        
         // print the Second matrix
        System.out.println();
        System.out.println("Second Matrix:");
        printMatrix(B,m2rowsize,m2colsize);
        
        // Find the product of two matrices
        multiplyMatrix(m1rowsize,m1colsize,A,m2rowsize,m2colsize,B);
        
        
    }



}
