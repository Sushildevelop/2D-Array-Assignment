package Practice.Array.TwoDArray.TwoDarray_1.Assignment_01;

import java.util.Scanner;

public class Upper_half_matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Square Matrix: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("enter the input: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j>=i){
                    System.out.print(arr[i][j]+" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
