package Practice.Array.TwoDArray.TwoDarray_1.Assignment_01;

import java.util.Scanner;

public class Diagonal_non_zero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Row: ");
        int n=sc.nextInt();
        System.out.println("Column: ");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("enter the input: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j || i+j==n-1) {
                    if (arr[i][j] == 0) {
                        System.out.println("False");
                        return;
                    }
                }
                    else {
                        if (arr[i][j]!=0){
                            System.out.println("False");
                            return;
                        }
                    }
                }

        }
        System.out.println("True");
    }
}
