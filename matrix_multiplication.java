import java.util.*;
public class matrix_multiplication {
  /*this program as the program statement said works on the NXN matrix only  this program consists of matrix transpose and matrix multiplication functions in it */
  public static void main(String args[]){
        
    System.out.print("Enter  size of matrix(if 3X3 needed enter 3 or 4X4 needed then enter 4) : ");
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
   
    int columns=rows;
    int n=rows;
    
     
     
    int twoD[][]=new int[rows][columns];
    int twoD1[][]=new int[rows][columns];
System.out.println("Enter array elements for first matrix : ");
    
    for(int i=0; i<rows;i++)
      {            
         for(int j=0; j<columns;j++)
         {
             twoD[i][j]=sc.nextInt();
         }
      }
 System.out.println("Enter array elements for second matrix : ");
      for(int i=0; i<rows;i++)
      {            
         for(int j=0; j<columns;j++)
         {
             twoD1[i][j]=sc.nextInt();
         }
      }
      sc.close();
   System.out.println("data entered in first matrix: ");   
   printList(twoD);
    System.out.println("data entered in second matrix: ");   
   printList(twoD1);
    System.out.println("Transpose of first Matrix: ");   
   transpose(twoD,n);
    System.out.println("Transpose of second  Matrix: ");   
   transpose(twoD1,n);
     
   int[][] c=new int[rows][columns];
    System.out.println("Multiplication of both transposed Matrix: ");   
   multiply(twoD,twoD1,c,n);
   
    
 }
 public static void transpose(int matrix[][], int n)
 {
     for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
             int temp=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=temp;
         }
     }
      printList(matrix);
     
     
 }
 public static void multiply(int A[][], int B[][], int C[][], int N)
     {
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                C[i][j]=0;
                for(int k=0;k<N;k++){
                C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        printList(C);
         
     }
    
 public static void printList(int[][] twoD){
      
     for(int []x:twoD){
         for(int y:x){
         System.out.print(y+" ");
         }
         System.out.println();
     }
     
 }

  
}
